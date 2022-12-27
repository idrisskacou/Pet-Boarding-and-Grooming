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
		ArrayList<String> dog1 = new ArrayList<>(Arrays.asList("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", "United States"));

		// Instance variables (if needed)
	}
	/*_______________________*********_________________________________
	 * TODO A New Line of Code A
	 */
	public static void initializeDogList() {
		// This is the list of Array list of the dog in the System
		ArrayList<String> dog0 = new ArrayList<>(Arrays.asList());
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
//		System.out.println("Enter a menu selection");
	}
	/*_______________________*********_________________________________
	 * TODO C New Line of Code C
	 */
	public static void MenuOption() {
		System.out.println("\n\n");
		System.out.println("\t\t\t\tWelcome To Pet-Boarding & Gromming ");
		displayMenu();
		// This is the menu Option to select when to navigate on the main menu
		Scanner input = new Scanner(System.in);
		ArrayList<Character> options = new ArrayList<>(Arrays.asList('1','2','3','4','5','6','q'));
		//			char[] Aoptions = new char[] {'a','2','3','4','5','6','q'};
		//			System.out.println(Arrays.toString(Aoptions));
//		System.out.println("Enter The Option Info ?");
//		char[] optionsInfo = input.next().toCharArray();
		while (options == options) {
			//				displayMenu();
			for (int i = 0; i < options.size(); i++) {
				System.out.println("Enter a menu selection");
				System.out.println(">");
				char c = input.next().charAt(i);

				if (c == '1') {
					System.out.println("[" + c + "]" + " Intake a new dog:");
					intakeNewDog();
					break;
				} else if (c == '2') {
					System.out.println("[" + c + "]" + " Intake a new monkey ");
					intakeNewDog();
					//						intakeNewMonkey(input);
					return;
				} 
				else if (c == '3') {
					System.out.println("[" + c + "]" + "Reserve an animal ");
					reserveAnimal(input);
					break;
				} else if (c == '4') {
					System.out.println("[" + c + "]" + "Reserve an animal ");
					//				printAnimals(options); // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
					break;
				} else if (c == '5') {
					System.out.println("[" + c + "]" + "printAnimals(options) ");
					//				printAnimals(options); // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
					break;
				} else if (c == '6') {
					System.out.println("[" + c + "]" + "Reserve an animal ");
					//				printAnimals(options); // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
					break;
				}else if (c == 'q') {
					System.out.println("[" + c + "]" + "Reserve an animal ");
					// This line exist from the code
					return;
				}else {
					System.out.println("[" + c + "]" + "You have entered an invalid input. Please enter a valid input.");
					break;
				}
			}
		}
	} 
	/*_______________________*********_________________________________
	 *TODO D New Line of Code D
	 */

	public static void intakeNewDog() {
		ArrayList<Character> options = new ArrayList<>(Arrays.asList('1','2','3','4','5','6','q'));

		System.out.println("What is the dog's name?");
		//		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		for (Dog dog : Driver.dogList) {
			if (dog.getPetName().equalsIgnoreCase(name)) {
				System.out.println("\n\nThis dog is already in our system\n\n");
				return;
			}
		}
		//TODO Change this code below for generate animal. This code can be use.
		System.out.println("What is the dog's breed?"); // the following is to add a new dog to the system
		String breed = input.nextLine();
		System.out.println("What is the dog's gender?"); // This is the gender for the animal 
		String gender = input.nextLine();
		System.out.println("What is the dog's age?"); // This is the age of the animal 
		String age = input.nextLine();
		System.out.println("What is the dog's weight?"); // This is the weight to the animal
		String weight = input.nextLine();
		System.out.println("What is the dog's acquisition date (MM/DD/YEAR) ?"); // This is the year and date acquire the animal
		String acquisitionDate = input.nextLine();
		System.out.println("What is the dog's acquisition country?"); // This is the country acquire the animal 
		String acquisitionCountry = input.nextLine();
		System.out.println("What is the dog's training status?"); // This is the status of the Animal 
		String trainingStatus = input.nextLine();
		System.out.println("Is this dog reserved?(True or False)"); // This is the reserving 
		boolean reserved = input.nextBoolean(); //Re
		//		input.nextLine();
		System.out.println("Which country is the dog in service?"); //The country dog i
		String inServiceCountry = input.nextLine(); //Service Country 
		System.out.println("Your entry has been added to the Dog List.");
		//TODO I need to add this to the array and create a document in the folder to save it. 
		//		Dog dog4 = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
	}
	/*_______________________*********_________________________________
	 *TODO D New Line of Code E
	 */
	public static void reserveAnimal(Scanner scanner) {
		String answer;
		do {
			String yes = "yes";
			String no = "no";
			System.out.println("Do you want to resever in Animal? [Yes] or [No ]");
			answer = scanner.nextLine();
			if (answer == yes) {
				System.out.println("What type of Animal do you want to reserver?");
				System.out.println("[1] Dog ");
				System.out.println("[2] Cat ");
				System.out.println("[3] Monkey ");
				System.out.println("[4] Other Animal type such as Bird, Fish, Snake, etc ...");
				System.out.println("[q] Quit or Return ");
				String animalType = scanner.nextLine();
				if (animalType.equalsIgnoreCase("Cat")||(animalType.equalsIgnoreCase("Dog"))) {
					System.out.println("Enter the " + animalType.toLowerCase() +" is acquisition country : ");
					String country = scanner.nextLine();
					//				for (Dog objdDog : Driver.dogList) {
					//					if( objdDog.get)
					//				}
					return;

				} else if (animalType.equalsIgnoreCase("Monkey")) {
					System.out.println("Enter the " + animalType.toLowerCase() +" is acquisition country : ");
					String country = scanner.nextLine();
				}else {
					System.out.println("Animal type not found.");
				}
			} else if (answer == no) {

			}{
				System.out.println("You enter an invalide entery");
			}

		} while(answer != "q");
	}


	/*_______________________*********_________________________________
	 *TODO D New Line of Code E
	 */
	public static void main(String[] args) {
		// // Inheritance (This called the other Java code)
		//		reserveAnimal(input);
		MenuOption();
	}
}
