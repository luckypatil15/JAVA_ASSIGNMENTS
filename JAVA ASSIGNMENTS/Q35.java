import java.util.Scanner;
import java.util.*;

class MathOperation{
	static int add(int a,int b){
		return a+b;
	}
	static int subtract(int a,int b){
		return a-b;
	}
	static int Multiply(int a, int b){
		return a*b;
	}
	static double power(int a,int b){
		return Math.pow(a,b);
	}
	
}
class Q35{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		System.out.println(MathOperation.add(a,b));
		
		System.out.println(MathOperation.subtract(a,b));
		System.out.println(MathOperation.Multiply(a,b));
		System.out.println(MathOperation.power(a,b));
		sc.close();
	}
	
}