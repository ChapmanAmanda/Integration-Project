/**
 * This class is a demonstration of polymorphism and inheritance.
 * 
 * @author Amanda
 *
 */
class Polymorphism {

  public static void polymorphism() {
    System.out.println("\nExcellent choice!\nThis section demonstrates polymorphism "
        + "and inheritance.\nAll Eagles are students. These are their grade "
        + "levels and common phrases:\n ");

    Senior mySenior = new Senior(); // new Senior Eagle object
    Junior myJunior = new Junior(); // new Junior Eagle object
    Eagle[] myStudents = {mySenior, myJunior}; // polymorphism
    for (Eagle anEagle : myStudents) { // enhanced for loop
      System.out.println(anEagle.showGrade()); // prints grade level
      anEagle.makeSound(); // prints most common phrase
    }
  }
}


