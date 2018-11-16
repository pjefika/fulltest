package util;

import br.net.gvt.efika.fulltest.model.fulltest.Solucao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Tiago Henrique Iwamoto
 * tiago.iwamoto@telefonica.com
 * System Analyst
 * 41 9 9513-0230
 **/
public class DbConnTdd {

    public static void main(String[] args) {
        MySqlConnection mySqlConnection = new MySqlConnection();
        ResultSet rs = null;
        PreparedStatement st = null;
        Connection conn = null;
        List<Solucao> solucoes = new ArrayList<>();
        try{
            conn = mySqlConnection.getConnection("10.40.197.137", "MacAddress", new DbInfo().getUser(), new DbInfo().getPass());
            st = mySqlConnection.getSt(conn, "SELECT * FROM DW_020_RADACCT WHERE designador = ?");
            st.setString(1, "CTA-81HRZBDSJ-013");
            rs = st.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
//            conn = mySqlConnection.getConnection("10.200.35.66","efika", "root", "pirogue");
//            st = mySqlConnection.getSt(conn, "SELECT * FROM tb_problema_solucao");
//            rs = st.executeQuery();
//            while(rs.next()){
//                Solucao solucao = new Solucao(rs.getString("problema"), rs.getString("solucao"));
//                solucoes.add(solucao);
//            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
