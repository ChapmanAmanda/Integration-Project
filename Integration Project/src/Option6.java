import java.util.Scanner;

//Amanda Chapman
//This class demonstrates Arrays
class Option6 {

	public static void display(double gpa) {

		Student student1; // declare variable to reference student
		student1 = new Student("Aaron", 85.2, 3.2);
		arrayStuff();
		System.out.println("Student Name: " + student1.getStudentName(""));
		System.out.println("Grade in the course: " + student1.getCourseGrade());
		System.out.println("Array information: " + student1.getMinScore(0, 0, null));
		System.out.println("Student GPA: " + student1.getStudentGPA(0, 0));
		
	}
	public static void arrayStuff() {
		//2D array
		int [][] twoArray = {{1,2},{3,4}};
		for(int r = 0; r<twoArray.length; r++) {
			for(int c = 0; c<twoArray[r].length; c++) {
				twoArray[r][c] = r+c;
			}
		}
		int x, y;
	    for (int r=0; r< twoArray.length; r++) {
	        for (int c=0; c < twoArray[0].length; c++) {
	            if (twoArray[r][c] == 1) {
	                x = r;
	                y = c;
	                System.out.println("Found at (" + x + ", " + y + ")");
	            }
	        }
	    }
	    ;
		//ArrayList
	}
}

class Student {
	Scanner sc = new Scanner(System.in);
	private String studentName;
	private double courseGrade;
	private double studentGPA;
	private double min;
	int n;
	double sum = 0;
	double average;
	double minScore;
	double scores[];
	double grade;

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

	public void setArrayStuff(double minScore) {
		min = minScore;
	}

	// getter methods
	public String getStudentName(String name) {
		System.out.println("Please enter your name: ");
		name = sc.nextLine();
		return name;
	}

	/*
	 * public double getCourseGrade() { return courseGrade; //overloading a method }
	 */
	public double getCourseGrade() {

		// gets scores for number of assignments and accumulates the sum
		System.out.println("How many assignments were graded? ");
		n = sc.nextInt();
		double scores[] = new double[n];
		System.out.println("Enter your " + n + " grades and I will calculate your average:");
		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextDouble();
		}
		for (double x : scores) { // enhanced for loop
			sum += x; // sum of an array
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
		grade = average; // assigns average to courseGrade
		return grade;
	}

	public double getStudentGPA(double gpa, double GPA) {
		Option3.getGPA();
		GPA = gpa;
		return GPA;
	}

	public double getMinScore(double minScore, int n, double[] scores) {
		// manually find the lowest score in the array and display to user
		minScore = scores[0];
		for (int i = 1; i < n; i++) {
			if (scores[i] < minScore) {
				minScore = scores[i];
			}
		}
		System.out.println("Your lowest grade was: " + min);
		return minScore;
	}
}
