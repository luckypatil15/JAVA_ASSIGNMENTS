import java.util.Scanner;
class Q14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to be checked");
		int year = sc.nextInt();
		if(year % 400 == 0 || year % 4 == 0){
			System.out.println(year+" is a leap year");
		}	
		else{
			System.out.println(year+" is a not  leap year");
	
		}
	}

}