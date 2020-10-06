/*
63.	Write a program to count how many times character ‘t’ occurs in a file

==========================*/
import java.util.*;
import java.io.*;

class Q63{
	public static void main(String []args)throws Exception{
		File f = new File("C:\\Users\\lenovo\\Desktop\\java\\java assignments\\abc.txt");
		FileInputStream f1 = new FileInputStream(f);
		byte b ;
		int count=0;
		while((b=(byte)f1.read())!=-1){
			char ch = (char)b;
			if(ch == 't'){
				count++;
			}
		}
		System.out.println("count of t is "+count);
		f1.close();
			
	}
}
