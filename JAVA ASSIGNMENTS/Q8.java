import java.util.Scanner;
class Q8{
		public static void main(String Args[]){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter principle ,time,rtoi");
			float p = sc.nextInt();
			float n = sc.nextInt();
			float r = sc.nextInt();	
			float interest = p*n*r/100;
			System.out.println(interest);
			
		}

}