import java.util.Scanner;
class Q6{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double rad = sc.nextFloat();
		double area = 3.14 * rad*rad;
		double peri = 2 * 3.14 *rad;
		System.out.println("area of circle :%.3f" + area +"circumference : %.3f"+ peri);
	}
}