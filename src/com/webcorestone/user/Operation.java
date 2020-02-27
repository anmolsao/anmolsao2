package com.webcorestone.user;

import java.util.Scanner;

import com.webcorestone.model.Customerdetails;

public class Operation {
	
	
	Scanner sc=new Scanner(System.in);
	Customerdetails[] cd1= new Customerdetails[2];
	int i=0;
	
	public void createAccount()
	
	{
		Customerdetails cd = new Customerdetails();
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter lastname");
		String lastname=sc.next();
		cd.setLastname(lastname);
		System.out.println("enter DOB");
		String dob=sc.next();
		cd.setDOB(dob);
		System.out.println("enter PAN");
		String pan=sc.next();
		cd.setPanno(pan);
		System.out.println("enter Adharno");
		long adharno=sc.nextLong();
		cd.setAdharno(adharno);
		System.out.println("enter account number");
		long accn=sc.nextLong();
		cd.setAccountno(accn);
		System.out.println("enter Mobileno");
		long mobileno=sc.nextLong();
		cd.setMobileno(mobileno);
		System.out.println("Enter email");
		String email= sc.next();
		cd.setEmail(email);
		
		cd.setName(name);
		
		while(true){
		System.out.println("enter accountbal");
		long accountbal=sc.nextLong();
		if(accountbal>=500)
		{
			cd.setAccountbal(accountbal);
		break;
		}
		else {
			System.out.println("insufficient amount");
		}
		
		}
		System.out.println("account created");
		cd1[i]=cd;
		i++;
		
	}
	
	
	public void Deposit()
	{
		System.out.println("Enter the Amount to deposit-");
		long amount=sc.nextLong();
		
		amount=cd1[i].getAccountbal()+amount;
		cd1[i].setAccountbal(amount);
		System.out.println("Your Balance is"+cd1[i].getAccountbal());
	}
	
	
	public void withdraw()
	{
		while(true)
		{
		System.out.println("Enter the amount to withdraw-");
		long amount1=sc.nextLong();
		amount1=cd1[i].getAccountbal()-amount1;
		if (amount1>=500)
		{
		cd1[i].setAccountbal(amount1);
		break;
		}
		else
		{
			System.out.println("minimum amount is reached");
		}
		}
		System.out.println("Your Balance is"+cd1[i].getAccountbal());
		
	}
	
	
	public void balanceenquire()
	{
		cd1[i].getAccountbal();
		System.out.println("Your Balance is = "+cd1[i].getAccountbal());
		
	}
	
	
	public void accountdetails()
	{
		for(int i=0;i<cd1.length;i++){
			
			if(cd1[i]!=null)
			{
			
	System.out.println("Name		- "+cd1[i].getName()+" "+cd1[i].getLastname());
	//System.out.println("Last name	- "+cd1[i].getLastname());
	System.out.println("Dob		- "+cd1[i].getDOB());
	System.out.println("Pan no		- "+cd1[i].getPanno());
	System.out.println("Email		- "+cd1[i].getEmail());
	System.out.println("Adhar no	- "+cd1[i].getAdharno());
	System.out.println("Account no	- "+cd1[i].getAccountno());
	System.out.println("Mob no		- "+cd1[i].getMobileno());
	System.out.println("account balance	- "+cd1[i].getAccountbal());
			}
	
	}
}
}
