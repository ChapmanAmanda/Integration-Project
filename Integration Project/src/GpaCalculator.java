import java.util.Scanner;

/**
 * This class is a GPA calculator.
 * 
 * @author Amanda
 *
 */
class GpaCalculator {

  // menu choice #3
  // getGPA method
  // this method calculates the students GPA
  public static double getGradePointAve() {
    String grades = "";
    double total = 0;
    int points;
    int classNum = 0;
    Scanner input = new Scanner(System.in, "utf-8");
    System.out.println("\nLet's calculate your GPA: ");
    // ask user for the number of classes
    System.out.println("How many classes did you take? Enter an integer: ");
    try {
      classNum = input.nextInt();
    } catch (Exception ex) {
      System.out.println("Invalid entry");
      input.nextLine();
    }

    // get the grades for each class
    System.out.println("Enter your letter grade for each class (no number grades): ");

    for (int i = 0; i <= classNum; i++) { // this for loop runs for the amount
      // of classes
      try {
        grades = input.nextLine();
      } catch (Exception ex) {
        System.out.println("Invalid entry");
        input.nextLine();
      }

      if (grades.toLowerCase().equals("a")) { // these if-else statements match
        // the points with the grade
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
        input.close();
      }
    }
    double gpa = total / classNum; // calculate the current gpa
    System.out.println("Your current GPA is: " + gpa); // display to user
    return gpa;
  }
  // In this method the .equals method was used to compare the two strings
}
