import java.util.Scanner;
class Q15{
	public static void main(String Args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter gender Of the person");
		String gender = sc.next();
		char gender1=gender.charAt(0);
		System.out.print(gender);

		System.out.println("Enter Age Of the person");
		int age = sc.nextInt();
		System.out.print(age);		
		if( gender1 == 'M'  && age>=21){
			System.out.println("Person is Allowed to be married");
		} 
		else{
			System.out.println("Person is not allowed to be married");
		}
	} 		
}