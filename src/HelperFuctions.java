
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class HelperFuctions implements CommenFunction{

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public HelperFuctions() {
        con = DBConnection.connect();
        
}
    @Override
    public void BookSearch(JTable jTable1) {
       
        DefaultTableModel res;
            String query="select * from books";

            try {
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();

                while(rs.next()){

                    String BookName=rs.getString("BookName");
                    String Author=rs.getString("Author");
                    String Year=rs.getString("Year");
                    String Idnumber=rs.getString("Idnumber");
                    String price=rs.getString("price");

                    String tbData[] = {BookName,Author,Year,Idnumber,price};

                    DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();

                     tblModel.addRow(tbData);
                    
                }

            } catch (SQLException ex) {
                Logger.getLogger(AdminManageBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }

    @Override
    public void BookSearch(JTable jTable1, String Search,String SearchOption) {
        
            String query="select * from books where "+SearchOption+"=?";

            try {
                ps = con.prepareStatement(query);
                ps.setString(1,Search);
                rs = ps.executeQuery();
                
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.setRowCount(0);
                while(rs.next()){

                    String BookName=rs.getString("BookName");
                    String Author=rs.getString("Author");
                    String Year=rs.getString("Year");
                    String Idnumber=rs.getString("Idnumber");
                    String price=rs.getString("price");
                   
                    String tbData[] = {BookName,Author,Year,Idnumber,price};

                   

                    
                    tblModel.addRow(tbData);

                }
                
            } catch (SQLException ex) {
                Logger.getLogger(AdminManageBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    
    @Override
    public void UserSearch(JTable jTable1) {
            
            
            String query="select * from users";

            try {
                ps = con.prepareStatement(query);
                
                rs = ps.executeQuery();

                while(rs.next()){

                    String userName =rs.getString("userName");
                    String password =rs.getString("password");
                    String Idnumber =rs.getString("Idnumber");
                    String email    =rs.getString("email");
                    String dob      =rs.getString("dob");
                    String address  =rs.getString("address");
                    String mobileNo =rs.getString("mobileNo");

                    String tbData[] = {Idnumber,userName,password,email,dob,address,mobileNo};

                    DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();

                    tblModel.addRow(tbData);

                }

            } catch (SQLException ex) {
                Logger.getLogger(AdminViewComplain.class.getName()).log(Level.SEVERE, null, ex);
                
                
            }
            
        }
        
    @Override
     public void UserSearch(JTable jTable1,String idnumber) {
            
            String query="select * from users where idNumber=?";

            try {
                ps = con.prepareStatement(query);
                ps.setString(1,idnumber);
                rs = ps.executeQuery();

                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.setRowCount(0);
                while(rs.next()){

                    String userName =rs.getString("userName");
                    String password =rs.getString("password");
                    String Idnumber =rs.getString("Idnumber");
                    String email    =rs.getString("email");
                    String dob      =rs.getString("dob");
                    String address  =rs.getString("address");
                    String mobileNo =rs.getString("mobileNo");

                   
                    
                    
                    String tbData[] = {Idnumber,userName,password,email,dob,address,mobileNo};

                    

                    tblModel.addRow(tbData);

                }
                
                
        
            } catch (SQLException ex) {
                Logger.getLogger(AdminViewComplain.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
    
}
