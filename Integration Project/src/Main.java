import java.util.Scanner;

/**
 * This program is a demonstration of what I learned in COP2006. This is the driver class, "The
 * Program".
 * 
 * @author Amanda
 *
 */
public class Main {
  // This is a header
  // public is an access modifier
  // void is the return type, meaning this method doesn't return anything
  // method names should be in lowerCamelCase and be named with a verb

  /**
   * The main method displays the menu and runs the program.
   * 
   * @param args standard main method parameters.
   * @throws java.lang.Exception throws exception in case user enters wrong input.
   */
  public static void main(String[] args) throws java.lang.Exception {
    Scanner input = new Scanner(System.in, "utf-8");
    int menuChoice;
    boolean exit = false;

    String greeting = "\nHello!\nWelcome to my program!";
    System.out.println(greeting); // prints a greeting to the user
    do {
      // display menu and get input
      String menu =
          "\nPlease make a selection from the menu below:\n" + "\t1. Primitive Data Types\n"
              + "\t2. Grade calculator\n" + "\t3. GPA calculator\n" + "\t4. Java programming\n"
              + "\t5. Polymorphism and Inheritance\n" + "\t6. Arrays\n" + "\t7. Exit program";
      System.out.println(menu);
      System.out.println("Enter a number between 1 and 7: ");

      try {
        menuChoice = input.nextInt();
      } catch (Exception ex) {
        System.out.println("Invalid entry");
        input.nextLine();
        continue;
      }

      switch (menuChoice) {
        case 1:
          PrimitiveDataTypes.dataTypes(); // primitive data types, order
          // precedence, variable, scope,
          // casting, final
          break;
        case 2:
          GradeCalculator.getGrade();
          break;
        case 3:
          GpaCalculator.getGradePointAve();
          break;
        case 4:
          JavaProgrammming.java(); // demonstrates additional knowledge of java programming
          // incorporates random, Math, ternary.
          break;
        case 5:
          Polymorphism.polymorphism(); // inheritance and polymorphism
          break;
        case 6:
          Arrays.display();
          Arrays.arrayStuff();// arrays + private fields, setters,
          // getters, constructors
          break;
        case 7:
          exit = true;
          break;
        default:
          System.out.println("Invalid selection.");
      }
    } while (!exit);
    input.close();
  }
  // in this method, == was used to compare objects
  // == is not an assignment, it is testing to see if the objects are equal
  // .compareTo and .equals also compares two objects to test if they are
  // equal

}
