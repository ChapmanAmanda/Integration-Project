import java.util.Scanner;

/**
 * This is the class used to get the student information. This class demonstrates arrays, private
 * fields, setters, getters, and constructors.
 * 
 * @author Amanda
 *
 */

public class Student {
  Scanner sc = new Scanner(System.in, "utf-8");
  private String studentName;
  private double courseGrade;

  private double min;
  int num;
  double sum = 0;
  double average;

  // constructor
  public Student() {}

  public Student(String name, double grade, double gradePointAverage) {}

  // setter methods - mutators
  public void setStudentName(String name) {
    studentName = name;
  }

  public void setCourseGrade(double grade) {
    courseGrade = grade;
  }

  public void setMinScore(double minScore) {
    min = minScore;
  }

  // getter methods
  /**
   * The getStudentName takes user input as their name to display throughout this section.
   * 
   * @param name takes in the name variable to set it to the private studentName.
   * @return the users input for their name.
   */
  public String getStudentName(String name) {
    System.out.println("Please enter your name: ");
    try {
      studentName = sc.nextLine();
    } catch (Exception ex) {
      System.out.println("Invalid entry");
      sc.nextLine();
    }
    return studentName;
  }

  // Overloading a method example.
  /*
   * public double getCourseGrade() { return courseGrade; }
   */

  /**
   * This prompts user for their assignment number and grades, then calculates the average.
   * 
   * @return the average grade for the course is returned.
   */
  public double getCourseGrade() {

    // gets scores for number of assignments and accumulates the sum
    System.out.println("How many assignments were graded? ");
    try {
      num = sc.nextInt();
    } catch (Exception ex) {
      System.out.println("Invalid entry");
      sc.nextLine();
      num = 1;
    }  
    double[] scores = new double[num];

    // grades go into an array for each number of assignments
    System.out.println("Enter your " + num + " grades and I will calculate your average: ");
    for (int i = 0; i < num; i++) {
      try {
        scores[i] = sc.nextDouble();
      } catch (Exception ex) {
        System.out.println("Invalid entry");
        sc.nextLine();
      }
    }
    
    for (double x : scores) { // enhanced for loop
      sum += x; // sum of an array
    }

    // calculate the average once we have the sum
    average = sum / num;

    // print course grade results
    System.out.println("Your scores were: ");
    for (int i = 0; i < num; i++) {
      System.out.print(scores[i] + " ");
    }
    

    // print the average
    System.out.println("\nYour grade average was: " + average);
    courseGrade = average; // assigns average to courseGrade

    double minScore;
    // manually find the lowest score in the array and display to user
    minScore = scores[0];
    for (int i = 1; i < num; i++) {
      if (scores[i] < minScore) {
        minScore = scores[i];
      }
    }
    
    minScore = min; // the users lowest grade.
    // System.out.println("Your lowest grade was: " + min);
    return courseGrade;
  }
  
}
