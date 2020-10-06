
import java.util.Scanner;
import java.util.*;

class Student{
	int rollno;
	double percentage;
	Student(){}
	Student(int  rollno,double percentage){
		this.rollno=rollno;
		this.percentage = percentage;
	}
	void show(){
		System.out.print(" rollno : "+rollno+" ppercentage : "+percentage);
	}
}
class CollegeStudent extends Student {
	int sem ;
	CollegeStudent(){}
	CollegeStudent(int rollno,double percentage,int sem){
		super(rollno,percentage);
		this.sem =sem;
	}
	void Show(){
		super.show();
		System.out.println(" semesters : "+ sem);
	}
	void display1(){
		System.out.println(" This is CollegeStudent cllas ");
	}
}
class SchoolStudent extends Student{
	int classname;
	SchoolStudent(){}
	SchoolStudent(int rollno,double percentage,int classname){
		super(rollno,percentage);
		this.classname=classname;
	}
	void show(){
		super.show();
		System.out.println(" classname :  "+ classname);
	}
	
	void display1(){
		System.out.println(" This is schoolStudent cllas ");
	}
}
class Q46{
	public static void main(String  args[]){
	Scanner sc = new Scanner(System.in);
	Student  arr[] = {new CollegeStudent(),new CollegeStudent(),new SchoolStudent(),new SchoolStudent(),new SchoolStudent()};
	for (int i=0 ;i<arr.length ;i++){
		if(arr[i] instanceof CollegeStudent){
			System.out.println("enter College student rollno , percentage , sem :");
			int rollno = sc.nextInt();
			double percentage = sc.nextDouble();
			int sem = sc.nextInt();
			arr[i]=new CollegeStudent(rollno,percentage,sem);
		}
		else{
			System.out.println("enter School student rollno , percentage , sem :");
			int rollno = sc.nextInt();
			double percentage = sc.nextDouble();
			int cname = sc.nextInt();
			arr[i]=new CollegeStudent(rollno,percentage,cname);		
		}
	}
	System.out.println("Enter  the rollno to searched :");
	int search = sc.nextInt();
	boolean flag = false;
	int count = 0;
	for( Student a : arr){
		if(a.rollno == search){
			flag = true;
			if(a instanceof CollegeStudent){
				System.out.println(a.rollno+" number found and belongs to college \n");
				CollegeStudent c = (CollegeStudent)a;
				c.display1();
			}else{	
				System.out.println(a.rollno+" number found and belongs to school \n");
				SchoolStudent c = (SchoolStudent)a;
				c.display1();
			}
		}
		if(a.percentage > 75){
			count++;
		}
	}
	if(flag == false){
		System.out.println(" number found : ");
	}
	System.out.println(" total no of people having A grade : "+count);
	
	
	
}
}					
						
						
						