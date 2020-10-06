/*
61.	Create a Thread class to print following star (*)
 pattern on screen with delay of 1 second between each * print. 
Number of lines 
in the pattern should be passed to the constructor of Thread class.
  *  * * * *  * * * * * * * * * * 
Use this class in main method and ask user to enter number of lines to print.

==========================*/
import java.util.*;
class Pattern implements Runnable{
	int num;
	Pattern(int num){
		this.num = num;
	}
	public void run(){
		for(int i = 0 ;i < num ;i++){
			try{
				Thread.sleep(1000);
			System.out.print("* ");
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
class Q61{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Pattern p = new Pattern(n);
		Thread th1 = new Thread(p);
		th1.start();
		
	}
}
