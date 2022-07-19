package in.techdenovo.apps.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    public Connection getConnection(){

        String url="jdbc:mysql://192.168.1.6:3306/students_menu";
        String user="students_menu";
        String password="students_menu";

        Connection con = null;
        try{
            con= DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
            System.out.println(e);
        }
        return con;
    }

}
