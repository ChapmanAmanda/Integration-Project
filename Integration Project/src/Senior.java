
/**
 * This class demonstrates inheritance.
 * 
 * @author Amanda
 *
 */
class Senior extends Eagle {
  public Senior() {
    // super()
    grade = "Senior"; // inheritance
  }

  public String showGrade() {
    System.out.println("Grade Level: " + grade);
    return super.showGrade();
  }

  public void makeSound() {
    System.out.println("Most commonly used phrase: \"Yeet\"");
  }
}
