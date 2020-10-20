
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chamod Devinda
 */
public interface CommenFunction {
    
     void BookSearch(JTable jTable1);
     
     void BookSearch(JTable jTable1, String Search,String SearchOption);
     
     void UserSearch(JTable jTable1);
        
     void UserSearch(JTable jTable1,String idnumber) ;
     
     
}
