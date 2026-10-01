//Lily Fraser APCSA
//ask about scanner for ints
//LemonadeStand.java
import java.util.Scanner; //Scanner is a class

public class LemonadeStand {

	//cashOnHand is private so no one takes your money==> limited to LemonadeStand.java class
	
      	double cash = 50.0;
	double costOfLemon = 1.50; //qty one lemon
	double costOfSugar = 2.00; //qty 1 cup of sugar
	double costOfIceBag = 3.50;   //qty 1 cup of ice
	double costOfCup = 0.25;   //qty 1 cup

	int lemonsPossibleToBuy = (int)(cash/costOfLemon);
	int sugarPossibleToBuy;
	int iceBagsPossibleToBuy;
	int cupsPossibleToBuy;

	int qtyLemons = 0;         //how many lemons you HAVE
	int qtySugars = 0;   //how many sugars you HAVE
	int qtyIceBags = 0;            //how many ice bags you HAVE
	int qtyCups = 0;           //how many cups you HAVE
	int qtyCupsLemonade = 0;   //how many cups of lemonade you made
	int lemonsPerPitcher;   //how many lemons per cup of lemonade
	int icePerPitcher;   //how many ice bags per cup of lemonade
	int cupsSugarPerPitcher; //how many cups of sugar per pitcher
	double cupsSugarPerCup;   //how many cups of sugar per cup of lemonade, a double bc the user could do a half a cup
	Scanner scan = new Scanner(System.in);

public void setup() {
	int daysTotal;
	String name;
	System.out.println("What is your name?");
	name = scan.nextLine();
	
	System.out.println("Hi, "+name+"! How many days would you like to play for? Please enter an integer.");
	daysTotal = scan.nextInt();
	String buffer = scan.nextLine();
	System.out.println("Here are instructions on how to play Lemonade Stand.");
	System.out.println("You have $"+cash+"currently to spend on lemons, sugar, ice, and cups.");
	System.out.println("After you buy supplies, you'll be asked to create a recipe for your lemonade.\n You also need to set a price for your lemonade.");
	System.out.println("Depending on the recipe and the price, a certain amount of customers will come each day.");
	System.out.println("At the end of each day, you can buy more supplies using the money you made and change your recipe to increase customer satisfaction.");
	System.out.println("And a quick note: if you don't have any cups, you can't sell lemonade! Make sure you save enough money for those.");
	
	String response1 = "no";
	while (response1 != "yes")
	{
		System.out.println("When you have read and understand these instructions, type 'yes'.");
		response1 = scan.nextLine();

	}
	
	int day = 1;
	String responseToBuyingSupplies  ="yes";

	
	
	while(day <= daysTotal)
	{
		int totalSupplies = qtyLemons + qtySugars + qtyIce + qtyCups;
		//this means they have enough money to buy supplies
		if (cash >= 0.25)
		{
			System.out.println("You currently have "+qtyLemons+" lemons, "+qtySugars+" cups of sugar, "+qtyIce+" bags of 20 ice cubes, and "+qtyCups+" cups.");
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
		if (responseToBuyingSupplies == "yes")
		{
			int qtyNewLemons;
			int remainingCash;
			lemonsPossibleToBuy = (int)(cash/costOfLemon);
			System.out.println("Please type in an integer for how many lemons you would like to buy. You currently have "+qtyLemons+", can buy up to"+lemonsPossibleToBuy+", and you have $"+cash+". If you do not want to buy any lemons, type 0.");
			qtyNewLemons = scan.nextInt();
			buffer = scan.nextLine();
			qtyLemons = qtyLemons+qtyNewLemons;
			 double qtyCashSpentOnLemons = (double)(qtyNewLemons*costOfLemon);
			cash = cash-qtyCashSpentOnLemons;

			//now doing sugar

			int sugarPossibleToBuy = (int)(cash/costOfSugar);
			int qtyNewCupsSugar;
			System.out.println("Please type in an integer for how many cups of sugar you would like to buy. You currently have " + qtySugars + " cups of sugar, can buy up to" + sugarPossibleToBuy + ", and you have $" + cash + ". If you do not want to buy any cups of sugar, type 0.");
			qtyNewCupsSugar = scan.nextInt();
			buffer = scan.nextLine();
			qtySugars = qtySugars+qtyNewCupsSugar;
			qtyCashSpentOnLemons = (double)(qtyNewLemons*costOfLemon);
			cash = cash-qtyCashSpentOnLemons;

			//now doing ice

			int icePossibleToBuy = (int)(cash/costOfIceBag);
			int qtyNewIceBags;
			System.out.println("Please type in an integer for how many bags of ice you would like to buy. You currently have " + qtyIceBags + " bags of ice, can buy up to" + icePossibleToBuy + ", and you have $" + cash + ". If you do not want to buy any bags of ice, type 0.");
			qtyNewBagsIce = scan.nextInt();
			buffer = scan.nextLine();
			qtyIceBags = qtyIceBags+qtyNewIceBags;
			qtyCashSpentOnIce = (double)(qtyNewIce*costOfIceBag);
			cash = cash-qtyCashSpentOnIce;

			//now doing cups

			int cupsPossibleToBuy = (int)(cash/costOfCup);
			int qtyNewCups;
			System.out.println("Please type in an integer for how many cups you would like to buy. You currently have " + qtyCups + " cups, can buy up to" + cupsPossibleToBuy + ", and you have $" + cash + ". If you do not want to buy any cups, type 0.");
			qtyNewCups = scan.nextInt();
			buffer = scan.nextLine();
			qtyCups = qtyCups+qtyNewCups;
			qtyCashSpentOnCups = (double)(qtyNewCups*costOfCups);
			cash = cash-qtyCashSpentOnCups;
		}
		//making recipie
		
		
		
	}
   }  //close setup
}
