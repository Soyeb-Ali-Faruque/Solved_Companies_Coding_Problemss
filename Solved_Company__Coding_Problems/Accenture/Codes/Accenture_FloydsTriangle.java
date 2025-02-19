public class Accenture_FloydsTriangle {
	public static void main(String[] args) {


	}

	static void FlyodsTriangle(int n) {
		int printNumber = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(printNumber);
				printNumber++;
			}
			System.out.println();
		}
	}
}