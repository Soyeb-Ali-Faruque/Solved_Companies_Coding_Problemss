public class Accenture_LetterRemove{
	public static void main(String[] args) {
		System.out.println(remove("aabbcc","ab"));
		
	}
	static String remove(String A,String B){
		if(B.length()==0) return A;
		
		for(int i=0;i<B.length();i++){
			char ch=B.charAt(i);
			String temp="";
			for(int j=0;j<A.length();j++){
				if(ch==A.charAt(j)) continue;
				
				temp+=A.charAt(j);
			}
			A=temp;
		}
		return A;
	}
}