import java.util.Scanner;
class Q25{
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
		//System.out.println("enter element to be searched");
		int sum_odd = 0;
		int sum_even=0;
		for(int a : arr){
			if(a % 2 == 0 ){
				//System.out.println(a+ " element is found");
				sum_even = sum_even+a;
			}
			else{
				sum_odd+=a;
			}
		}
		System.out.println("odd sum"+sum_odd+" even sum "+sum_even);
	}


}