import java.util.Scanner;
class Q9{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int year = days/365;
		int rem = days % 365;
		int months = rem /30;
		rem = rem % 30;
		System.out.println("Year : "+year+" Months : "+months+" days : "+ rem);
	}
}