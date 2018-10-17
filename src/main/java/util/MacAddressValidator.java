package util;

import model.MacAddress;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Tiago Henrique Iwamoto
 * tiago.iwamoto@telefonica.com
 * System Analyst
 * 41 9 9513-0230
 **/
@SuppressWarnings("all")
public class MacAddressValidator {
    public MacAddress macChanged(String designador){
        MySqlConnection connection = new MySqlConnection();
        ResultSet rs = null;
        PreparedStatement st = null;
        Connection conn = null;
        try{
            conn = connection.getConnection();
            st = connection.getSt(conn, "SELECT * FROM DW_020_RADACCT WHERE DESIGNADOR = ? ORDER BY ID DESC limit 1");
            st.setString(1, designador);
            rs = st.executeQuery();
            if (rs.next()){
                return new MacAddress(
                        rs.getTimestamp("DT_TIMESTAMP"),
                        rs.getString("DESIGNADOR"),
                        rs.getString("MAC_ADDR"));
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try{
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();
                }
                if(conn != null){
                    conn.close();
                }
            }catch (Exception ex){
                ex.getMessage();
            }
        }
    }
}
