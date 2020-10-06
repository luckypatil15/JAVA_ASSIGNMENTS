/*37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/
import java.util.Scanner;
import java.util.*;

class Tile{
	public float Edge_length ;
	Tile(){}
	Tile(float Edge_length){
		this.Edge_length=Edge_length;
	}
	
}
class Floor{
	private float length;
	private float width;
	Floor(){}
	Floor(float length , float width){
		this.length = length;
		this.width=width;
	}
	float totalTiles(Tile t){
		float total=0;
		float area_tile = t.Edge_length * t.Edge_length;
		float area_floor = length * width;
		total = area_floor/area_tile;
		return total;
	}
	
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the tile edge length");
		float el= sc.nextFloat();
		Tile t = new Tile(el);
		System.out.println("enter the floor length and width");
		float length = sc.nextFloat();
		float width = sc.nextFloat();
		Floor f = new Floor(length,width);
		float result = f.totalTiles(t);
		System.out.println("total no of tilles  : "+result);
	}
	
}