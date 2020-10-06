/*
59.	Create a class Voter(voterId, name, age) 
with parameterized constructor. 
 The parameterized constructor should throw a checked exception if age is less than 18. 
The message of exception is invalid age for voter  


==========================*/
class Voter{
	int voterId;
	String name;
	int age;
	Voter(int voterId,String name,int age)throws Exception{
		this.voterId = voterId;
		this.name=name;
		if(age<18){
			throw new Exception("invalid age for voter");
		}else
			this.age =age;
	}
	
}
class Q59{
	public static void main(String []args)throws Exception{
		try{
				Voter v = new Voter(123346,"Laxman",26);
				System.out.println("HII");
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}