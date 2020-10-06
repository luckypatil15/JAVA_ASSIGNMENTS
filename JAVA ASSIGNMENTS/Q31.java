import java.util.Scanner;
import java.util.*;
class Student{
	private int rno;
	private String name;
	Student(int rno,String name){
		this.rno=rno;
		this.name=name;
		
	}
	 void ShowData(){
		System.out.println(rno+" " + name);
	}
	
}
class Student_call{
	public static void main(String args []){
		Student s = new Student(23,"Laxman patil");
		s.ShowData();
	}


}