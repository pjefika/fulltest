package dao;

import br.net.gvt.efika.fulltest.model.fulltest.Solucao;
import util.DbInfo;
import util.MySqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Tiago Henrique Iwamoto
 * tiago.iwamoto@telefonica.com
 * System Analyst
 * 41 9 9104-6051
 **/
@SuppressWarnings("all")
public class SolucaoDao {

    private String url = "10.200.35.66";
    private String db = "efika";
    private String user = "root";
    private String pass = "pirogue";

    public List<Solucao> findAll(){
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        MySqlConnection mySqlConnection = new MySqlConnection();
        List<Solucao> solucoes = new ArrayList<>();
        try{
            conn = mySqlConnection.getConnection(url,db, user, pass);
            st = mySqlConnection.getSt(conn, "SELECT * FROM tb_problema_solucao");
            rs = st.executeQuery();
            while(rs.next()){
                Solucao solucao = new Solucao(rs.getInt("id"), rs.getString("problema"), rs.getString("solucao"));
                solucoes.add(solucao);
            }
            return solucoes;
        }catch (Exception e){
            return null;
        }finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public Solucao findOne(String problema, Connection conn, MySqlConnection mySqlConnection){

        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            st = mySqlConnection.getSt(conn, "SELECT * FROM XXXX");
            st.setString(1, problema);
            rs = st.executeQuery();
            if(rs.next()){
                Solucao solucao = new Solucao(rs.getString("problema"), rs.getString("solucao"));
                return solucao;
            }else{
                return null;
            }
        }catch (Exception e){
            return null;
        }finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public Solucao update(Solucao solucao){
        Connection conn = null;
        PreparedStatement st = null;
        MySqlConnection mySqlConnection = new MySqlConnection();
        try{
            conn = mySqlConnection.getConnection(url,db, user, pass);
            st = mySqlConnection.getSt(conn, "UPDATE efika SET solucao = ? WHERE id = ?");
            st.setString(1, solucao.getSolucao());
            st.setInt(2, solucao.getId());
            if(st.executeUpdate() > 0){
                return solucao;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //Esta rota deve ficar na queue
    public void isRead(){

    }

}
