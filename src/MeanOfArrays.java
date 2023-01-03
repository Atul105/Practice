import java.util.Arrays;
import java.util.Scanner;

public class MeanOfArrays {

	public static void main(String[] args) {
//		int a[] = {4, 6, 1, 3, 2, 5};
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		int n =a.length;
//		System.out.println(n);
//		double sum = ((a[n/2-1]+a[n/2]));
//		double median = sum/2;
//		System.out.println(median);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int n = sc.nextInt();
		System.out.println("enter the element of the array");
		int a[] = new int[n];
		for(int i=0; i< n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("median= "+ findMedian(a, n));
		sc.close();
	}
	
	
	
private static double findMedian(int a[], int n) {
	Arrays.sort(a);
	 if (n % 2 != 0) {
	      return (double) a[n / 2];
	    }
	 else {
		 return (double) (a[(n - 1) / 2] + a[n / 2]) / 2.0;
	 }
	    
	  }
}