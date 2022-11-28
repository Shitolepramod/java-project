package com.imployeinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class implinfo1 {
	
	public  static void insertinfo() throws ClassNotFoundException, SQLException{
		 String query="insert into implinfo(name,destination,age,salary)values(?,?,?,?)";
		 
	 implinfo.creteConnection();
		 
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("inter the name");
		 String name=sc.nextLine();
		 
		 System.out.println("inter your destination");
		 String destination=sc.nextLine();
		 
		 System.out.println("inter age");
		 int age=sc.nextInt();
		 
		 System.out.println("inter salary");
		 int salary=sc.nextInt();
		 
		 PreparedStatement stm =  implinfo.creteConnection().prepareStatement(query);
		   
		 stm.setString(1, name);
		 stm.setString(2,destination);
		 stm.setInt(3,age);
		 stm.setFloat(4,salary);
		 
		 int num= stm.executeUpdate();
		 
		 System.out.println("row are executing");
		 System.out.println(num+"succsefully");
		 
		 
		 
		 
		 
		 
		

	}

}
