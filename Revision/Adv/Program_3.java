// Q.30. 
// 5 objects students,4 details roll no, name, marks, age
// Display ascending order using marks.
// Comparable and Comparator Interafaces is use to compare objects.
// Comparable --> java.lang package.

import java.util.Collections;
import java.util.ArrayList;

class Program_3 {

	public static void main(String[] args){
		
		ArrayList<Student> students = new ArrayList<Student>();

		students.add(new Student(1, "SaiTeja", 50, 22));
		students.add(new Student(2, "SaiKiran", 80, 23));
		students.add(new Student(3, "Parshuram", 35, 21));
		students.add(new Student(4, "Sauraw", 35, 20));
		students.add(new Student(5, "Jatin", 64, 24));
		
		System.out.println("Iterating all Student Roll NO, Name, Marks and Age. Using foreach loop.");
		System.out.println();
		
		System.out.println("No.  Name\tMarks\tAge");
		

		Collections.sort(students);

		for (Student obj : students){
			System.out.println(obj);
		}
		
	}

}

class Student implements Comparable<Student> {
	
	int roll_no;
	String name;
	double marks;
	int age;

	Student(int roll_no, String name, double marks, int age){
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	@Override
	public String toString(){
		return roll_no + "    " + name + "\t" + marks + "\t" + age;
	}

	@Override
	public int compareTo(Student o){
		// ascending order.
		if (this.marks > o.marks){
			return 1;
		} else if (this.marks < o.marks){
			return -1;
		} else {
			return 0;
		}
	}
}

