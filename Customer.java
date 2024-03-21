package Apna_Bank;

import java.util.*;

public class Customer
{
	 int id ;
	 String name;
	 int mobile_no ;
	 double blance ;
	 private int  password;
	 
	 
	 
	 List <Transaction> addT = new ArrayList<Transaction>();
	 
	public void  newtransaction(String s , int amount)
	 {
		Transaction t = new Transaction();
		 t.opration=s;
		 t.amount=amount;
		 
		 addT.add(t);
	 }
	
	public int getPassword()
	{
		return password;
	}
	
	public void setPassword(int password)
	{
		this.password = password;
	}
	  

}
