import java.util.Scanner;
class Q10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Farenheit");
		double fare= sc.nextDouble();
		double celsius = (fare-32)*5/9;
		System.out.printf("temperature in celsius "+"%.3f",celsius);
	}

}