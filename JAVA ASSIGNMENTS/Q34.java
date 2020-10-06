import java.util.Scanner;
import java.util.*;
class Circle{
	private float radius;
	private float area ;
	void init(float radius){
		this.radius=radius;
	}
	void CalculateArea(){
		this.area = 3.14F * radius*radius;
	}
	void Display(){
		System.out.println(" radius  : "+radius);
		System.out.println(" Area of circle : "+area);
	}
}
class Q34{
	public static void main (String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter thr radius of the circle");
		float rad=sc.nextFloat();
		Circle cir = new Circle();
		cir.init(rad);
		cir.CalculateArea();
		cir.Display();
		sc.close();
	}
	
}