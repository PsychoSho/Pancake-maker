import java.util.Scanner;

public class pancake {

	public static void main(String[] args) {
		int eggsAmount;
	    int eggsMin = 1;
	    int milkAmount;
	    int milkMin = 100; //milliliter
	    int flourAmount;
	    int flourMin = 200; //grams 

	    System.out.println("Welcome! :D");
	    System.out.println("Pancake maker is starting up..");
	    System.out.println("How many eggs you have?");

	    Scanner userInput;
	    userInput = new Scanner(System.in);
	    eggsAmount = userInput.nextInt();
	    System.out.println("you have " + eggsAmount + " egg");
	    // eggs done
	    
	    System.out.println("How much milk you have?");
	    userInput = new Scanner(System.in);
	    milkAmount = userInput.nextInt();
	    System.out.println("you have " + milkAmount + " ml milk");
	    
	    System.out.println("how much flour you have?");
	    userInput = new Scanner(System.in);
	    flourAmount = userInput.nextInt();
	    System.out.println("you have " + flourAmount + " g flour");
	    
	    // main code here
	    if (eggsAmount < eggsMin || milkAmount < milkMin || flourAmount < flourMin) {
	    	System.out.println("Inefficient material !! pancake can't be made :(");
	    	
	    } else {
	    	// calculation
	    	flourAmount = flourAmount / flourMin;
	    	System.out.println("you have " + flourAmount + " part of flour");
	    	
	    	milkAmount = milkAmount / milkMin;
	    	System.out.println("you have " + milkAmount + " part of milk");
	    	
	    	//find smallest number of all 3
	    	int smallest;
	    	if (eggsAmount <= milkAmount && milkAmount <= flourAmount) {
	    		smallest = eggsAmount;
	    	} else if (milkAmount <= flourAmount && milkAmount <= eggsAmount) {
	    		smallest = milkAmount;
	    	} else {
	    		smallest = flourAmount;
	    	}
	    	System.out.println(" "); //every portion is 4 Pancake
	    	System.out.println("You can make " + smallest*4 + " of Pancake");
	    	System.out.println(" ");
	    	System.out.println("You will need " + smallest*eggsMin + " eggs");
	    	System.out.println("You will need " + smallest*flourMin + " flour");
	    	System.out.println("You will need " + smallest*milkMin + " milk");
	    	System.out.println("Pancake maker shutting down..");
	     }	
    	    
    }
	

    
}
