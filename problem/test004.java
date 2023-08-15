package problem;

public class test004 {

	    public static void main(String[] args) {
	        int[] a = new int[20];

	        for (int i = 0; i < a.length; i++) {
	            a[i] = i * 5 + 5;
	        }

	        System.out.print("奇数値: ");
	        for (int i = 0; i <= 10; i++) {
	            if (i != 0 && i % 2 == 1) {
	                System.out.print(", ");
	            }
	            System.out.print(a[i]);
	            if (i % 2 == 1) {
	                System.out.print(" ");
	            }
	        }

	        System.out.println();

	        System.out.print("偶数値: ");
	        for (int i = 11; i < a.length; i++) {
	            if (i != 11 && (i - 11) % 2 == 1) {
	                System.out.print(", ");
	            }
	            System.out.print(a[i]);
	            if ((i - 11) % 2 == 1) {
	                System.out.print(" ");
	            }
	        }
	    }
}
