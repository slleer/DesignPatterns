import java.util.Scanner;
import java.util.HashMap;
public class Customer{
	public static void main(String[] args) {
		Server server = new Server();
		Cook cook = new Cook();
		BurgerCommand burger = new BurgerCommand(cook);
		ShakeCommand shake = new ShakeCommand(cook);
		FryCommand fries = new FryCommand(cook);
		HashMap<Integer, Command> menu = new HashMap<Integer, Command>();
		menu.put(1, burger);
		menu.put(2, fries);
		menu.put(3, shake);
		Scanner scannerObj = new Scanner(System.in);
		int input = 0;
		System.out.println("Welcome to the diner! Let me take your order.");
		System.out.println("We only serve 3 things: burgers, fries, and vanilla shakes.");
		System.out.println("What would you like?\ntype 1 for burger, 2 for fries, 3 for shake.");
		do {
			try {
				input = scannerObj.nextInt();
				if(input > 0 && input < 4) {
					server.takeOrder(menu.get(input));
					System.out.println("If that is all you would like please type -1 or...");
					System.out.println("Would you like something else to go with that?");
					System.out.println("type 1 for burger, 2 for fries, 3 for shake.");
				} else if(input == -1) {
					System.out.println("I'll have the cook start that right away.... Hey Marv, Order UP!\n");
					server.orderUp();
				} else {
					System.out.println("That wasn't an option, sorry.");
					System.out.println("What would you like?\ntype 1 for burger, 2 for fries, 3 for shake.");
				}
			} catch(Exception e) {
				System.out.println("That wasn't an option, sorry.");
				System.out.println("What would you like?\ntype 1 for burger, 2 for fries, 3 for shake.");
				System.out.println("Or type -1 if your done.");
			} 
			
				
		}while (input != -1);
		System.out.println("Thanks for coming in!");
	}
}