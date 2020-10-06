class OneBHK{
		private float roomArea;
		private float hallArea;
		private double price;
		
		OneBHK(){
			
			roomArea=10;
			hallArea=20;
			price=450.0;
			
		}
		OneBHK(float roomArea,float hallArea,double price){
					this.roomArea=roomArea;
					this.hallArea=hallArea;
					this.price=price;
		}
		void show(){
			System.out.println(roomArea+" "+hallArea+" "+price);
		}

}
class TwoBHK extends OneBHK{
	
	private float roomArea2;
	
	TwoBHK(){
		super();
		roomArea2=500;
	}
	
	TwoBHK(float roomArea,float hallArea,double price,float roomArea2)
	{
		super(roomArea,hallArea,price);
		this.roomArea2=roomArea2;
	}
	
	void show(){
		super.show();
		System.out.println(roomArea2);
	}


}

class Demo1{
	
	public static void main(String args[]){
		
		TwoBHK t=new TwoBHK();
		t.show();
	}
}