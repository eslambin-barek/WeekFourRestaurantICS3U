import java.util.*;
/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date: Friday Sept. 25
 * Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the following criteria:
Create a restaurant of your choosing
Print menu items one at a time, including the price.
Ask how many of each item they would like to purchase
Must have at least 5 different menu items
Calculate the total price
If the total is more than $30, take off 10%.
If the total is more than $50, take off 20%.
Add 13% HST  to the total
Print out the initial price, any discounts, taxes, and the grand total.
Read in a payment amount from the user
Calculate the change
If the change is negative, state that they still owe you money.
This is to be done individually.
DO NOT use AI! 
Feel free to use previous notes, videos, and online resources like w3schools.com
Fork the repository, add me (MrZebarth) as a collaborator, clone the repository to your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// code under---		 
		
		
		
		int CaeserSaladPrice = 6;
		// print restaurant name.
		System.out.println("Welcome to Eslam's Restaurant!");
		// ask about 10$ Shawarma bowl
		System.out.println("We serve our world famous 10$ Shawarma bowls as a main dish here. How much would you like?");
		int num1 = in.nextInt();
		System.out.println("You ordered "+num1+"! that will be "+num1*10+"$. ");
		System.out.println("We sell Caeser salads as a side dish for 5$. How many would you like?");
		int num2 = in.nextInt();
		System.out.println("You ordered "+num2+"! That will be "+num2*5+"$. ");
		System.out.println("We sell drinks for a 2$ each. How much would you like?");
		int num3 = in.nextInt();
		System.out.println("You ordered "+num3+"! That will be "+num3*2+"$. ");
		System.out.println("We sell an Egg Sandwhich for 3$ as well. How many of them would you like?");
		int num4 = in.nextInt();
		System.out.println("You ordered "+num4+"! That will be "+num4*3+"$. ");
		System.out.println("We sell Ice cream as a dessert for 4$ as well. How many of them would you like?");
		int num5 = in.nextInt();
		System.out.println("You ordered "+num5+"! That will be "+num5*4+"$. ");
		
		double miniPrice1 = num1*10;
		double miniPrice2 = num2*5;
		double miniPrice3 = num3*2;
		double miniPrice4 = num3*3;
		double miniPrice5 = num5*4;
		double Price = miniPrice1 + miniPrice2 + miniPrice3 + miniPrice4 + miniPrice5*1.13  ;

		System.out.println("Your total price comes out to "+Price+"$ ");

		System.out.println(Price > 30);
		boolean SpecialPrice1 = true;
		if (Price > 30) { 
			  System.out.println("You got a 10% discount! Your new price is "+SpecialPrice1+" ");
			} else {
			  System.out.println("Thank you for choosing Eslam's Restaurant!");
			}
		if (Price > 50)
			  System.out.println("You get a 20% discount!");
	}

}
