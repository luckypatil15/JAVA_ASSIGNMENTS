/*
62.	Create a class that checks whether a given number is prime or not using 
 Runnable interface.

==========================*/
import java.util.*;
class Prime implements Runnable{
	int num;
	Prime(int a){
		this.num=a;
	}
	public void run(){
		boolean flag = false;
		for(int i=2; i < Math.sqrt(num) ;i++){
			if(num % i == 0){
				flag=true;
				System.out.println(num+" is not a prime");
				break;
			}
		}
		if(!flag){
			System.out.println(num+" is  a prime");
		}
	}
	
}
class Q62{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Prime p = new Prime(a);
		Thread th1 = new Thread(p);
		th1.start();
			
	}
}
