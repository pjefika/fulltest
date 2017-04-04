/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.massivo;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.observer.download.Download;
import br.com.caelum.vraptor.observer.download.DownloadBuilder;
import br.com.caelum.vraptor.view.Results;
import controller.AbstractController;
import dao.massivo.TesteClienteDAO;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import model.entity.Lote;
import model.entity.TesteCliente;
import util.CSVUtils;

/**
 *
 * @author G0034481
 */
@Controller
@RequestScoped
public class TesteClienteController extends AbstractController {

    @Inject
    private TesteClienteDAO testsDAO;

    public TesteClienteController() {
    }

    public void create() {

    }

    @Path("/testecliente/{lote.id}")
    public void export(Lote lote) {
        List<TesteCliente> l = this.testsDAO.listarInstanciasPorLote(lote);
        if (l != null) {
            this.includeSerializer(l);
            //this.result.include("instancias", l);
        }
    }

    @Get("/testecliente/exportSelect/{stringLotes}")
    public Download exportLotesSelect(String stringLotes) {
        List<String> listIdLotes = Arrays.asList(stringLotes.split(";"));
        List<TesteCliente> l = this.testsDAO.listarLotesSelect(listIdLotes);

        try {
            return DownloadBuilder.of(CSVUtils.toCsv(l))
                    .withFileName("export.csv") // opcional, o padrão é File.getName()
                    .withContentType("application/vnd.ms-excel") // optional, não será enviado se nulo
                    .downloadable() // opcional, o padrão é inline content
                    .build();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TesteClienteController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Post
    @Path("/teste/{lote}")
    public void listarTestePorLote(Lote l) {
        try {
            List<TesteCliente> lTestes = testsDAO.listarInstanciasPorLote(l);
            this.includeSerializer(lTestes);
        } catch (Exception e) {
            this.result.use(Results.json()).from(e).serialize();
        }
    }

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).include("valid").include("lote").serialize();
    }
}
