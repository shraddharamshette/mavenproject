package com.javatpoint.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
public static Connection getCon() throws ClassNotFoundException, SQLException{
	Connection con=null;
//	try{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//	    con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/elibrary","root","root");
//		
//	}catch(Exception e){System.out.println(e);}
	Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/elibrary","root","root");
	return con;
}
}