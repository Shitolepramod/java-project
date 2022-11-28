package com.imployeinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class implinfo2 extends implinfo {
	
	public static void updateinfo()throws ClassNotFoundException, SQLException{
		  String query="update implinfo set name=? where id=?";
		  
	Connection con=  creteConnection();
		  
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("updat name");
		  String name=sc.nextLine();
		  
		   
		  System.out.println("inter your id");
		  int id=sc.nextInt();
		 
		  
		  PreparedStatement stm=con.prepareStatement(query);
		  
		  stm.setString(1,name);
			stm.setInt(2,id);
	
		int num=stm.executeUpdate();
		System.out.println("updated");
		System.out.println(num+"succsesfully");
		
		con.close();
		stm.close();
	
		
		
	}

}
