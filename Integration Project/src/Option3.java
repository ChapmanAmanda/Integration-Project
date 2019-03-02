import java.util.Scanner;
// Amanda Chapman
// This program is a demonstration of what I learn in COP2006
// This class is a GPA calculator

class Option3 {

  // menu choice #3
  // getGPA method
  // this method calculates the students GPA
  public static void getGPA() {
    Scanner input = new Scanner(System.in);
    System.out.println("How many classes did you take? "); // ask user for num of classes
    int classNum = input.nextInt();

    String grades = "";
    double total = 0;
    int points;

    System.out.println("Enter your letter grade for each class: ");

    for (int i = 0; i <= classNum; i++) { // this for loop runs for the amount of classes
      grades = input.nextLine();

      if (grades.equals("A")) { // these if-else statements match the points with the grade
        points = 4; // and adds to the accumulating total
        total = total + points;
      } else if (grades.equals("B")) {
        points = 3;
        total = total + points;
      } else if (grades.equals("C")) {
        points = 2;
        total = total + points;
      } else if (grades.equals("D")) {
        points = 1;
        total = total + points;
      } else if (grades.equals("F")) {
        points = 0;
        total = total + points;
      }
    }
    double gpa = total / classNum; // calculate the current gpa

    System.out.println("Your current GPA is: " + gpa); // display to user
    input.close();
  }
  // In this method the .equals method was used to compare the two strings
}
