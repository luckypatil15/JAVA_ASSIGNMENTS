class Q3M{
	public static void main(String args[]){
		String s1 = args[0];
		int max=1;
		char ch='z';
		int visited[] = new int[s1.length()] ;
		String s2="";
		for(int i=0;i<s1.length();i++){
			int count = 0;
			for(int j=i+1;j<s1.length();j++){
				if(s1.charAt(i) == s1.charAt(j)){
					count++;
					visited[j]=1;
					
				}
			
			}
			if(count > 0 && visited[i]==0){
				ch=s1.charAt(i);
				
				System.out.println(ch);

			}			
			
			
			
		} 
		System.out.println(s2);
	}
}