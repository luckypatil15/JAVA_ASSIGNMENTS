import java.util.Scanner;
import java.lang.Math;
class Q18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		if(number <= 2)
		System.out.println("not a prime number");
		else{
			boolean flag =false ;
			
			for(int i= 2 ; i < Math.sqrt(number) ;i++ ){
				if(number % i  == 0 ){
					flag = true;
					break;	
				}
				
			}
			if(flag){
				System.out.println(number+" is a not prime number");
			}else{
				System.out.println(number + " is prime number");
			}
			
		}
		
	}
	
}