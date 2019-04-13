import java.util.Scanner;

//Amanda Chapman
//This class demonstrates Arrays
class Option6 {

	public static void display() {

		Student student1; // delcare variable to reference student
		student1 = new Student("Aaron", 85.2, 3.2);
		System.out.println("Student Name: " + student1.getStudentName());
		System.out.println("Grade in the course: " + student1.getCourseGrade());
		System.out.println("Student GPA: " + student1.getStudentGPA());
	}
}

class Student {
	private String studentName;
	private double courseGrade;
	private double studentGPA;
	private double min;
	int n;
	double sum = 0;
	double average;

	// constructor
	public Student() {
	}

	public Student(String name, double grade, double GPA) {
		
	}

	// setter methods
	public void setStudentName(String name) {
		studentName = name;
	}

	public void setCourseGrade(Double grade) {
		courseGrade = grade;
	}

	public void setStudentGPA(Double GPA) {
		studentGPA = GPA;
	}

	// getter methods
	public String getStudentName() {
		return studentName;
	}

	public double getCourseGrade() {
		return courseGrade;
	}

	public double getStudentGPA() {
		return studentGPA;
	}

	public double getCourseGrade(double sum, int n, double average,double grade) {
		Scanner sc = new Scanner(System.in);
		// gets scores for number of assignments and accumulates the sum
		System.out.println("How many assignments were graded? ");
		n = sc.nextInt();
		double scores[] = new double[n];
		System.out.println("Enter your " + n + " grades and I will calculate your average:\n");
		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextDouble();
			sum = sum + scores[i];
		}
		// calculate the average once we have the sum
		average = sum / n;

		// print course grade results
		System.out.println("Your scores were: ");
		for (int i = 0; i < n; i++) {
			System.out.print(scores[i] + " ");
		}

		// print the average
		System.out.println("\nYour grade average was: " + average);
		// manually find the lowest score in the array and display to user
		for (int i = 0; i < n; i++) {
			if (scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("Your lowest grade was: " + min);

		grade = average; // assigns average to courseGrade
		return grade;
	}
}