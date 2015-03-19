package control;

import javax.swing.JOptionPane;

import db_connection.File;
import db_connection.FileFactory;
import view.LoginView;

public class CheckUp {
    public static void main(String[] args){
	File file = FileFactory.getFile("src/config/config.csv");
	if(file.getConnector().getConnection() != null)
            new MainController();
	else
            JOptionPane.showMessageDialog(null, "Error connecting to MySQL!", "Message", JOptionPane.ERROR_MESSAGE);
	}
}
