package problem;

public class test002 {

	public static void main(String[] args) {

		int x = 0;
		int sum = 0;
		for (int n = 1; n <= 10; n++) {
			if (n % 2 == 0) {
				x++;
				sum += n;
			}
		}
		
		System.out.println("偶数の数 " + x);
		System.out.println("偶数の合計 " + sum);
		
	}

} 