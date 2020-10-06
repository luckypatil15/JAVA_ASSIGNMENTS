import java.util.Scanner;
class ArrayDemo10{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no off rows");
		
		int r = sc.nextInt();
		int arr[][]=new int[r][];
		for(int i=0;i<arr.length;i++){
			System.out.println("enter no cols for  "+i+"th row");
			int cols = sc.nextInt();
			for(int j = 0 ; j < arr[i].length ;j++){
				System.out.println("Enter the element");
				arr[i][j]= sc.nextInt();
			}
		}
		for(int a[]:arr){
			for(int e : a){
				System.out.print(" "+e);
			}
			System.out.println("");
		}
		
	}
}