/*48.	Create an Abstract class Processor with int member variable data  and
 method showData to display data value. 
 Create abstract method process() to define processing of member data. 
 Create a class  Factorial using abstract class Processor  to calculate
 and print factorial of a number by overriding the process method. b.
 Create a class Circle using abstract class Processor to 
 calculate and print area of a circle by overriding the process method.Ask user to enter choice 
(factorial or circle area).  Also ask data to work upon. Use Processor class 

==================================================================================*/
import java.util.*;

abstract class Processor{
	double data;
	void showData(){
			System.out.println(" data"+data);
	}
	abstract void process(int a);
}
class Factorial extends Processor{
	void process(int n){
		int fact=1;
		while(n > 1){
			fact=fact*n;
			n--;
		}
		data=(double)fact;
	}
	
}
class circle extends Processor{
	double pi = 3.14;
	void process (int r){
		double area=0.00;
		area =  pi*2*r*r;
		data=area;
	}
	
}
class Q48{
	public static void main(String Args[]){
		Scanner sc= new Scanner(System.in);
		Factorial fact = new Factorial();
		circle cir =new circle();
		System.out.println("Enter Number for factorial");
		int a = sc.nextInt();
		fact.process(a);
		fact.showData();
		System.out.println("Enter radius for circle area");
		int b = sc.nextInt();
		cir.process(b);
		cir.showData();
	}
}