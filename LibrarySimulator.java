//Abdulmohsin Alamri    ID:446106954







package LibrarySystem;

import java.util.Scanner;

public class LibrarySimulator {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		
		//Predefined user accounts
		//user accounts 1-2-3
		Member user1 = new Member(11345, "Ali Alqahtani", 2);
		Member user2 = new Member(10123, "Adam Alazahrani", 3);
		Member user3 = new Member(987, "Fahad Alsebaie", 1);
		
		
		
		
		//Predefined Admin account
		//Admin account 0
		String AdminID = "446106954";
		String AdminName="Abdulmohsin Alamri";
		boolean exitProgram = false;
		
		
		//Welcome Message
		System.out.println("Welcome to The Library\n\n");
		
		//Loop of the menu
		while(!exitProgram) {
		System.out.println("Select Your Account\n\n");
		System.out.println("1-First user Account\t" + " ID= " + user1.GetID() + "  Name= " + user1.GetName());
		System.out.println("------------------------------------------------------------------");
		System.out.println("2-Seconed user Account\t " + " ID= " +  user2.GetID() + "  Name= " + user2.GetName());
		System.out.println("------------------------------------------------------------------");
		System.out.println("3-Third user Account\t " + " ID= " + user3.GetID() + "  Name= " + user3.GetName());
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		System.out.println("4-Admin Account\t " + " ID= " + AdminID + "  Name= " + AdminName);
		System.out.println("------------------------------------------------------------------");
		System.out.println("Exit");
		System.out.println("------------------------------------------------------------------");
		System.out.print("Enter your choise from 1-5: ");
		
		
		
		
		//each choice get's connected by it's object (users, admin, exit)
		String choice = input.nextLine();
//User 1  OPERATIONS
		if(choice.equals("1")) {
			   TakeUser(user1, input);
		}
//User 2 OPERATIONS
		else if (choice.equals("2")) {
			TakeUser(user2, input);
			}
		
//User 3 OPERATIONS
		else if (choice.equals("3")) {
			TakeUser(user3, input);}
		
//Admin  OPERATIONS
		else if (choice.equals("4")) {
			TakeAdmin(input, AdminID, AdminName);
			}
//Exit
		else if (choice.equals("5")) {
			System.out.println("You Exited");
			exitProgram = true;
		}
		else {
			System.out.println("Invalid choice");
		}}
		
		}
		
		
//--------------------------------------------Taking User and handling----------------------------------------
		
		private static void TakeUser(Member user, Scanner input) {
			System.out.println("Welcome + " + user.GetName() +"your user: "+ user.GetID());
			user.nViewBorrowCounts();
			
		    boolean userMenu = true;
		    
		    while(userMenu) {
		    	System.out.println("\n---What you can do---");
	            System.out.print("1-Borrow a book\t 2-Return a book\t 3-View Session Stats\t 4-Exit to menu\n Choose >>>    ");
	            
	            String userChoice = input.nextLine();
//Borrowing a book
	            if (userChoice.equals("1")) {
	            	user.borrowOne();
	            }
//Returning a book
	            else if(userChoice.equals("2")) {
	            	user.ReturnOne();
	            }	            	
//Displaying Stats
	            else if(userChoice.equals("3")) {
	            	user.displayStatistics();
	            }
//Returning to main menu
		            else if(userChoice.equals("4")) {
		            	System.out.println("Returning to main menu..");
		            	user.reset();
		            	userMenu = false;
		            }
//Invalid Choice
		            else {
		            	System.out.println("Invalid Choice");
		            } 	  	
		    }	
		}
		
//--------------------------------------------Taking Admin and handling----------------------------------------
		
		
		private static void TakeAdmin(Scanner input,String AdminID, String AdminName) {
		boolean AdminBoard = true;
			while (AdminBoard) {
				System.out.println("---What you can do---");
				System.out.print("1-Total Revenue \t 2-View most operation \t 3-Total Borrows \t 4-Exit to menu  Choose from 1-4>>>");
				String AdminChoice = input.nextLine();
//Admin Choices 1 showing Total Revenue		
				if (AdminChoice.equals("1")) {
	            	System.out.println("Total Revenue = " + Member.TotalRevenue);
	            }
//Admin Choice 2 showing most operations
	            else if(AdminChoice.equals("2")) {
	            	
	            	if(Member.TotalBorrows > Member.TotalReturn){
	            		System.out.println("Borrowing is the most operation");
	            		}
           	
	            	else if(Member.TotalReturn > Member.TotalBorrows) {
	            		System.out.println("Returning is the most operation");
	            	}

	            	else {
	            		System.out.println("Returning is the most frequent");
	            	}

	            }
	            	
//Admin Choice 3 showing Total Borrows	    	            	

	            else if(AdminChoice.equals("3")) {
	            	System.out.println("View Borrow Counts== "+ Member.TotalVBorrowed);
	            }
//Admin Choice 4 returning to main menu
		            else if(AdminChoice.equals("4")) {
		            	System.out.println("Returning to main menu..");
		            	AdminBoard = false;
		            }
		            else {
		            	System.out.println("Invalid Choice");
		            } 
				
				
			}
				
		}
			
	}

