import java.util.ArrayList;

/**
 * This class demonstrates arrays.
 * 
 * @author Amanda
 *
 */

class Arrays {
  public static void display() {
    System.out.println("\nGreat choice!\nThis section demonstrates the use of arrays.");
    // declare variable to reference student
    Student student1;
    student1 = new Student("Aaron", 85.2, 3.2); //

    // print student1 name and their grade
    System.out.println("Student Name: " + student1.getStudentName(""));
    System.out.println("Grade in the course: " + student1.getCourseGrade());
  }

  // this method demonstrates the different uses for arrays
  public static void arrayStuff() {
    System.out.println("");

    // Multi-dimensional array
    System.out.println("Demonstration of a multi-dimensional array: ");
    String[][] multiArray = {{"Amanda ", "Java ", "Rocks "}, {"Chapman", "Integration"}};
    System.out.println(multiArray[0][0] + multiArray[1][0]);
    System.out.println(multiArray[0][2] + multiArray[0][1] + "\n"); // print multi-dimentional array

    // ArrayList
    ArrayList<Integer> numbers = new ArrayList<Integer>(500);
    numbers.add(10); // add numbers to the array
    numbers.add(100);
    numbers.add(67);
    System.out.println("The number at index zero is: " + numbers.get(0) + "\n");
    // prints the number at index 0


    // 2D array
    System.out
        .println("Let's search an array and I will tell you where I found the numbers: ");
    int[][] twoArray = {{1, 2}, {3, 4}};
    for (int r = 0; r < twoArray.length; r++) { // adds numbers to the 2d array
      for (int c = 0; c < twoArray[r].length; c++) {
        twoArray[r][c] = r + c;
      }
    }

    // search the array
    int x;
    int y;
    for (int r = 0; r < twoArray.length; r++) {
      for (int c = 0; c < twoArray[0].length; c++) {
        if (twoArray[r][c] == 1) {
          x = r;
          y = c;
          System.out.println("Found at (" + x + ", " + y + ")"); // prints coordinates where found
        }
      }
    }
  }
}
