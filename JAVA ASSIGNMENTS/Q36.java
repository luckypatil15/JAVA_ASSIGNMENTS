import java.util.Scanner;
import java.util.*;

class MathOperation1{
	
	static int Multiply(int a, int b){
		return a*b;
	}
	static float Multiply(float a, float b,float c){
		return a*b*c;
	}
	static int Multiply(int [] a){
		int  result=1;
		for(int i :a){
			result=result*i; 
		}
		return result;
	}
	static double Multiply(double a, int b){
		return a*(double)b;
	}
	
	
}
class Q36{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		System.out.println("two integers "+MathOperation1.Multiply(a,b));
		
		System.out.println("enter the first float number");
		float c = sc.nextFloat();
		System.out.println("enter the float number");
		float d = sc.nextFloat();
		System.out.println("enter the float number");
		float e = sc.nextFloat();
		System.out.println(" 3 floats "+MathOperation1.Multiply(c,d,e));
		
		System.out.println("enter the 5 elemnets in array");
		int arr[]= new int[5];
		for(int i = 0 ;i < 5 ;i++){
			 arr[i]= sc.nextInt();
		}
		System.out.println(MathOperation1.Multiply(arr));
		
		System.out.println("enter the first float number");
		double c = sc.nextFloat();
		System.out.println("enter the float number");
		int d = sc.nextFloat();
		
		sc.close();
	}
	
}