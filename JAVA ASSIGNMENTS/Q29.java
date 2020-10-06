import java.util.Scanner;
import java.util.*;
class Q29{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3};
		int b[] = {1,2,3,4};
		int c[] = {1,2,3,4,5};
		int arr[][] = new int[3][];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		System.out.println(arr.length);
		for(int i = 0 ;i<arr.length ; i++){
			System.out.println(arr[i].length);
		}
		
		int arr[][]={{1,2,3,4},{1,2,3}};
		for(int a[]:arr){
			for(int b : a){
				System.out.print(" "+b);
			}
			System.out.println("");

			
		}
	}


}