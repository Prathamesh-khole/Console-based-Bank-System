package Apna_Bank;
import java.util.Scanner;

public class Run_Bank_code {

	public static void main(String[] args)
	{
		Bank B= new Bank();
		int choice;
		Scanner scanner = new Scanner(System.in); 
		while(true)
		{ 
			 

			System.out.println("Welcome to the Apna Bank!");
	        System.out.println("1. Add User");
	        System.out.println("2. Withdraw");
	        System.out.println("3. Deposit");
	        System.out.println("4. PassBook Printing");
	        System.out.println("5. Exit");

	      
	        System.out.print("\n"+"Enter your choice: ");

			choice = scanner.nextInt();
			 scanner.nextLine();
			
			  switch (choice)
			  {
			  case 1:
				 
				    System.out.println("Enter Your name: ");
				    String name = scanner.nextLine();

				    System.out.println("Enter Your mobile number: ");
				    int phoneNumber = scanner.nextInt();
				    scanner.nextLine();

				    System.out.println("Enter Your password: ");
				    int pass = scanner.nextInt();
				    
				    
				   int id =  B.addUser(name, phoneNumber, pass);
				   
				   System.out.println("\n"+"Added Susccefully !! "+"\n");
				   System.out.println("Your Id is       = "+id);
				   System.out.println("Your Password is = "+pass);
				   System.out.println(" --- Keep your Password safe ---"+"\n");
			
				    break;
			  
			  case 2 :
				  
				  
				  
				  System.out.println("Enter Your Id number: ");
				    int ID = scanner.nextInt();
				    scanner.nextLine();

				    System.out.println("Enter Your password: ");
				    int pass1 = scanner.nextInt();
				    scanner.nextLine();
				    
				    System.out.println("Enter Amount you want to withdrawal : ");
				    int amount = scanner.nextInt();
				
				    B.withdrawal(ID, pass1, amount);
				    
				   
				    
				    
				    
				    break;
				    
			  case 3 :
				  
              
				  
				    System.out.println("Enter Your Id number : ");
				    int ID1 =scanner.nextInt();
				    scanner.nextLine();
				    

				    System.out.println("Enter Amount you want to Deposite : ");
				    int amount1 = scanner.nextInt();
				    scanner.nextLine();
				    
				    B.deposite(ID1, amount1);
				    
				    System.out.println();
				    
				  
				    
				    break;
				    
			  case 4 :

				    System.out.println("Enter Your Id number: ");
				    int  id2 =scanner.nextInt();
				    scanner.nextLine();
				    

				    System.out.println("Enter Your password: ");
				    int pass2 = scanner.nextInt();
				    scanner.nextLine();
				  
				  B.printPassBook(id2, pass2);
				  break;
			
			  case 5 :
				  scanner.close();
				  System.exit(0);
				  break;
				  
			  case 6:
				 B.Arrayprint();
				  
				   
				  
				  
			  
			  }
		}
		

	}

}
