import java.util.Scanner;
import java.util.ArrayList;

//Amanda Chapman
//This class demonstrates Arrays
class Option6 {
	public static void display() {

		Student student1; // declare variable to reference student
		student1 = new Student("Aaron", 85.2, 3.2);
		
		System.out.println("Student Name: " + student1.getStudentName(""));
		System.out.println("Grade in the course: " + student1.getCourseGrade());
		
		
	}


	public static void arrayStuff() {
		// Multi-dimensional array
		String[][] multiArray = { { "Amanda ", "Java ", "Rocks " }, { "Chapman", "Integration" } };
		System.out.println(multiArray[0][0] + multiArray[1][0]);
		System.out.println(multiArray[0][2] + multiArray[0][1]);
		
		// ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>(500);
		numbers.add(10);
		numbers.add(100);
		numbers.add(67);
		System.out.println(numbers.get(0));
		
		// 2D array
		int[][] twoArray = { { 1, 2 }, { 3, 4 } };
		for (int r = 0; r < twoArray.length; r++) {
			for (int c = 0; c < twoArray[r].length; c++) {
				twoArray[r][c] = r + c;
			}
		}
		int x, y;
		for (int r = 0; r < twoArray.length; r++) {
			for (int c = 0; c < twoArray[0].length; c++) {
				if (twoArray[r][c] == 1) {
					x = r;
					y = c;
					System.out.println("Found at (" + x + ", " + y + ")");
				}
			}
		}
	}
}

class Student {
	Scanner sc = new Scanner(System.in);
	private String studentName;
	private double courseGrade;
	
	private double min;
	int n;
	double sum = 0;
	double average;
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

	public void setMinScore(double minScore) {
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
		courseGrade = average; // assigns average to courseGrade
		
		double minScore;
		// manually find the lowest score in the array and display to user
		minScore = scores[0];
		for (int i = 1; i < n; i++) {
			if (scores[i] < minScore) {
				minScore = scores[i];
			}
		}
		minScore = min;
		System.out.println("Your lowest grade was: " + min);
		return courseGrade;
	
		
	}
}
