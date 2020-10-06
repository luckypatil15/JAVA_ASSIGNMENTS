/*37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/
import java.util.Scanner;
import java.util.*;

class Person{
	private int age ;
	private String name;
	Person(){
		this.age = 18;
	}
	Person( String name,int age){
		this.age=age;
		this.name = name;
	}
	void display(){
		System.out.println("Name  : "+name + "  age :  "+age);
	}
	
	
	
}
class Q37{
	public static void main (String args[]){
		Person p = new Person("Laxman Patil",26);
		p.display();
	}
	
}