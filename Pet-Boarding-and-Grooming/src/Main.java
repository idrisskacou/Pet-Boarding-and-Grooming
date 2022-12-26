import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	Dog dogFunction = new Dog();
	Cat catFunction = new Cat();
	boolean dogCode  = true;

	public class Driver {
		private static ArrayList<Dog> dogList = new ArrayList<Dog>();
		// Instance variables (if needed)
	}
	/*_______________________*********_________________________________
	 * TODO A New Line of Code A
	 */
	public static void initializeDogList() {
		// This is the list of Arraylist of the dog in the System
		ArrayList<String> dog1 = new ArrayList<>(Arrays.asList("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", "United States"));
		ArrayList<String> dog2 = new ArrayList<>(Arrays.asList("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", "United States"));
		ArrayList<String> dog3 = new ArrayList<>(Arrays.asList("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", "Canada"));
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
	}
	/*_______________________*********_________________________________
	 * TODO B New Line of Code B
	 */
	public static void displayMenu() {
		// This is the display Menu, this display need some work 
		System.out.println("\n\n");
		System.out.println("\t\t\t\tRescue Animal System Menu");
		System.out.println("[1] Intake a new dog");
		System.out.println("[2] Intake a new monkey");
		System.out.println("[3] Reserve an animal");
		System.out.println("[4] Print a list of all dogs");
		System.out.println("[5] Print a list of all monkeys");
		System.out.println("[6] Print a list of all animals that are not reserved");
		System.out.println("[q] Quit application \n");
		System.out.println("Enter a menu selection");
	}
	/*_______________________*********_________________________________
	 * TODO C New Line of Code C
	 */
	public static void MenuOption() {
		// This is the menu Option to select when to navigate on the main menu
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n");
		System.out.println("\t\t\t\tWelcome To Pet-Boarding & Gromming ");
		displayMenu();
		
		
			
			ArrayList<Character> options = new ArrayList<>(Arrays.asList('1','2','3','4','5','6','q'));
//			char[] Aoptions = new char[] {'a','2','3','4','5','6','q'};
//			System.out.println(Arrays.toString(Aoptions));
			char[] optionsInfo = input.next().toCharArray();
			//			options = input.next().charAt(0);
			while (options == options) {
				displayMenu();
				for (int i = 0; i < options.size(); i++) {
					System.out.println(">");
					char c = input.next().charAt(i);
					
					if (c == '1') {
						System.out.println("Intake a new dog:  " + c);
						break;
					} else if (c == '2') {
						System.out.println(" Intake a new monkey " + c);
//						intakeNewMonkey(input);
						break;
					} 
					else if (c == '3') {
						System.out.println("Reserve an animal " + c);
//						reserveAnimal(input);
						break;
					} else if (c == '4') {
						System.out.println("Reserve an animal " + c);
						//				printAnimals(options); // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
						break;
					} else if (c == '5') {
						System.out.println("printAnimals(options)  " + c);
						//				printAnimals(options); // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
						break;
					} else if (c == '6') {
						System.out.println("Reserve an animal " + c);
						//				printAnimals(options); // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
						break;
					}else if (c == 'q') {
						System.out.println("Reserve an animal " + c);
						// This line exist from the code
						return;
					}else {
						System.out.println("You have entered an invalid input. Please enter a valid input.");
						break;
					}
				}
			}
		} 
	/*_______________________*********_________________________________
	 *TODO D New Line of Code D
	 */

	public static void main(String[] args) {
		// // Inheritance (This called the other Java code)

		MenuOption();
		// Hint: create a Scanner and pass it to the necessary
		Scanner input = new Scanner(System.in);
	}
}
