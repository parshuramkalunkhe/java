// Q.31.
// Comparable and Comparator Interafaces is use to compare objects.
// Comparator --> java.util package.

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

class Program_4 {

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
		System.out.println();
        System.out.println("Using marks");

		Collections.sort(students, new MarksComparator());
		for (Student obj : students){
			System.out.println(obj);
		}

        System.out.println();
        System.out.println("Using age.");
        Collections.sort(students, new AgeComparator());		
		for (Student obj : students){
			System.out.println(obj);
		}
	}

}

class MarksComparator implements Comparator<Student> {
    
    public int compare(Student o1, Student o2){
// ascending order.
		if (o1.marks > o2.marks){
			return 1;
		} else if (o1.marks < o2.marks){
			return -1;
		} else {
			return 0;
		}
    }
}

class AgeComparator implements Comparator<Student> {
    
    public int compare(Student o1, Student o2){
// ascending order.
		if (o1.age > o2.age){
			return 1;
		} else if (o1.age < o2.age){
			return -1;
		} else {
			return 0;
		}
    }
}

class Student {
	
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

}

