package db_connection;

public class FileFactory {
    public static File getFile(String filename)
    {
		if(filename.endsWith(".csv"))
			return new CSVFile(filename);
		
		else if(filename.endsWith(".psv"))
	        return new PSVFile(filename);
	
        else if(filename.endsWith(".txt"))
            return new TXTFile(filename);
        
		return null;
    }
}
