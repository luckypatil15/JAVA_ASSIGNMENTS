import java.util.Scanner;
import java.lang.Math;
class  Q20{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter start of  the range");
		int left = sc.nextInt();
		System.out.println("Enter end of  the range");
		int right = sc.nextInt();
		
		for(int i=left; i <= right ;  i++){
			boolean  flag  = false;
			for(int j=2 ; j <= Math.sqrt(i);j++){
				if( i % j  == 0){
					flag = true;
				}
			}	
			if(flag == false){
				
				System.out.println(i);
			}
		}	
	}

}
