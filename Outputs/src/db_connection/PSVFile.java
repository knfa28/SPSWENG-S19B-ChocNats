package db_connection;

public class PSVFile extends File{
  
    public PSVFile(String filename)
    {
        super(filename);
        
        super.setSplit(" /|| ");
        super.setURLIndex(0);
        super.setDBIndex(1);
        super.setDriverIndex(2);  
        super.setUserIndex(3);
        super.setPasswordIndex(4);  
        
        super.read();
    }
}
