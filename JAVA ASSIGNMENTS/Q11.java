import java.util.Scanner;
class Q11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number in a : ");
		int a = sc.nextInt();
		System.out.println("Enter the first number in b : ");
		int b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a : "+a+" b: "+b);
	}
}