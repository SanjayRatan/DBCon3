package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Customer51
{
   public static void main(String[] args) 
   {
	  try
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the Customer id");
		  String cid=sc.nextLine();
		  System.out.println("Enter the Customer name");
		  String cName=sc.nextLine();
		  System.out.println("Enter the Customer mid");
		  String cmid=sc.nextLine();
		  System.out.println("Enter the Customer city");
		  String cCity=sc.nextLine();
		  Connection con=DriverManager.getConnection
				  ("jdbc:oracle:thin:@localhost:1521:orcl","system","abc");
		  Statement stm=con.createStatement();
		     int k=stm.executeUpdate("insert into customer51 values('"+cid+"','"+cName+"','"+cmid+"','"+cCity+"')");
		       if(k>0)
		       {
		    	    System.out.println("Customer51 data updata successfully....");
		       }
		  
		   
	  }catch(Exception e) {e.printStackTrace();}
}
}
