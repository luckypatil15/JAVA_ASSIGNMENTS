/*
63.	Write a program to count how many times character ‘t’ occurs in a file

==========================*/
import java.util.*;
import java.io.*;

class Q64{
	public static void main(String []args)throws Exception{
		File f = new File("C:\\Users\\lenovo\\Desktop\\java\\java assignments\\abc.txt");
		FileInputStream f1 = new FileInputStream(f);
		byte b ;
		int count=1;
		while((b=(byte)f1.read())!=-1){
			char ch = (char)b;
			if(ch == ' ' || ch=='\n'){
				count++;
			}
		}
		System.out.println("count of words is "+count);
		f1.close();
			
	}
}
