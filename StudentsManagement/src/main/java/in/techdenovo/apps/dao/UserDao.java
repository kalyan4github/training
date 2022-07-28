package in.techdenovo.apps.dao;

import in.techdenovo.apps.model.User;
import in.techdenovo.apps.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    public User checkLogin(String username, String password){
        DbUtil dbUtil = new DbUtil();
        Connection conn = dbUtil.getConnection();
        User user = null;
        try{
            String query = "SELECT * FROM USERS WHERE USERNAME=? AND PASSWORD=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,username);
            ps.setString(2,password);

            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                user = new User();
                user.setName(rs.getString("name"));
            }
            conn.close();
        }catch (SQLException e){
            System.out.println(e);
        }
        return user;
    }
}
