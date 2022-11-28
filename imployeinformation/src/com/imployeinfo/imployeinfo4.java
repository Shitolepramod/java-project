package com.imployeinfo;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deletimplinfo {
	
	public static void deleteinfo() throws ClassNotFoundException, SQLException{
		
		String query="delete from implinfo where name=?";
		
		implinfo.creteConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("inter name");
		String name=sc.nextLine();
		
		PreparedStatement stm = implinfo.creteConnection().prepareStatement(query);
		stm.setString(1,name );
		int num= stm.executeUpdate();
		System.out.println(num+"deleted"); 
		
		
	}

}
