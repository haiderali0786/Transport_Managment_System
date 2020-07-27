/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alitransport;

import java.sql.Connection;
import java.sql.DriverManager;
     
/**
 *
 * @author Haider Ali
 */
public class AliTransport {

    static Connection con = null;
    private AliTransport()
    {
        
    }
    public static Connection getConnection()
    {
        try{
            if(con==null)
            {
                Class.forName("com.mysql.jdbc.Driver");  
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","1247");  
            }
        }    
        catch(Exception e)
            {
               e.printStackTrace();     
            }
        return con;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    //To change body of generated methods, choose Tools | Templates.
    
    
}
