package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Tiago Henrique Iwamoto
 * tiago.iwamoto@telefonica.com
 * System Analyst
 * 41 9 9513-0230
 **/
public class DbConnTdd {

    public static void main(String[] args) {
        MySqlConnection connection = new MySqlConnection();
        ResultSet rs = null;
        PreparedStatement st = null;
        Connection conn = null;
        try{
            conn = connection.getConnection();
            st = connection.getSt(conn, "SELECT * FROM DW_020_RADACCT WHERE designador = ?");
            st.setString(1, "CTA-81HRZBDSJ-013");
            rs = st.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
