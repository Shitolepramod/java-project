package com.imployeinfo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class implnfofinal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	while (true){
		System.out.println("*****************imploye info***************");
	    System.out.println("add name");
	    System.out.println("update info");
	    System.out.println("delete data");
	    System.out.println("exit");
	    
	    System.out.println("inter your choice");
	    Scanner sc=new Scanner(System.in);
	    int ch=sc.nextInt();

	    if(ch==1){
	    	implinfo1.insertinfo();
	    }else if(ch==2){
	     implinfo2.updateinfo();
	    }else{
	    if(ch==3){
	    	deletimplinfo.deleteinfo();
	    }else{
	    if(ch==4){
	    System.out.println("thanku for visit");
	    break;
	    
	    					
	    				}
	    			}
	    		}
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    }
	   


		
	


