package bankingapplication;

import java.util.Scanner;

class Bank {
	
	      private String Name;
	      private String Account_No;
	      private int ID_No;
	      //private String Account_Type;
	      static Long Balance;
	      
	      Scanner sc = new Scanner(System.in);
	     
	      //method for open an existing account
	      void openAccount()
	      {
	    	  System.out.println("Enter Your Name: ");
	    	  Name=sc.next();
	    	  
	    	  System.out.println("Enter Your Account Number: ");
	    	  Account_No=sc.next();
	    	  
	    	  System.out.println("Enter Your ID_No: ");
	    	  ID_No=sc.nextInt();
	    	  
	    	  //System.out.println("Enter Your Account_Type: ");
	    	  //Account_Type=sc.next();  
	    	  
	    	  System.out.println("Enter Your Balance: ");
	    	  Balance=sc.nextLong();
	      }
	      
	      void displayAccount()
	      {
	    	  System.out.println("Name: " + Name + "\n" + "Account_No: " + Account_No + "\n" +"ID_No: " + ID_No + "\n" + "Balance: " + Balance);  
	      }
	      
	      void deposit()
	      {
	    	Long Ammount;
	    	
	    	System.out.println("Enter the Total Ammount You want to Deposit In Your Account: ");
	    	Ammount=sc.nextLong();
	    	Balance=Balance+Ammount; 
	      }
	      
	      void withdraw()
	      {
	    	  Long Ammount;
	    	  
	    	  System.out.println("Enter The Total Ammount You Want to Withdraw From Your Account:  ");
	    	  
	    	  Ammount=sc.nextLong();
	    	  
	    	  if (Balance>=Ammount)
	    	  {
	    		  Balance=Balance-Ammount;
	    	  }
	    	  else
	    	  {
	    		  System.out.println("Transaction Failed!!!...." + "Less Balance!!!....");
	    	  } 	
	      }
	      
	     public long getBalance()
	     {
	    	 return Balance;
	     }
	      
	    	  boolean search(String accnum)
	    	  {
	    		  if(Account_No.equals(accnum))
	    		  {
	    			  displayAccount(); 
	    			  return(true);
	    	      }
	    		  return(false);
	    	  } 
	  }	
 
  public class BankingProcess extends Bank{
	 
	public static void main(String[] args) {
		
		
		
		 //System.out.println("Input an integer");
		 int n1;
		    System.out.println("*********************************************************************************");
		    System.out.println("Hello User.!!!!! " +" \n WELCOME TO THE BANK APPLICATION!!!.." + "\n For Further proccessing....Please Do the Needful!!....");
		    System.out.println("Press 1 For Further use  " + "Press 0 For Leave the application Immediately");
		    System.out.println("**********************************************************************************");
		   
		    Scanner sc1 = new Scanner(System.in);
		    while ((n1 = sc1.nextInt()) != 0)	
		    {
		    	 System.out.println("You entered " + n1);
				 System.out.println("Main Menu");
				 System.out.println("1. Display All");
				 System.out.println("2. Search By Account");
				 System.out.println("3. Deposit");
				 System.out.println("4. Withdraw");
				 System.out.println("5. Current Balance");
				 System.out.println("6. Exit");
				 
				
		    	 System.out.println("**********************************************************************************");
	  
		    	    	 
     Scanner sc=new Scanner(System.in);
		System.out.println("How Many Account You Want to Create: ");
		
		
		int n=sc.nextInt();
		
		System.out.println("Creating Account For Total User: "+n);
		
		Bank C[]=new Bank[n];
		
		for(int i=0; i<C.length; i++)
		{
			C[i]=new Bank();
			C[i].openAccount();
			
		}
		
	    System.out.println("**********************************************************************************");

		
		int details;
		 do{
			 System.out.println("Main Menu");
			 System.out.println("1. Display All");
			 System.out.println("2. Search By Account");
			 System.out.println("3. Deposit");
			 System.out.println("4. Withdraw");
			 System.out.println("5. Current Balance");
			 System.out.println("6. Exit");
			 System.out.println("*********************************************************************************************************");
			 System.out.println("              WELCOME BACK TO THE BANK APPLICATION         ");
			 System.out.println("**********************************************************************************************************");
			 System.out.println("Enter Your Choice:");
			 
			 details=sc.nextInt();
			 
			 switch(details)
			 {
			 
			 case  1: 
			   for(int i=0; i<C.length; i++)
			   {
				   C[i].displayAccount();
			   }
			   break;
			   
			 case 2:
				 System.out.println("Enter Account Number You want to Search: ");
				 String accnum=sc.next();
				 boolean found=false;
				 for(int i=0; i<C.length; i++)
				 {
					 found=C[i].search(accnum);
					 if(found)
					 {
						 break;
					 }
				 }
					 if(!found)
					 {
						 System.out.println("Serach Failed!.......The Account does not exists....");
						 System.out.println("******************************************************************************************");
					 }
				 
			     break;
			     
			 case 3:
				 System.out.println("Enter Your Account Number: ");
				 accnum=sc.next();
			     found=false;
			     for(int i=0; i<C.length; i++)
			     {
			    	 found=C[i].search(accnum);
			         if(found)
			         {
			        	C[i].deposit();
			        	System.out.println("Thanks For Depositing!!!!!!");
			        	break; 
			         }
			     }
                     if(!found)
                     {
                      System.out.println("Search Failed!!.....The Account for the deposite does not exist....");
                     }
			     
			     break;
			     
			 case 4:
				 System.out.println("Your Balance: ");
				 System.out.println("Enter Your Account Number: ");
				 accnum=sc.next();
				 found=false;
				 for(int i=0; i<C.length; i++)
				 {
					 found=C[i].search(accnum);
					 if(found)
					 {
						 C[i].withdraw();
						 System.out.println("Thanks for Withdrawing!!!!!!!!!!!!");
						 break;
					 }
				 }
					 if(!found)
					 {
						 System.out.println("Search Failed!!.... The Account for the Withdraw does not exist....");
					 }
				 
				 break;
				 
			 case 5:
				 System.out.println("Enter Your Account Number: ");
					
					  accnum=sc.next(); 
					  found=false; 
					  for(int i=0; i<C.length; i++) 
					  {
					  found=C[i].search(accnum); 
					  if(found)
					  {
					
						  System.out.println("The Details As per You Enter Account Number.....");
					 
						  C[i].getBalance(); 
					      break; 
					  } 
					  } 
					  if(!found) 
					  { 
						  System.out.println("Search Failed!!.....The Account for the checking Balance does not exist....."); 
						  }
					 
//			     accnum=sc.next();
//			     if(accnum==accnum)
//			     {
//			    	 System.out.println("your current balance is"+Balance);
//			     }
//			     
//			     else
//			     {
//			    	 System.out.println("Please Try Again The Account No is not Valid!!!!....");
//			     }
			     break;
			 case 6:
			 
                	 System.out.println("You can Exist..");
                	 System.exit(0);
  
				 break;
				
         		 }
			 System.out.println("*****************************************************************************************************************");
			 
		}while(details!=6); 
	} System.out.println("Thanks For Visiting!!!...Have a Nice Day");	  
  }
}
	

