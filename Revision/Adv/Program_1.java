//Q . Write a program to stroe and iterate ArrayList consisting of Object for the class Employee.
// Note : Employee object have attributes such as Employee Id, Name, Salary.

import java.util.ArrayList;
import java.util.Scanner;

class Program_1 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Taking user Input.");
		System.out.print("Enter Id : ");
		int id = sc.nextInt();
		System.out.print("Enter Name : ");
		String name = sc.next();
		System.out.print("Enter Salary : ");
		double sal = sc.nextDouble();

		Employee emp1 = new Employee(id, name, sal);

		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, "SaiTeja", 25000));
		employeeList.add(new Employee(2, "SaiKiran", 38000));
		employeeList.add(new Employee(3, "Parshuram", 18000));
		employeeList.add(emp1);
		
		System.out.println();
		System.out.println("Iterating all Employee Id, Name and Salary. Using foreach loop.");

		for (Object obj : employeeList){
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Iterating Only Employee Id. Using foreach loop.");
		for (Object obj : employeeList){
			Employee emp = (Employee) obj;
			System.out.println(emp.employeeId);
		}
		
		System.out.println();
		System.out.println("Iterating Only Employee Name. Using foreach loop.");
		for (Object obj : employeeList){
			Employee emp = (Employee) obj;
			System.out.println(emp.employeeName);
		}
	
		System.out.println();
		System.out.println("Iterating Only Employee Salary. Using foreach loop.");
		for (Object obj : employeeList){
			Employee emp = (Employee) obj;
			System.out.println(emp.employeeSal);
		}

		sc.close();
	}

}
class Employee {
	
	int employeeId;
	String employeeName;
	double employeeSal;

	Employee(int id, String name, double sal){
		this.employeeId = id;
		this.employeeName = name;
		this.employeeSal = sal;
	}

	@Override
	public String toString(){
		return employeeId + "   " + employeeName + "\t" + employeeSal;
	}
}

