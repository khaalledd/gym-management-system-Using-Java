
package project;
import java.sql.*;

public class Connectinprovider {
    
    public static Connection connect() 
    {
          try{
           
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","قخخف");
           return c;
        }catch(Exception ex)
        {
            return null;
        
        }
        
    }
}
