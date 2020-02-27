package com.webcorestone.user;

import java.util.Scanner;

import com.webcorestone.model.Customerdetails;

public interface praactice {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Customerdetails cd = new Customerdetails();

		
		System.out.println("enter name");
		
		String name=sc.next();
		
		cd.setName(name);
		
		System.out.println(cd.getName());
	}

}
