
/**
 * Eagle is the parent class in the polymorphism demo.
 * 
 * @author Amanda
 *
 */

public class Eagle {
  protected String grade; // restricted fields

  public String showGrade() {
    grade = "Current Student";
    return grade;
  }

  public void makeSound() {
    System.out.println("I'm a student!");
  }
}


