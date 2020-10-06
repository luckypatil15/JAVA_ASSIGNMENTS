/*37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/
import java.util.Scanner;
import java.util.*;

class Faculty{
	private int facultyId;
	private double salary;
	
	void input(int facultyId){
		this.facultyId=facultyId;
	}
	void setsalary(double salary){
		this.salary = salary;
	}
	void printsalary(){
		System.out.println("Salary : "+ salary);
	}
}
class FullTimeFaculty extends Faculty{
	private double basicSalary;
	private double allowance;
	void input(int facultyId,double basicSalary , double allowance){
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		 
		double salary =  basicSalary +  allowance;
		input(facultyId);
		setsalary(salary);
	}
}
class PartTimeFaculty extends Faculty{
	private double workingHours;
	private double ratePerHour;	
	void input (int facultyId, double workingHours,double ratePerHour ){
		this.workingHours = workingHours;
		this.ratePerHour = ratePerHour;
		double salary = workingHours * ratePerHour;
		input(facultyId);
		setsalary(salary);
	}
}
class Q44{
	public static void main (String args[]){
		FullTimeFaculty f1 = new FullTimeFaculty();
		f1.input(101,1500.000,900.00);
		f1.printsalary();
		PartTimeFaculty p1 = new PartTimeFaculty();
		p1.input(101,24,90);
		p1.printsalary();
	}
	
}