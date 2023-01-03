import java.util.Arrays;
import java.util.Scanner;

public class MedianOfAnArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		MedianOfAnArrays obj = new MedianOfAnArrays();
		System.out.println("median of the array is= "+obj.findMedian(a, n));

	}
     double findMedian(int arr[], int n) {
    	Arrays.sort(arr);
    	if(n%2 != 0) {
    		return (double) arr[n/2];
    	}
    	else {
    		return (double) ((arr[(n-1)/2]+arr[n/2]))/2; 
    	}
    }
}
