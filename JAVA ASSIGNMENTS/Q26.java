import java.util.Scanner;
class Q26{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int r = sc.nextInt();
		int arr[][]=new int[r][];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the nof cols for"+i+"th"+"row");
			int cols = sc.nextInt();
			arr[i]=new  int[cols];
			for(int j=0;j<cols;j++){
				System.out.println("Enter the nof elements");
				arr[i][j]=sc.nextInt();
			}
		}
		int sum = 0;
		for(int a[] : arr){
			for(int b : a){
				System.out.print(" "+b);
				sum+=b;
			}
			System.out.println("");
		}
		System.out.println("sum : "+sum);
	}


}