package pizza;
import java.util.*;
public class Palak_Pizza 

{

	public static void main(String[] args)
	{
		int x;
		System.out.println("Welcome to the PIZZA HUT delivery\n");
		Scanner p = new Scanner(System.in);
		
//#1 LOGIN AND SIGN UP	
		System.out.println("1. LOGIN \t 2. SIGN UP " );
		x= p.nextInt();
		switch(x)
		
		{
	//1a LOGIN
			case 1: String c,n,s, t;
			int q, e, r;
		    System.out.println("\nEnter your name");
		    n = p.next();
			System.out.println("Enter your e-mail ID");
			s = p.next();
			System.out.println("Enter your password");
			c = p.next();
			System.out.println("\nLOGGED IN !!! \n\n");
			System.out.println("YOUR DETAILS \n Name: "+n+ "\n Phone no.: 9876543210 \n Address: 1012/9 faridabad");
			
				
				
				System.out.println("\n\nDo you want to edit your details?\n 1. Yes\t\t2.No");
				q= p.nextInt();
				switch(q)
				{
				case 1: do
					{
						System.out.println("\nEdit your\n 1. Name 2. Phone no. 3. Address 4.Exit");
						e= p.nextInt();
						switch(e)
						{
							case 1: System.out.println("New Name ");
									n=p.next();
									break;
						
							case 2: System.out.println("New number");
									r= p.nextInt();
									break;
						
							case 3: System.out.println("New address");
									t=p.next();
									break;
						}
					
					}while (e != 4);
				break;
				
				case 2: break;
			
				}
			break;
				
	//2b SIGN UP	
			case 2: String u, y, z;
			System.out.println("\nEnter your e-mail id");
			u = p.next();
			System.out.println("Enter a password");
			y = p.next();
			System.out.println("\nENTER YOUR DETAILS");
			System.out.println("Your Name");
			n = p.next();
			System.out.println("Your phone no.");
			z = p.next();
			System.out.println("Your Address");
			s = p.next();
			System.out.println("\n\nYou are now SIGNED UP!!! ");
			break;
			
		}
		
//#2 FOOD MENU	
System.out.println("\n\nFOOD MENU !!!");
		int e, cost=0;
		char o,l,k;
		
		do
		{
			System.out.println("\n\n1. VEG PIZZA\t  2. NON-VEG PIZZA\t3. SIDES\t4. EXIT");
			e = p.nextInt();
			
			switch(e)
			{
//#3 VEG PIZZA
				case 1: System.out.println("# Farmhouse\tRs.400\n# Peppy Paneer\tRs.350\n# Margherita\tRs.250");
						System.out.println("\nEnter f, p or m to add the pizza to the cart\n");
						o= p.next().charAt(0);
						if(o=='f')
						{
							System.out.println("You have selected Farmhouse Pizza");
							cost = cost +400;
							System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
							
						}
						else if(o=='p')
						{
							System.out.println("You have selected Peppy Paneer Pizza");
							cost = cost+350;
							System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
							
						}
						else
						{
							System.out.println("You have selected Margherita Pizza");
							cost = cost+250;
							System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
							
						}
						
	//3a CRUST
						char z;
						System.out.println("\n\nWhat type of crust do you want?\n# Hand Tossed\tRs. 20\n# Thin-crust\tRs.40\n# Cheese burst\tRs.100 ");
						System.out.println("\nEnter h, t or c\n");
					    z = p.next().charAt(0);

					    if (z =='h') 
					    	{
					        	System.out.println("Hand Tossed crust pizza");
					        	cost = cost+20;
					        	System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
					        
					    	} 
					    else if(z=='t')
					    	{
					    		System.out.println("Thin crust pizza");
					    		cost = cost+40;
					        	System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
					    	}
					    else
				    		{
				    			System.out.println("Cheese burst pizza");
				    			cost = cost+100;
				        		System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
				    		}
						
	//3b VEG TOPPINGS					
						char g;
						int m;
						do
						{
					    System.out.println("\n\nDo you want to add new toppings?\n1.YES or 2.NO  ?\t");
					    m = p.nextInt();
					    
					    switch(m)
					    
					    {					    
					    case 1:
					    	System.out.println("\n#Onion\tRs.50\n#Corn\tRs.50\n#Prawns\tRs.65\n#Grilled chicken Rs.65\n\nEnter o, c, p or g \n");
					    	g = p.next().charAt(0);
					    			if(g=='o')
					    			{
					    				System.out.println("Onion topping added");
					    				cost = cost+50;
					            		System.out.println("Cart Price = " +cost+ "\n**************************************************");
					    			}
					    			else if(g=='c')
					    			{
					    				System.out.println("Corn topping added");
					    				cost = cost+50;
					            		System.out.println("Cart Price = " +cost+ "\n**************************************************");
					    			}
					    			else if(g=='p')
					    			{
					    				System.out.println("Prawns topping added");
					    				cost = cost+65;
					            		System.out.println("Cart Price = " +cost+ "\n**************************************************");
					    			}
					    			else
					    			{
					    				System.out.println("Grilled chicken topping added");
					    				cost = cost+65;
					            		System.out.println("Cart Price = " +cost+ "\n**************************************************");
					    			}
					    			break;
					    
					    }
					    }while (m != 2);
					   
						break;
						
//#4 NON VEG PIZZA				
				case 2: System.out.println("# Cheese & Pepperoni\tRs.500\n# Peri Peri Chicken\tRs.400\n# Barbecue Chicken\tRs.350");
						System.out.println("\nEnter c, p or b to add the pizza to the cart\n");
						l= p.next().charAt(0);
						if(l=='c')
						{
							System.out.println("You have selected Cheese & Pepperoni Pizza");
							cost = cost +500;
							System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
							
						}
						else if(l=='p')
						{
							System.out.println("You have selected Peri Peri Chicken Pizza");
							cost = cost+400;
							System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
							
						}
						else
						{
							System.out.println("You have selected Barbecue Chicken Pizza");
							cost = cost+350;
							System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
							
						}
		//4a CRUST
						char j;
						System.out.println("\n\nWhat type of crust do you want?\n# Hand Tossed\tRs. 20\n# Thin-crust\tRs.40\n# Cheese burst\tRs.100 ");
						System.out.println("\nEnter h, t or c\n");
					    j = p.next().charAt(0);

					    if (j =='h') 
					    	{
					        	System.out.println("Hand Tossed crust pizza");
					        	cost = cost+20;
					        	System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
					        
					    	} 
					    else if(j=='t')
					    	{
					    		System.out.println("Thin crust pizza");
					    		cost = cost+40;
					        	System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
					    	}
					    else
				    		{
				    			System.out.println("Cheese burst pizza");
				    			cost = cost+100;
				        		System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
				    		}
						
		//4b NON VEG TOPPINGS
					    char h;
					    int b;
					    do
					    {
					    System.out.println("\n\nDo you want to add new toppings?\n1.YES or 2.NO ?");
					    b = p.nextInt();
					    
					    switch(b)
					    {
					    case 1:	
					    	System.out.println("\n#Onion\tRs.50\n#Corn\tRs.50\n#Prawns\tRs.65\n#Grilled chicken Rs.65\n\nEnter o, c, p or g \n");
					    	h = p.next().charAt(0);	
					    	if(h=='o')
					    	{
					    		System.out.println("Onion topping added");
					    		cost = cost+50;
					    		System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
					    	}
					    	else if(h=='c')
					    	{
					    		System.out.println("Corn topping added");
					    		cost = cost+50;
					    		System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
					    	}
					    	else if(h=='p')
					    	{
					    		System.out.println("Prawns topping added");
					    		cost = cost+65;
					    		System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
					    	}
					    	else
					    	{
					    		System.out.println("Grilled chicken topping added");
					    		cost = cost+65;
					    		System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
					    	}
					    	break;
					    }
					    }while(b != 2);
						break;
						
						
//#5 SIDES
				case 3: System.out.println("# Coke\t\tRs.60\n# Garlic Bread\tRs.100\n# Pasta\t\tRs.130\n# Lava Cake\tRs.100");
				  		System.out.println("\nEnter c, g, p or l to add the side to the cart\n");
				  		k= p.next().charAt(0);
						if(k=='c')
						{
							System.out.println("You have selected Coke");
							cost = cost +60;
							System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
							
						}
						else if(k=='g')
						{
							System.out.println("You have selected Garlic Bread");
							cost = cost+100;
							System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
							
						}
						else if(k=='p')
						{
							System.out.println("You have selected Pasta");
							cost = cost+130;
							System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
							
						}
						else
						{
							System.out.println("You have selected Lava cake");
							cost = cost+100;
							System.out.println("Cart Price = Rs." +cost+ "\n**************************************************");
						}
						break;
			}
		}while(e != 4);

//#6 DISCOUNT
		if(cost >= 400)
			{
			System.out.println("\n\n#Your order amount is greater than 500\nYOU GET RS.100 OFF !!! ");
			cost = cost-100;
			System.out.println("\nBILL after discout = Rs." +cost+ "\n**************************************************");
			}
		else
		{
			System.out.println("\n\nYour order amount is less than 500\nYou do not get the discount ");
			System.out.println("\nBILL = Rs."+cost+ "\n**************************************************");
		}

//#7 PAYMENT
		int pay, no, month, year, cvv,pin;
		String name;
		System.out.println("\n\nPAYMENT METHOD\n1. Cash\t2. Card\n");
		pay = p.nextInt();
		switch(pay)
		{
		case 1:
			System.out.println("Pay the bill amount of Rs." +cost+ " in cash\n**************************************************" );
			break;
		
		case 2:
			System.out.println("Enter card number");
			no = p.nextInt();
			System.out.println("Enter expiration date's month and year");
			month = p.nextInt();
			year = p.nextInt();
			System.out.println("Enter CVV");
			cvv = p.nextInt();
			System.out.println("Enter card holder name");
			name = p.next();
			System.out.println("Enter the pin");
			pin = p.nextInt();
			System.out.println("\n\nBill amount of Rs."+cost+ " paid\n**************************************************");
			
			
			
		
		
		}
		
		
//#8 DELIVERY & PICK UP
		char v;
		System.out.println("\n\n#You want the ordered to be delivered or pick-up from the store?\nEnter d or p");
		v =p.next().charAt(0);


		if(v== 'd')
		{
			System.out.println("\nYour order will be delivered at your doorsteps !!!");
		}
		else
			System.out.println("\nYour order will be ready to be picked up from the store in 30 minutes !!!");
		
		System.out.println("\nHAPPY TO SERVE YOU :)\nTHANK YOU!!!");

	    
	}

}
