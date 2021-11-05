package Library.Management.System;
import java.sql.*;

public class conn {
    Connection c=null;
    Statement s;
    public conn()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            try {
                c = DriverManager.getConnection("jdbc:mysql:// localhost:3306/library_management_system", "root", "ilikeit");
                System.out.println("connection stablished");
                s = c.createStatement();
            }
            catch (Exception e)
            {
                System.out.println("Database does not exist");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
