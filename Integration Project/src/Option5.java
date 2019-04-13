//Amanda Chapman
//This class is a demonstration of polymorphism and inheritance
class Option5 {

	public static void polymorphism() {
		System.out.println("Excellent choice");
		Senior mySenior = new Senior();
		Junior myJunior = new Junior();
		Student[] myStudents = {mySenior, myJunior}; //polymorphism
		for(Student aStudent: myStudents) {
			System.out.println(aStudent.showGrade());
			aStudent.makeSound();
		}
	}
}
// Inheritance is the process where one class acquires the properties (methods and fields) of another.
// A benefit of inheritance is that it makes code easier to read and write
class Student{
	protected String grade; //private fields
	
	public String showGrade() {
		return "Student";
	}
	public void makeSound() {
		System.out.println("I'm a student!");
	}
}
class Senior extends Student{
	public Senior() {
		grade = "Senior"; //inheritance
	}	
	public String showGrade() {
		System.out.println("Grade Level: ");
		return "Senior";
	}
	public void makeSound() {
		System.out.println("Most commonly used phrase: \"Yeet\"");
	}
}
class Junior extends Student{
	public Junior() {
		grade = "Junior";
	}
	public String showGrade() {
		System.out.println("Grade Level: ");
		return "Junior";
	}
	public void makeSound() {
		System.out.println("Most commonly used phrase: \"It be like that sometimes.\"");
	}	
}