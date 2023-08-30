package problem;

public class test00402 {

	public static void main(String[] args) {

		int[] a = new int[20];
		
        System.out.print("奇数:");
		for (int i = 0; i < a.length; i++) {
			a[i] = i * 5 + 5;
			if (i <= 10 && a[i] % 2 == 1) {
				System.out.print(a[i]);
				if (i < 10 && a[i] % 2 == 1) {
					System.out.print(",");
				}
			}
			if (i == 10) {
				System.out.print("\n偶数:");
			}
			if (i > 10 && i < 20 && a[i] % 2 == 0) {
				System.out.print(a[i]);
				if (i > 10 && i < 19 && a[i] % 2 == 0) {
					System.out.print(",");
				}

			}

		}

	}

}
