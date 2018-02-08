/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.Diagnostico;
import model.entity.TesteClienteGpon;
import model.entity.ValidacaoGpon;

/**
 *
 * @author G0042204
 */
public class CSVUtils {

    private static final char DEFAULT_SEPARATOR = ';';

    public static void writeLine(Writer w, List<String> values) throws IOException {
        writeLine(w, values, DEFAULT_SEPARATOR, ' ');
    }

    public static void writeLine(Writer w, List<String> values, char separators) throws IOException {
        writeLine(w, values, separators, ' ');
    }

    //https://tools.ietf.org/html/rfc4180
    private static String followCVSformat(String value) {

        String result = value;
        if (result.contains("\"")) {
            result = result.replace("\"", "\"\"");
        }

        return result;

    }

    public static void writeLine(Writer w, List<String> values, char separators, char customQuote) throws IOException {

        boolean first = true;

        //default customQuote is empty
        if (separators == ' ') {
            separators = DEFAULT_SEPARATOR;
        }

        StringBuilder sb = new StringBuilder();
        for (String value : values) {
            if (!first) {
                sb.append(separators);
            }
            if (customQuote == ' ') {
                sb.append(followCVSformat(value));
            } else {
                sb.append(customQuote).append(followCVSformat(value)).append(customQuote);
            }

            first = false;
        }
        sb.append("\n");
        String result = sb.toString();
//        String leResult = Charset.forName("UTF-8").decode(Charset.forName("unicode").encode(result)).toString();
        w.append(result);

    }

    public static File toCsv(List<TesteClienteGpon> tests) {

        /**
         * For windows only String csvFile = "C:/tests.csv";
         */
        String OS = System.getProperty("os.name");
        String csvFile;
        if (OS.contains("Windows")) {
            csvFile = "C:/tests.csv";
        } else {
            csvFile = "/tmp/tests.csv";
        }

//        
        FileWriter writer;
        try {
            writer = new FileWriter(csvFile);

            //for header
            List<String> head = new ArrayList<>();

            head.add("Instancia");
            head.add("Status");
            head.add("Lote");
            head.add("Pot OLT");
            head.add("Pot ONT");
            head.add("Serial ONT");
            /**
             *
             */
            for (Diagnostico v : new ValidacaoGpon().getDiagnosticoList()) {
                head.add(v.getNome());
            }

            CSVUtils.writeLine(writer, head);

            for (TesteClienteGpon test : tests) {
                List<String> list = new ArrayList<>();
                // Campos
                list.add(test.getInstancia());
                list.add(test.getStatus().getNome());
                list.add(test.getLote().getId().toString());
                System.out.println(test.getId());

                List<ValidacaoGpon> lValid = test.getValid();
                for (ValidacaoGpon v : lValid) {
                    if (!v.getReteste()) {

                        if (v.getPotOlt() != null) {
                            list.add(v.getPotOlt().toString());
                        } else {
                            list.add("");
                        }
                        if (v.getPotOnt() != null) {
                            list.add(v.getPotOnt().toString());
                        } else {
                            list.add("");
                        }
                        if (v.getOntAssociado() != null) {
                            list.add(v.getOntAssociado());
                        } else {
                            list.add("");
                        }
                        for (Diagnostico d : v.getDiagnosticoList()) {
                            Boolean b = d.getResultado();
                            if (b != null) {
                                list.add(b.toString());
                            } else {
                                list.add("");
                            }
                        }
                    }
                }

                CSVUtils.writeLine(writer, list);
            }

            // Add Line
            writer.flush();
            writer.close();

            return new File(csvFile);
        } catch (IOException ex) {
            Logger.getLogger(CSVUtils.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
