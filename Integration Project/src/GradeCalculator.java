import java.util.Scanner;

/**
 * This class is a very basic average grade calculator.
 * 
 * @author Amanda
 *
 */

class GradeCalculator {
  // menu choice #2
  // getGrade method
  // this method calculates the grade average
  // This header contains a parameter
  // A parameter refers to the list of variables in a method declaration
  public static double getGrade() {
    Scanner sc = new Scanner(System.in, "utf-8");
    final double MAXGRADE = 100.0; // Checkstyle does not allow for all caps
    double gradeSum = 0;
    double add = 0;

    //greet
    System.out.println("Here we can calculate your average grade in a course.");
    // get number of assignments from user
    System.out.println("First, how many Assignments did you have? ");
    int assign = sc.nextInt();
    // gets grade for each number of assignments
    System.out.println("Enter your grade for each assignment as a whole or "
        + "decimal number and hit enter: ");
    
    //gets assignment grades and adds to accumulator
    for (int i = 0; i < assign; i++) {
      add = sc.nextDouble();
      while (add > MAXGRADE || add < 0) { // catches any grades that are too high
        System.out.println("Your grade is too high, must be < 100");
        add = sc.nextDouble();
        sc.close();
      }
      gradeSum += add; // add to the grade sum

    }
    double grade;
    grade = (double) gradeSum / assign; // calculate average grade and use casting
    System.out.println("\nYour average grade was " + grade); // show user their grade
    return grade;
  }
}
