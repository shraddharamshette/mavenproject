package com.javatpoint.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elibrary","root","root");
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}

public static void main(String args[])
{
try{
	Connection con=DB.getCon();
	PreparedStatement ps=con.prepareStatement("select * from e_librarian w");
	ps.setInt(1,id);
	ResultSet rs=ps.executeQuery();
	if(rs.next()){
		ps.setId(rs.getInt(1));
		bean.setName(rs.getString(2));
		ps.setPassword(rs.getString(3));
		ps.setEmail(rs.getString(4));
		ps.setMobile(rs.getLong(5));
	}
	con.close();
	
}catch(Exception e){System.out.println(e);
}