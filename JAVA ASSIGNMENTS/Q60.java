/*
60.	Create Interface StudentFee and declare following method. 
 getFee() throws InvalidFeeException.
 This method ask fees from user and throws exception 
if user enters invalid or negative fees Create class Student with members (name, fees) 
and implement the StudentFee Interface

==========================*/
interface StudentFee{
	double getFee();
}
class InvalidFeeException extends Exception{
	
}
class Student implements StudentFee{
	String name;
	double fees;
	Student(String name,double fees)throws InvalidFeeException{
		this.name = name;
		if(fees < 1){
			throw new InvalidFeeException();
		}
		this.fees = fees;
	}
	public double getFee(){
		return fees;
	}
	
}
class Q60{
	public static void main(String []args){
		//Student s = new Student("Ankit",-45000.00);
		try{
			Student s = new Student("Ankit",-45000.00);
			System.out.println(s.getFee());
		}catch(InvalidFeeException i){
			System.out.println(i);
			}
		
	}
}
