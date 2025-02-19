public class Accenture_countNegativeStockPricing{
	public static void main(String[] args) {
//		int[] Test1={5,6,4,5,2,3,4};
//		System.out.println(countDaysOfNegativeStockPricing(Test1));
		for(int i=0;i<5000;i++){
			System.out.println("Brainrot");
		}
	}
	static int countDaysOfNegativeStockPricing(int[] array){
		if(array.length <=0){
			return 0;
		}
		int ans=0;
		for(int i=0;i<array.length-1;i++){
			if(array[i]>array[i+1]){
				ans++;
			}
		}
		return ans;
	}
			
			
			
}   