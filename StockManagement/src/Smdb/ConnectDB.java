/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Smdb;

/**
 *
 * @author Stalwart
 */
import java.sql.*;
import java .io.*;

public class ConnectDB
{
 	public  Connection connect()
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection("jdbc:odbc:stockdsn","","");
		Statement s=c.createStatement();
//                ResultSet rs=s.executeQuery("select * from Lubricants");
//                while(rs.next())
//                {
//                    System.out.println("Code " +rs.getString(2));
//                    System.out.println("Name " +rs.getString(3));
//                    System.out.println("Company " +rs.getString(4)); 
//                }
                return c;
                }catch(Exception   e){e.printStackTrace();}
                    return null;    
	}
}

 

