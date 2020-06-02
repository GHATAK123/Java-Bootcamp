package testconnection;
import java.sql.*;
public class TestConnection
{
    public static void main(String[] args)
    {
        String url="jdbc:oracle:thin:@localhost:1521:XE";
       try{ Class.forName("oracle.jdbc.driver.OracleDriver");
           System.out.println("Driver Loaded");
           Connection con=DriverManager.getConnection(url,"scott","ghatak");
           System.out.println("Connection Established");
          }
        catch(ClassNotFoundException e)
        {
            System.out.println("Exception not loaded");
        }
        catch(SQLException e)
        {
            System.out.println("Connection not established");
        }
    }
}