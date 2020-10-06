import java.util.Scanner;
class Q3 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String ch = sc.next(); 
		switch(ch){
			case "A":System.out.println("enter value of x");
				 int x =sc.nextInt();
				int y = x*x+(3*x)-7;
				System.out.println(y);
				break;
			case "B" : System.out.println("enter value of x");
				int a =sc.nextInt();
				int b = a++ + ++a;
				System.out.println(b);
				 break;
			case "C": System.out.println("enter value of x , y ");
				int d =sc.nextInt();
				int e =sc.nextInt();
				int f = d++ - --e - --d  +  d++ ;				 
				System.out.println(f);
				break;
			case "D": System.out.println("enter value of x , y ");
				boolean q1 = sc.nextBoolean();
				boolean q2 = sc.nextBoolean();
				boolean q3 =q1 && q2 || !(q1 || q2);
				System.out.println(q3);  
				break;

		}	
	}
}