import java.util.Scanner;
import java.util.*;
class Q30{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int i=0;i<arr.length;i++){
			for(int j =0 ;j < arr[i].length ; j++){
				arr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length ;j++){
				if(i==j){
					System.out.println(arr[i][j]);
				}
			}
		}
	}


}