package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLConnector {
    
    private static String url;
    private static String dbName;
    private static String driver;
    private static String userName;
    private static String pass;
	
    public MySQLConnector(String url, String dbName, String driver, String userName, String pass){
        this.url = url;             //"jdbc:mysql://localhost:3306/"; 
        this.dbName = dbName;       //"CkeckUp";
        this.driver = driver;       //"com.mysql.jdbc.Driver"; 
        this.userName = userName;   //"root"; 
        this.pass = pass;           //"root";
    }
    
    public static Connection getConnection(){	 
        Connection conn = null;
	try {
            Class.forName(driver).newInstance();
            return DriverManager.getConnection(url + dbName, userName, pass);
	} catch (Exception e) {
            e.printStackTrace();
	}
	return conn; 
    }
	
    public static void executeStatement(String statement){
        Connection conn = getConnection();
	ResultSet res = null;
	try {
            Statement st = conn.createStatement();
            st.execute(statement);
            conn.close();
	} catch (SQLException e) {
            e.printStackTrace();
            System.out.println("DB error");
	}
    }
    
    public static ResultSet executeQuery(String query)
    {
            ResultSet result = null;
            Connection conn = MySQLConnector.getConnection();
        try {
            Statement st = conn.createStatement();
            result = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
