class Q1M{
	public static void main(String args[]){
		String s1 = args[0];
		int max=1;
		char ch='z';
		for(int i=0;i<s1.length();i++){
			int count = 0;
			for(int j=0;j<s1.length();j++){
				if(s1.charAt(i) == s1.charAt(j) ){
					count++;
					
				}
			
			}
			if(count > max ){
				max= count;
				System.out.println((int)ch);
				System.out.println((int)s1.charAt(i));
				if((int)ch > (int)s1.charAt(i))
				ch=s1.charAt(i);
			}
			
			
			
		} 
		System.out.println(ch+" max = "+max);
	}
}