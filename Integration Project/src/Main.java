import java.util.Scanner;

// Amanda Chapman
// This program is a demonstration of what I learn in COP2006

// Driver class, "The Program"
public class Main {

  // This is a header
  // public is an access modifier
  // void is the return type, meaning this method doesn't return anything
  // method names should be in lowerCamelCase and be named with a verb
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String greeting = "Hello!\nWelcome to my program!\n";
    System.out.println(greeting); // prints a greeting to the user

    int continueQuiz = 1;


    do {

      String menu = "Please make a selection from the menu below:\n" + "\t1. Primitive Data Types\n"
          + "\t2. Grade calculator\n" + "\t3. GPA calculator\n" + "\t4. Java programming\n"
          + "\t5. Exit the program";

      System.out.println(menu);
      System.out.println("Enter a number between 1 and 5: ");
      int menuChoice = input.nextInt();

      if (menuChoice == 1) {
        // primitive data types
        // this is a method call
        Option1.dataTypes();

        // this calls the method dataTypes from the class Option1

      } else if (menuChoice == 2) {
        // grade calculator
        double MAXGRADE = 100.0;
        double gradeSum = 0;
        double add = 0 ;
        double grade = 0 ;
        Option2.getGrade(MAXGRADE, gradeSum, add, grade);
        
      } else if (menuChoice == 3) {
        // gpa calculator
        Option3.getGPA();
      } else if (menuChoice == 4) {
        // fun java quiz
        Option4.javaQuiz();
      } else if (menuChoice == 5) {
        // exit the program
        System.out.println("\nGoodbye!");
        System.exit(0);
      } else {
        while (menuChoice != 5) {
          System.out.println("Enter a number between 1 and 5: ");
          menuChoice = input.nextInt();
        }
      }

      System.out.println("\n_________________________________________________________");
      System.out.println("\nWould you like to see the menu? 1 for yes or 2 for no: ");
      continueQuiz = input.nextInt();

    } while (continueQuiz == 1);

    input.close();
  }
  // in this method, == was used to compare objects
  // == is not an assignment, it is testing to see if the objects are equal
  // .compareTo and .equals also compares two objects to test if they are equal
}

