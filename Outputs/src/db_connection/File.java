package db_connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {
    private String filename;
    private String splitBy;
    private int urlIndex;
    private int dbIndex;
    private int driverIndex;
    private int userIndex;
    private int passIndex;
    private boolean isConnected;
    private MySQLConnector connect;
    
    public File(String filename){
        this.filename = filename;
        this.isConnected = false;
    }
    
    public void setSplit(String splitBy){
        this.splitBy = splitBy;
    }
    
    public void setURLIndex(int urlIndex){
        this.urlIndex = urlIndex;
    }
    
    public void setDBIndex(int dbIndex){
        this.dbIndex = dbIndex;
    }
    
    public void setDriverIndex(int driverIndex){
        this.driverIndex = driverIndex;
    }
    
    public void setUserIndex(int userIndex){
        this.userIndex = userIndex;
    }
    
    public void setPasswordIndex(int passIndex){
        this.passIndex = passIndex;
    }
    
    public void read(){
        Path path = Paths.get(filename);
        Charset cs = StandardCharsets.UTF_8;
        String temp;
		
        try(BufferedReader reader = Files.newBufferedReader(path, cs)){
            while((temp = reader.readLine()) != null){
                String[] info = temp.split(splitBy);
                
                connect = new MySQLConnector(info[urlIndex], info[dbIndex], info[driverIndex], info[userIndex], info[passIndex]);
        	//connect = new MySQLConnector("jdbc:mysql://localhost:3306/", "checkup",  "com.mysql.jdbc.Driver", "root", "p@ssword");
            
        		if(connect.getConnection() != null)
                    isConnected = true;
                else isConnected = false;
            }			
      	} catch(IOException x){
            System.err.println(x);
      	}
    }
	
    public MySQLConnector getConnector(){
    	if(isConnected)
            return connect;
        
        return null;
    }
}
