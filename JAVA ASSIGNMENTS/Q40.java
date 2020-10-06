/*40.	Create a class Student having 
data members name, roll no., age and score.
 Write a program to accept 10 records of student and store them in an array.
 And then arrange the student records based on the score group 
 [0-50], [50-65], [65-80], [80-100].*/
import java.util.Scanner;
import java.util.*;

class Student{
	String name ;
	int roll_no ;
	int age;
	int score ;
	Student(){}
	Student(String name , int roll_no ,int age, int score){
		this.name=name;
		this.roll_no = roll_no;
		this.age =age;
		this.score = score;
	}
	
}
class Q40{
	
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		Student[] array = new Student[10];
		for(int i =0;i<array.length ; i++){
			System.out.print("enter nam roll age score :");
			String name= sc.next();
			int roll_no = sc.nextInt();
			int age = sc.nextInt();
			int score = sc.nextInt();
			array[i]= new Student(name,roll_no,age,score);
		}	
		
	
		for(int i = 0 ; i< array.length ; i++){
			boolean flag = false;
			for(int j=i+1;j<array.length ; j++){
				if(array[i].score > array[j].score){
					Student temp = array[i];
					array[i]=array[j];
					array[j]=temp;
					flag =true;
				}
				if(flag==false)
				{
					break;
				}
			}
		}
		for(Student a : array) {
				if(a.score < 50)
			System.out.println( " less than 50  name : "+a.name+" age : "+a.age+" score : " +a.score);
		
			else if( a.score < 65){
			System.out.println( " less 50-65  name : "+a.name+" age : "+a.age+" score : " +a.score);
				
			}
			else if(a.score < 80){
			System.out.println( " less 65 -80  name : "+a.name+" age : "+a.age+" score : " +a.score);
				
			}
			else {
			System.out.println( " less 80-100 name : "+a.name+" age : "+a.age+" score : " +a.score);
				
			}
			

		}
	}
	
}