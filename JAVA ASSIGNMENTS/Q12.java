
import java.util.Scanner;
class Q12{
		public static void main(String args[] ){
			Scanner sc=  new Scanner (System.in);
			double basic_sal=sc.nextInt();
			double hra;
			double Gross=0;
			if(basic_sal >=10000){
				hra = 2000;
				double DA= 0.98*basic_sal;
				Gross=basic_sal+DA+hra;
			}
			else if(basic_sal<10000){
				hra = 0.1 * basic_sal;
				double DA= 0.9*basic_sal;
				Gross=basic_sal+DA+hra;
			}
			System.out.println("Gross salary of employee is "+Gross);
			
		}
	
}