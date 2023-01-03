import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean flag = false;
		if(n==1 || n == 0) {
			System.out.println("not a prime number");
		}else {
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("not a prime number");
		}else {
			System.out.println("prime number");
		}
	   }
	}
}
