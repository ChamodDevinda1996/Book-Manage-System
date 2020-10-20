
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chamod Devinda
 */
public class DBConnection {
    
    public static Connection connect(){
        
        Connection con = null;
        
    try {
    Class.forName("org.sqlite.JDBC");
    Connection conn=DriverManager.getConnection("jdbc:sqlite:src\\DataBase\\bookReview.db");
    //JOptionPane.showMessageDialog(null,"Connection Success");
    return conn;


    }catch(Exception err){
    JOptionPane.showMessageDialog(null,err);
    return null;
}
    }
    
    
    
    
    
}
