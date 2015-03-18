package db_connection;

public class TXTFile extends File{
    
    public TXTFile(String filename)
    {
        super(filename);
        
        super.setSplit("_");
        super.setURLIndex(0);
        super.setDBIndex(1);
        super.setDriverIndex(2);  
        super.setUserIndex(3);
        super.setPasswordIndex(4);  
        
        super.read();
    }
}
