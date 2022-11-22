package com.mysql;


import java.sql.SQLException;
import java.util.Scanner;

public class school2 {
	
	public static void main (String[]args) throws ClassNotFoundException, SQLException{
		while (true){
		/*System.out.println("1:list of all studentinfo");
		System.out.println("2:insert all studentinfo");
		System.out.println("3:update student info");
		System.out.println("4;delete student info");
		System.out.println("5   exit");
		System.out.println(  );*/
		
		System.out.println("inter your choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		System.out.println();
		 
		if(ch==1){
			schoolinfo1.fechallrecord();
		}else{
			if(ch==2){
				schoolinfo1.insert();
			}else{
				if(ch==3){
					schoolinfo1.update();
				}else{
					if(ch==4){
						schoolinfo1.delete();
					}else{
						if(ch==5){
							System.out.println("   ");
							System.out.println("visit again");
							break;
                         
						}
					
					}
				}
				
			}
		}
		
		
		}
         
	
		}

		}

		
	
