import java.lang.StringBuilder;

 class main {
	public static void main(String[] args) {
		System.out.println(sortVowels("ueioa"));
		
		
		}
		static boolean isVowel(char ch){
				char[] vowels={'a','e','i','o','u'};
				
				for(int i=0;i<vowels.length;i++){
				if(ch == vowels[i]){
					return true;
					}
				}
					return false;
				}
		static int find(String str,int x){
			if(x==str.length()-1){
				return -1;
		}
		int pos=-1;
		char ch=' ';
		boolean firstOccurrence=false;
		for(int i=x;i<str.length();i++){
			if(isVowel(str.charAt(i))){
				if(firstOccurrence == false){
					ch=str.charAt(i);
					firstOccurrence=true;
					pos=i;
						continue;
				}
				if(ch>str.charAt(i)){
					ch=str.charAt(i);
					pos=i;
					}
			}}
			return pos;
		}
		static String sortVowels(String str)
		{
			
			
			StringBuilder strb=new StringBuilder(str);
			for(int i=0;i<strb.length()-1;i++){
				char ch =strb.charAt(i);
				if(isVowel(ch)){
					int pos=find(String.valueOf(strb),i+1);
					if(pos == -1) continue;
					
					//swap
					if(ch>strb.charAt(pos)){
					strb.setCharAt(i,strb.charAt(pos));
					strb.setCharAt(pos,ch);}
				}
			}
			return String.valueOf(strb);
					
					
					}
			
			
			
			
}