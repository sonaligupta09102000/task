package jdbc;

import java.sql.Connection;
import java.util.Scanner;

public class GetAllData  {
	
static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//From here Connection is Got    	
				Connection c =Conn.getConne();
				
				//It is a User class where get setter all has been define
		        User us=new User();
		        
		      //implement class where all methods are call
				CallData cd=new CallData();
			int n1;	
		
		    System.out.println("*********************************************************************************");
		    System.out.println("Hello User.!!!!! " +" \n WELCOME TO THE BANK APPLICATION!!!.." + "\n For Further proccessing....Please Do the Needful!!....");
		    System.out.println("Press 1 For Further use  " + "Press 0 For Leave the application Immediately");
		    System.out.println("**********************************************************************************");
		    Scanner sc1 = new Scanner(System.in);
		  
		    while ((n1 = sc1.nextInt()) != 0)	
		    {
		    	 System.out.println("You entered " + n1);
	    	 
		    int details;
			 do{
				 System.out.println("Main Menu");
				 System.out.println("1. Create User");
				 System.out.println("2. Display All Users");
				 System.out.println("3. Search By ID");
				 System.out.println("4. Update The user by ID");
				 System.out.println("5. Delete the user by ID");
				 System.out.println("6. Exit");
				 System.out.println("*********************************************************************************************************");
				 System.out.println("              WELCOME BACK TO THE BANK APPLICATION         ");
				 System.out.println("**********************************************************************************************************");
				 System.out.println("Enter Your Choice:");
				 
				 details=sc.nextInt();
				 
				 switch(details)
				 {
				 
				 case 1:
				 {
					 System.out.println("To Create User!!..");
					   //createUser calling 
						cd.createUser(us, c);
						break;
				 }
				 
				 case 2:
				 {
					 System.out.println("To Display all users");
					 cd.retriveAllUser(c);
					 break;
					 
				 }
				 
				 case 3:
				 {
					 System.out.println("To Search the User By ID");
					  //single user calling
						cd.singleUser(us,c);
						break;
		
				 }
				 
				 case 4:
				 {
				     System.out.println("To Update the User By ID");
				     //updateUser calling
			         cd.updateUser(us, c);
					  break; 
				 }
				 
				 case 5:
				 {
					 System.out.println("To Delete the User By ID");
					    //deleteUser calling
					    cd.deleteUser(us, c);
					    break;
				 }
				 
				 case 6:
				 {
					 System.out.println("You can Exist");
					 break;
				 }
				 
				 
				 
				 }
				 
		
		    }
			while(details!=6);
			 
		    } System.out.println("Thanks For Visiting!!!...Have a Nice Day");
		
	}

}
