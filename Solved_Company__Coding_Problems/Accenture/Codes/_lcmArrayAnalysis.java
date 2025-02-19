 class Main {
	public static void main(String[] args) {
		int Test1[]={1,3,2,4};
		
		System.out.println(findLargestLcm(Test1));
		
	}
	public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;  // The last non-zero 'a' is the GCD
}
static int lcm(int x,int y){
return (x*y)/gcd(x,y);
}
static int findLargestLcm(int[] array){
		if(array.length == 0){
			return -1;}
			if(array.length == 1){
				return array[0];
				}
				
		int ans=0;
		for(int i=0;i<array.length-1;i++){
			int sub_ans=lcm(array[i],array[i+1]);
			if(sub_ans>ans){
				ans=sub_ans;
			}
		}
		return ans;
}
		
}