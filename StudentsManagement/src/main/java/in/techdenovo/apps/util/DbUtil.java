package in.techdenovo.apps.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    public Connection getConnection(){

        String url="jdbc:mysql://localhost:3306/students_menu";
        String user="root";
        String password="root";

        Connection con = null;
        try{
            con= DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
            System.out.println(e);
        }
        return con;
    }

}
