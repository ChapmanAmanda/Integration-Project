class Junior extends Eagle {
  public Junior() {

    super();
    grade = "Junior"; // inheritance
  }

  public String showGrade() {
    System.out.println("Grade Level: " + grade);
    return super.showGrade();
  }

  public void makeSound() {
    System.out.println("Most used phrase: \"It be like that sometimes.\"");
  }
}

/*
 * Inheritance is the process where one class acquires the properties (methods and fields) of
 * another. A benefit of inheritance is that it makes code easier to read and write
 */


