/*37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/
import java.util.Scanner;
import java.util.*;

class Employee{
	private int Empno ;
	private float salary ;
	private static float TotalSalary ;
	private static int count;

	
	Employee(float salary){
		count++;
		this.Empno=count;
		this.salary = salary;
		this.TotalSalary = TotalSalary+salary;
	}
	void display(){
		System.out.println("Total no of employees  : "+count + "\n total salaries of all employee:  "+TotalSalary);
	}
}
class Q38{
	public static void main (String args[]){
		Employee e = new Employee(25000.00F);
		Employee e1 = new Employee(25375.00F);
		Employee e2 = new Employee(25123.00F);
		Employee e3 = new Employee(25059.00F);
		Employee e4 = new Employee(25000.00F);
		e4.display();
	}
	
}