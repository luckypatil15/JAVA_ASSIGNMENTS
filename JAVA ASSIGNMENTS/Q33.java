import java.util.Scanner;
import java.util.*;
class Employee{
	private int Empid;
	private String name;
	Employee(){
		this(100,"abc");
		System.out.println("no args constructor");
	}
	Employee(int Empid,String name){
		this.Empid = Empid;
		this.name = name;
		System.out.println("params constructor");
	}
	void showdata(){
		System.out.println("empid"+Empid+"  name"+name);
	}
}
class Q33{
	public static void main (String args[]){
		Employee e1 = new Employee();
		e1.showdata();
		Employee e = new Employee(51,"Laxman");
		e.showdata();
	}
	
}