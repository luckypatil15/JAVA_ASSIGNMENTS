import java.util.Scanner;
class Q22{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i]= sc.nextInt();
		}	
		for(int i = 0 ; i < arr.length ; i++ ){
			for(int j = i+1 ; j < arr.length ; j++ ){
				if(arr[i] < arr[j]){
					int a = 0;
					a = arr[i];
					arr[i] = arr[j];
					arr[j]=a;
				}
				
			}
		}
		for(int a : arr){
			System.out.println(a);
		}
	}


}