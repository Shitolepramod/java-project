package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class schoolinfo1 {

    public static Connection createconnection() throws ClassNotFoundException, SQLException{
    	Class.forName("com.mysql.jdbc.Driver");
    	String url="jdbc:mysql://localhost:3306/schoolinfo";
    	String pass="root";
    	String username="root";
    	
    	Connection con =DriverManager.getConnection(url,pass,username);
    	 
    	return con;
    	
    }

 public static void insert() throws ClassNotFoundException, SQLException{
    String query="insert into schoolinfo(name,age,marks)values(?,?,?)" ;
    
    
    Scanner sc=new Scanner(System.in);
    System.out.println("inter name:");
    String name=sc.nextLine(); 
    
    System.out.println("inter age:");
    int age=sc.nextInt();
    
    System.out.println("enter marks:");
    float marks=sc.nextFloat();
    
   
    
   PreparedStatement stm= schoolinfo1.createconnection().prepareStatement(query);
    
    stm.setString(1,name);
    stm.setInt(2,age);
    stm.setFloat(3,marks);
   
    
    int num = stm.executeUpdate();
    
    System.out.println("add values");
    System.out.println(num+"succesful");
 }
public static void update () throws ClassNotFoundException, SQLException{
	String query="update schoolinfo set name=? where id=?";
	  
	Scanner sc= new Scanner(System.in);
	System.out.println("update name:"); 
	String name=sc.nextLine();
	
	System.out.println("inter id no:");
	int id=sc.nextInt();
	
	 PreparedStatement stm= schoolinfo1.createconnection().prepareStatement(query);
	 
	 stm.setString(1,name);
	 stm.setInt(2,id);
	 
	 int num= stm.executeUpdate();
	 System.out.println("update name");
	 System.out.println(num+"succesfull");
}
public static void delete() throws ClassNotFoundException, SQLException{
	String query="delete from schoolinfo where id=?";
	System.out.println("inter id no:");
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	
	 PreparedStatement stm= schoolinfo1.createconnection().prepareStatement(query);
	 
	  stm.setInt(2,id);
	 
	 int num=stm.executeUpdate();
	 System.out.println("delete value");
	 System.out.println(num+"succesful");
}
 
public static void fechallrecord() throws ClassNotFoundException, SQLException{
	String query="select*from schoolinfo";
	
	Connection con= createconnection();
	
	Statement stm=con.createStatement();
	ResultSet res=stm.executeQuery(query);
	
	while(res.next()){
		System.out.println("student name:"+res.getString("name")); 
		System.out.println("student age:"+res.getInt("age")); 
		System.out.println("student marks:"+res.getInt("marks")); 
		System.out.println("-----------------------------------");
	}
	   
	 con.close();
	 stm.close();
	 
}
}
	 
	
    
    	

	


