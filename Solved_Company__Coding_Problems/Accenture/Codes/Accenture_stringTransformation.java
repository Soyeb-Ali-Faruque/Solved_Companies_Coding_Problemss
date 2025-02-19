public class Accenture_stringTransformation{
	public static void main(String[] args) {
		System.out.println(answer("abd","aabbccdd"));
		
	}
	static int  answer(String s1,String s2){
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			s2=found(s2,ch);
			}
			return s2.length();
			
		
		
		}
	static String found(String str,char ch){
		boolean isAlreadyFound=false;
		String temp="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch && isAlreadyFound == false){
				isAlreadyFound=true;
				continue;
				}
				temp+=str.charAt(i);
				}
				return temp;
						
		
		} 
}