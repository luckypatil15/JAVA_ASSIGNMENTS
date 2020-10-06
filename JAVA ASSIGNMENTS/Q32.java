import java.util.Scanner;
import java.util.*;
class Student1{
	private int rno;
	private String name;
	static int total;
	Student1(int rno,String name){
		this.rno=rno;
		this.name=name;
		total++;
		
	}
	 void ShowData(){
		System.out.println(rno+" " + name);
	}
	
}
class Student_call_1{
	public static void main(String args []){
		Student1.total=0;
		Student1 s = new Student1(23,"Laxman patil");
		s.ShowData();
		Student1 s1 = new Student1(24,"Laxman patil");
		s1.ShowData();
		Student1 s2 = new Student1(25,"Laxman patil");
		s2.ShowData();
		System.out.println("no of objects "+Student1.total);
		
	}


}