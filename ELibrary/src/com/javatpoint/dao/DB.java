package com.javatpoint.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elibrary","root","root");
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}

//
//import java.sql.Connection;  
//import java.sql.DriverManager;  
//public class DB {  
//         public static Connection getCon{
//            String name,pass,url;  
//            Connection con = null;  
//            try {  
//                Class.forName("com.mysql.jdbc.Driver");  
//            url="jdbc:mysql://localhost:3306/elibrary";  
//                name="root";  
//                pass="";  
//                con = DriverManager.getConnection(url,name,pass);  
//                System.out.println("Connection created");  
//                con.close();  
//                System.out.println("Connection closed");  
//                }  
//                catch (Exception e) {  
//                System.out.println(e.toString());  
//            }  
//    }  
//}  