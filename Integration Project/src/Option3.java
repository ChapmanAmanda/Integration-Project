import java.util.Scanner;
// Amanda Chapman
// This program is a demonstration of what I learn in COP2006
// This class is a GPA calculator

class Option3 {

	// menu choice #3
	// getGPA method
	// this method calculates the students GPA
	public static void getGPA() {
		String grades = "";
		double total = 0;
		int points;
		Scanner input = new Scanner(System.in);

		// ask user for the number of classes
		System.out.println("How many classes did you take? ");
		int classNum = input.nextInt();

		// get the grades for each class
		System.out.println("Enter your letter grade for each class: ");

		for (int i = 0; i <= classNum; i++) { // this for loop runs for the amount of classes
			grades = input.nextLine();

			if (grades.toLowerCase().equals("a")) { // these if-else statements match the points with the grade
				points = 4; // and adds to the accumulating total
				total = total + points;
			} else if (grades.toLowerCase().equals("b")) {
				points = 3;
				total = total + points;
			} else if (grades.toLowerCase().equals("c")) {
				points = 2;
				total = total + points;
			} else if (grades.toLowerCase().equals("d")) {
				points = 1;
				total = total + points;
			} else if (grades.toLowerCase().equals("f")) {
				points = 0;
				total = total + points;
			}
		}
		double gpa = (int) total / classNum; // calculate the current gpa

		System.out.println("Your current GPA is: " + gpa); // display to user

	}
	// In this method the .equals method was used to compare the two strings
}
