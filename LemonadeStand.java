//Lily Fraser APCSA
//ask about scanner for ints
//LemonadeStand.java
import java.util.Scanner; //Scanner is a class

public class LemonadeStand {

	//cashOnHand is private so no one takes your money==> limited to LemonadeStand.java class
	private double cashOnHand;
        double cash = 50.0;
	double costOfLemon = 1.50; //qty one lemon
	double costOfSugar = 2.00; //qty 1 cup of sugar
	double costOfIce = 1.75;   //qty 1 cup of ice
	double costOfCup = 0.25;   //qty 1 cup
	int qtyLemons = 0;         //how many lemons you HAVE
	int qtySugars = 0;   //how many sugars you HAVE
	int qtyIce = 0;            //how many ice you HAVE
	int qtyCups = 0;           //how many cups you HAVE
	int qtyCupsLemonade = 0;   //how many cups of lemonade you made
	int lemonsPerPitcher;   //how many lemons per cup of lemonade
	int icePerCup;   //how many ice cubes per cup of lemonade
	double cupsSugarPerCup;   //how many cups of sugar per cup of lemonade, a double bc the user could do a half a cup
	Scanner scan = new Scanner(System.in);

public void setup() {
	int daysTotal;
	String name;
	System.out.println("What is your name?");
	name = scan.nextLine();
	System.out.println("Hi, "+name+"! How many days would you like to play for? Please enter an integer.");
	daysTotal = scan.nextline();
	System.out.println("Here are instructions on how to play Lemonade Stand.");
	System.out.println("You have $"+cash+"currently to spend on lemons, sugar, ice, and cups.");
	System.out.println("After you buy supplies, you'll be asked to create a recipe for your lemonade.\n You also need to set a price for your lemonade.");
	System.out.println("Depending on the recipe and the price, a certain amount of customers will come each day.");
	System.out.println("At the end of each day, you can buy more supplies using the money you made and change your recipe to increase customer satisfaction.");
	
	String response1;
	while (response1 != "yes")
	{
		System.out.println("When you have read and understand these instructions, type 'yes'.");
		String response1 = scan.nextLine();
	}
	
	int day = 1;
	String responseToBuyingSupplies;
	
	while(day <= daysTotal)
	{
		int totalSupplies = qtyLemons + qtySugars + qtyIce + qtyCups;
		//this means they have enough money to buy supplies
		if (cash >= 0.25)
		{
			System.out.println("You currently have "+qtyLemons+" lemons, "+qtySugars+" sugars, "+qtyIce+" ice cubes, and "+qtyCups+" cups.");
			System.out.println("It is day "+day+". You currently have $"+cash+". Would you like to buy more supplies? Type 'yes' if so. Type 'no' if not.");
			responseToBuyingSupplies = scan.nextLine();

		}
		//this means they do not have enough money to buy supplies
		if (cash < 0.25)
		{
			if(totalSupplies == 0 || qtyCups == 0)
			{
				System.out.println("Game over. You do not have enough supplies or money to continue. Thanks for playing!");
				day = daysTotal+1;
			}
		}
		//if they said they would like to buy supplies
		if (responseToBuySupplies == "yes")
		{
			
		}
		
	}
   }  //close setup
}
