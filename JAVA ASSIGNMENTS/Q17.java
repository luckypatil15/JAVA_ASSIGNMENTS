import java.util.Scanner;
class Q17{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int number =  sc.nextInt();
		//String number1 = sc.next();	
		int result =0;
		/*for(int i = 0 ; i < number1.length() ; i++ ){
				result= number1.charAt(i)+result;
		}*/
		while(number!=0){
			int b=number % 10;
			result =result * 10 + b;
			number=number/10; 
		}
		System.out.println("result is "+result);

	}

}
