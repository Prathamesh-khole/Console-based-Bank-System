package Apna_Bank;
import java.util.*;

public class Bank 
{
	List <Customer> user = new ArrayList<Customer>();
	
	
	
	 public int  addUser( String name, int mobile_no,int pass  )
	{
		 Customer c = new Customer();
		  c.name=name;
		  c.mobile_no=mobile_no;
		  c.setPassword(pass);
		  c.id= user.size()+1;
		  
		  user.add(c);
		  
		  return c.id;
	}
	 
	 
	 public void deposite(int accno,int amount)
	 {
		 for(int i=0;i<user.size();i++)
		 {
			  Customer cos = user.get(i);
			 if(cos.id==accno)
			 {
				 cos.blance=cos.blance+amount;
				 cos.newtransaction("Depostine", amount);
				 System.out.println("\n"+"Trsaction made susscefully !!"+"\n"+ " Your blance is =  "+cos.blance);
			 }
			 else
			 {
				 System.out.println("\n"+"Invalid user"+"\n");
			 }
		 }
		 
		 
		 
	 }
	 
	 public void withdrawal(int accno,int pass,int amout)
	 {
		 for(Customer cos :user)
		 {
			 if(cos.id==accno)
			 {
				 if(pass==cos.getPassword())
				 {
					 if(cos.blance>= amout)
					 {
						 cos.blance=cos.blance-amout;
						 cos.newtransaction("Withdewawal", amout);
						 System.out.println("\n"+"Trsaction made susscefully !!"+"\n"+ " Your blance is =  "+cos.blance+"\n");
					 }
					 else
					 {
						 System.out.println("\n"+"Blance is less than withdrawal ammount"+"\n");
					 }
				 }
				 else
				 {
					 System.out.println("\n"+"Invalid Password"+"\n");
				 }
			 }
			 else
			 {
				 System.out.println("\n"+"User not found !!  Enter a valid Account no "+"\n");
			 }
		 }
		 
	 }
	 
	 
	 public void printPassBook(int accno ,int pass)
	 {
		   for(int i=0;i<user.size();i++)
		 {
		     Customer cos = user.get(i) ;
		       if(cos.id==accno)
		        {
		    	  if(cos.getPassword()==pass)
		    	   {for(int j=0;j<cos.addT.size();j++)
		        
	         	 {
		    		   Transaction t = cos.addT.get(j);
	                    System.out.println("\n"+"Transaction Type = " + t.opration + "  Amount Transferred = " + t.amount);
		         }}
		    	  else
		    	  {
		    		  System.out.println("Invalid password");
		    	  }
		       }
		       else
		       {
		    	   System.out.println("\n"+"Invalid user"+"\n");
		       }
		 
		
			 
			 
		 
	 }

    }
	 
	 public void Arrayprint() 
	 {
		 Customer cos  ;
		 for(int i=0;i<user.size();i++)
		 {
			 cos = user.get(i);
			 System.out.println(cos.blance+"===>"+i+ "---->"+cos.name);
		 }
		 
		 }
		 
	 }


