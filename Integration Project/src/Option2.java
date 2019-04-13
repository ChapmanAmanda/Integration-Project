import java.util.Scanner;
// Amanda Chapman
// This program is a demonstration of what I learn in COP2006
// This class is a very basic average grade calculator

class Option2 {
	// menu choice #2
	// getGrade method
	// this method calculates the grade average
	// This header contains a parameter
	// A parameter refers to the list of variables in a method declaration
	public static double getGrade() {
		Scanner input = new Scanner(System.in);
		double MAXGRADE = 100.0;
		double gradeSum = 0;
		double add = 0;
		double grade = 0;

		// get number of assignments from user
		System.out.println("How many Assignments did you have? ");
		int assign = input.nextInt();

		System.out.println("Enter your grades for your assignments: ");
		for (int i = 0; i < assign; i++) {
			add = input.nextDouble(); // get each grade for # of assignments
			while (add > MAXGRADE) {
				System.out.println("Your grade is too high, must be < 100");
				add = input.nextDouble();
			}
			gradeSum += add; // add to the grade sum

		}

		grade = (int) gradeSum / assign; // calculate average grade and use casting

		System.out.printf("\nYour average grade was " + grade); // show user their grade

		return grade;
	}
}
