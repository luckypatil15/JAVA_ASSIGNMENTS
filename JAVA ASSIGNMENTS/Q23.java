import java.util.Scanner;
class Q23{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i]= sc.nextInt();
		}	
		for(int i = 0,j=arr.length-1 ; i < arr.length/2 ; i++ ,j--){
			int a = 0;
			a = arr[i];
			arr[i] = arr[j];
			arr[j]=a;
				
		}
		for(int a : arr){
			System.out.println(a);
		}
	}


}