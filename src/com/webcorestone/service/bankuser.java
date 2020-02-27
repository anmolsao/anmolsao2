package com.webcorestone.service;

import java.util.Scanner;

import com.webcorestone.user.Operation;

public class bankuser {
	public static void main(String[] args) {
	Operation op = new Operation();
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		
	
	
			System.out.println("enter your choice");
			System.out.println("1.creat account");
			System.out.println("2.deposite"); 
			System.out.println("3.withdraw");
			System.out.println("4.balance enquire");
			System.out.println("5.account details");
			int choice= sc.nextInt();
					
			switch      (choice)
			{
			case 1:op.createAccount();
			break;
			case 2:
				//op.Deposit();
			break;
			case 3:
				//op.withdraw();
			break;
			case 4:
				//op.balanceenquire();
			break;
			case 5:op.accountdetails();
			break;
			default:System.out.println("please give input");
			}
			
	}
	
	}

}
