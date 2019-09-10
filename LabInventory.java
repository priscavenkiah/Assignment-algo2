import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myKeyboard = new Scanner(System.in);
		
		int count = 1;
		String password = "DitProg123";
		int update;
		int fail = 0;
		String itemID;
		String Name;
		String Description;
		String Category;
		String SupplierName;
		String SupplierContacts;
		double Price;
		int Availablequantity;
		int size;
		int selection = 0;
		int maxcount = 1;
		int choice = 0;
		int position = 0;
		
		Item[]itemDatabase;
		System.out.print("What is the maximum size the inventory can hold: ");
		size = myKeyboard.nextInt();
		
		
	    itemDatabase = new Item[size];
		
		/**
		 * display menu
		 */
		System.out.println("What do you want to do?");
		System.out.println("1.Enter a new Item to the inventory(Password required).");
		System.out.println("2.Change information of an existing Item(password required).");
		System.out.println("3.Display all the items with the specified catogory.");
		System.out.println("4.Display all the items to be re-ordered.");
		System.out.println("5.Number of Items currently in store.");
		System.out.println("6.Quit");
		System.out.println("Please enter your choice > ");
		choice = myKeyboard.nextInt();
		
	 
		if(choice == 1) {
			do {
				do {
					System.out.println("Enter password: ");
					password = myKeyboard.next();
					
					if(password != "DitProg123") {
						maxcount++;
						count++;
						System.out.print("Program detected suspicious activity and is terminating!");
						
					}
					
				} while(password.equals("DitProg123") && count < 3);
				
				System.out.println("What do you want to do?");
				System.out.println("1.Enter a new Item to the inventory(Password required).");
				System.out.println("2.Change information of an existing Item(passwprd required).");
				System.out.println("3.Display all the items with the specified catogory.");
				System.out.println("4.Display all the items to be re-ordered.");
				System.out.println("5.Number of Items currently in store.");
				System.out.println("6.Quit");
				System.out.println("Please enter your choice > ");
				choice = myKeyboard.nextInt();
				
			
		} while(maxcount < 12 && password.equals("DitProg123"));
		
		System.out.println("Enter a new item to the inventory: ");
	    itemID = myKeyboard.next();
	    
	
		
		for (int i = 0; i < size; i++) {
			itemDatabase[i] = new Item();
		}
		
		
		for(int i = 0; i < size; i++) {
		//input values into the array of object Item
			System.out.println("Item ID" + (i+1)  + ": ");
			itemID = myKeyboard.next();
			
			System.out.println("Name" + (i+1) + ": ");
			Name = myKeyboard.next();
			
			System.out.println("Description" + (i+1) + ": ");
			Description = myKeyboard.next();
			
			System.out.println("Category" + (i+1) + ": ");
			Category = myKeyboard.next();
			
			System.out.println("Supplier Name" + (i+1) + ": ");
			SupplierName = myKeyboard.next();
			
			System.out.println("Supplier Contact" + (i+1) + ": ");
			SupplierContacts = myKeyboard.next();
			
			System.out.println("Price" + (i+1) + ": ");
			Price = myKeyboard.nextDouble();
			
			System.out.println("Available quantity" + (i+1) + ": ");
			Availablequantity = myKeyboard.nextInt();
			
			itemDatabase[i] = new Item();
			
			}
		}
		else if(choice == 2) {
			do {
			   do {
					System.out.println("Enter password: ");
					password = myKeyboard.next();
					
					if(password != "DitProg123") {
						maxcount++;
						count++;
						System.out.print("Program detected suspicious activity and is terminating!");
						
					}
					
				} while(password.equals("DitProg123") && count < 3);
				
				System.out.println("What do you want to do?");
				System.out.println("1.Enter a new Item to the inventory(Password required).");
				System.out.println("2.Change information of an existing Item(passwprd required).");
				System.out.println("3.Display all the items with the specified category.");
				System.out.println("4.Display all the items to be re-ordered.");
				System.out.println("5.Number of Items currently in store.");
				System.out.println("6.Quit");
				System.out.println("Please enter your choice > ");
				choice = myKeyboard.nextInt();
				
				
			} while(maxcount < 12 && password.equals("DitProg123"));
			   
	
				System.out.println("Which item ID do you want to change? ");
			    itemID = myKeyboard.next();
			    
			    for (int i = 0; i < size; i++) {
			    
			    	if(itemDatabase[i].equals(itemID)) {
			    		position = i;
			    		break;
			    }
			    	
					do {
						System.out.println("Here are the attributes of the given ItemID");
						System.out.println(itemDatabase[i].getItemID() +" \n "+ itemDatabase[i].getName() +" \n "+ itemDatabase[i].getDescription() +" \n "+
						                    itemDatabase[i].getCategory() +" \n "+ itemDatabase[i].getSupplierName() +" \n "+ itemDatabase[i].getSupplierContacts() +" \n "+
								            itemDatabase[i].getPrice() +" \n "+ itemDatabase[i].getAvailablequantity());
						System.out.println("What information of this Item would you like to change?");
						System.out.println("1.Name \n 2.Description \n 3.Category \n 4.Supplier Name \n 5.Supplier Contacts \n 6.Price \n 7.Available quantity");
						System.out.println("Please enter your selection > ");
						selection = myKeyboard.nextInt();
						
					} while(selection < 1 || selection > 7);
						if (selection == 1) {
							System.out.println("Enter new Item name: ");
							Name = myKeyboard.next();
							itemDatabase[position].setName(Name);
						}
						if (selection == 2) {
							System.out.println("Enter new Description of Item: ");
							Description = myKeyboard.next();
							itemDatabase[position].setDescription(Description);
						}
						if (selection == 3) {
							System.out.println("Enter new Category of Item: ");
							Category = myKeyboard.next();
							itemDatabase[position].setCategory(Category);
						}
						if (selection == 4) {
							System.out.println("Enter new Supplier Name: ");
							SupplierName = myKeyboard.next();
							itemDatabase[position].setSupplierName(SupplierName);
						}
						if (selection == 5) {
							System.out.println("Enter new Supplier Contacts: ");
							SupplierContacts = myKeyboard.next();
							itemDatabase[position].setSupplierContacts(SupplierContacts);
						}
						if (selection == 6) {
							System.out.println("Enter new Price: ");
							Price = myKeyboard.nextDouble();
							itemDatabase[position].setPrice(Price);
						}
						else if (selection == 7) {
							System.out.println("Enter new Available quantity: ");
							Availablequantity = myKeyboard.nextInt();
							itemDatabase[position].setAvailablequantity(Availablequantity);
						}
	    
			    }
		}
			else if (choice == 3) {
				  
				  System.out.println("Enter the specified category: ");
				  Category = myKeyboard.next();
				  
				  for (int i = 0; i < size; i++) {
				  
				  if(itemDatabase[i].getCategory().equals(Category)) {
					  
					  System.out.println("Name: "+itemDatabase[i].getName() + " \n Description: "+itemDatabase[i].getDescription() + " \n Category: "+itemDatabase[i].getCategory()
							               + " \n SupplierName: "+itemDatabase[i].getSupplierName() + " \n SupplierContacts: "+itemDatabase[i].getSupplierContacts() + " \n Price: "+itemDatabase[i].getPrice()
							               + " \n Availablequantity: "+itemDatabase[i].getAvailablequantity());
					  
					  
			
					}
			
				 
	        }
	    }
		
				else if (choice == 4) {
					
					for (int i = 0; i < size; i++) {
						
						itemDatabase[i].getItemID();
						itemDatabase[i].getName();
						itemDatabase[i].getSupplierName();
						itemDatabase[i].getSupplierContacts();
						
						System.out.print(itemDatabase[i].toString());
					}
						
						
						
				}
		
					else if (choice == 5) {
						
						System.out.println("Number of items " + Item.TotalItem());
						
					}
		      
					else if (choice == 6) {
						
						System.out.println("Thank you for your time!");
						
						
						myKeyboard.close();
					}
		
		
		
		
		
	
		
		     	
		

	}

}
