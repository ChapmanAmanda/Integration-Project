import java.util.Scanner;

// Amanda Chapman
// This program is a demonstration of what I learn in COP2006
// Driver class, "The Program"

public class Main {
	// This is a header
	// public is an access modifier
	// void is the return type, meaning this method doesn't return anything
	// method names should be in lowerCamelCase and be named with a verb

	public static void main(String[] args) throws java.lang.Exception{
		Scanner input = new Scanner(System.in);
		int program =1;
		int menuChoice;

		String greeting = "Hello!\nWelcome to my program!\n";
		System.out.println(greeting); // prints a greeting to the user
		do {
			//display menu and get input
			String menu = "Please make a selection from the menu below:\n" + "\t1. Primitive Data Types\n"
					+ "\t2. Grade calculator\n" + "\t3. GPA calculator\n" + "\t4. Java programming\n"
					+ "\t5. Polymorphism and Inheritance\n";
			System.out.println(menu);
			System.out.println("Enter a number between 1 and 5: ");
			
			menuChoice = input.nextInt();
			switch (menuChoice) {
			case 1:
				Option1.dataTypes(); // primitive data types, order precedence, variable, scope, casting, final
				break;
			case 2:
				Option2.getGrade();
				break;
			case 3:
				Option3.getGPA();
				break;
			case 4:
				Option4.javaQuiz();
				break;
			case 5:
				Option5.polymorphism();
				break;
			default:
				System.out.println("The number you entered is invalid.");
				menuChoice = input.nextInt();
			}
		}while(program == 1);
		
		
		try {
			System.out.println("Enter an integer between 1 and 5.");
			menuChoice = input.nextInt();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	// in this method, == was used to compare objects
	// == is not an assignment, it is testing to see if the objects are equal
	// .compareTo and .equals also compares two objects to test if they are equal
}
