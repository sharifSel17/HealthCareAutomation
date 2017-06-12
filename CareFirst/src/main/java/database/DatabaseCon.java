package database;

import base.CommonAPI;
import java.sql.*;

/**
 * Created by Sharif on 6/7/2017.
 */
public class DatabaseCon extends CommonAPI {
    public Connection getConnection(){
       //Initiate database string
       Connection con = null;
       String url ="jdbc:mysql://localhost:3306/";
       String databaseName = "bos_db";
       String user = "root";
       String password = "";

       try {
           Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException errorResult) {
           System.out.println("Mysql Driver not Found");
           errorResult.printStackTrace();
          // return null;
       }
       try {
           //Declare above variable in bellow for connecting database
           con = DriverManager.getConnection(url+databaseName,user,password);
           String sqlQuery = "Select * from user_info where user_id=55 ";
           Statement statement = con.createStatement();
           ResultSet result = statement.executeQuery(sqlQuery);
           result.next();

           System.out.println(result.getString("user_login_id"));
           System.out.println(result.getString("user_password"));



       } catch (SQLException e) {
           System.out.println("Failed to connect with Database");
           return null;
       }
       if (con != null) {
           System.out.println("Your database connection is Success !!");
           return null;
       } else {
           System.out.println("Your database connection is Failed");
           return null;
       }
   }
}
