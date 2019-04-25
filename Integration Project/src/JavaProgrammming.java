import java.util.Random;

/**
 * This class is made up of java programming lessons that demonstrate how the random and Math
 * class work.
 * 
 * @author Amanda
 *
 */

class JavaProgrammming {
  // menu choice #4
  public static void java() {
    System.out.println("\nExcellent Choice!");
    String test = "ternary";
    Random dice = new Random();
    int number;
    boolean maximum = 10 > 0;
    
    System.out.println("This section demonstrates how Java is able to \ngenerate "
        + "random numbers and calculate minimum \nand maximum numbers through the math class.");
    // This uses the ternary construct to tell whether bools = "ternary"
    System.out.println("Test the ternary:\n");
    String bools = test.equals("ternary") ? "test is \"ternary\"" : "test is not \"ternary\"";
    System.out.println(bools);

    // This uses the Math class to show the minumimum number out of 10 and 4
    System.out.println("\nMinimum of 10 and 4 is: " + Math.min(4, 10));

    // This shows the boolean, whether it is true or false
    System.out.println("The boolean is " + maximum + "because 10 > 0 .");

    // This is a Random dice generator
    // It will roll the dice 4 times and show the number rolled each time
    System.out.println("\nRandom dice roller: ");
    for (int counter = 1; counter <= 4; counter++) {
      number = dice.nextInt(6);
      System.out.println(number + " ");
    }
    for (int i = 0; i <= 2; i++) {
      switch (i) {
        case 0:
          System.out.println(i);
          break;
        case 1:
          System.out.println(i);
          break;
        case 2:
          System.out.println(i);
          break;
        default:
          System.out.println("i is not between 0 and 2");
      }
    }

  }
}
