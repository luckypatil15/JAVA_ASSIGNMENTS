import java.util.Scanner;
class Q7{
		public static void main(String args[]){
			Scanner sc =new Scanner(System.in);
			float a,b,c,d,e;
			float per;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			e=sc.nextInt();
			per=((a+b+c+d+e)/500)*100;
			System.out.println("Percentage : "+per+" %");
			
		}
}