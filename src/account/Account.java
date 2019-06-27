package account;

import java.util.Scanner;

public class Account extends Exception
{
	Scanner sc=new Scanner(System.in);
	
	public int acc_no;
	public String name;
	public int bal;
	
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	
	
	public Account(int acc_no,String name, int bal) {
		super();
		this.acc_no=acc_no;
		this.name = name;
		this.bal = bal;
	}
	
	
	@Override
	public String toString() {
		return "Account [acc_no="+acc_no+"name=" + name + ", bal=" + bal + "]";
	}
	
	public Account() {}
	
	public void accept()
	{
		System.out.println("Enter Id:");
		this.acc_no=sc.nextInt();
		System.out.println("Enter name:");
		this.name=sc.next();
		System.out.println("Enter balance:");
		this.bal=sc.nextInt();
		
		boolean flag=false;
		
		while(flag==false)
		{
			try{
				if(bal<1000)
				{
					throw new Exception("Account balance should be greater than 1000...");
				}
				flag=true;
				
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("Re-enter balance:");
				this.bal=sc.nextInt();
				
			}
		}
		
		
	}
	
	
	public void display()
	{
		System.out.println("acc no:"+acc_no);
		System.out.println("name:"+name);
		System.out.println("balance:"+bal);
		
	}
	
	
	public void deposit()
	{
		System.out.println("Enter amount:");
		int amt=sc.nextInt();
		bal=bal+amt;
	}
	
	
	public void withdraw()
	{
		System.out.println("Enter amount:");
		int amt=sc.nextInt();
		
		boolean flag=false;
		
		while(flag==false)
		{
			try{
				
				if(amt>bal)
				{
					throw new Exception("Your account balance is insufficient...");
				
				}
				
				flag=true;
				
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("Re-enter amount:");
				amt=sc.nextInt();
				
			}
		
		}
		
		bal=bal-amt;
		System.out.println("Available Balance:"+bal);
		
		
	}
	
}
