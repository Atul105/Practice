import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(a+" ,"+b+" ,");
		for(int i = 0; i<n-2; i++) {
			int result = a+b;
			a = b;
			b = result;
			System.out.print(result+" ,");
		}

	}

}
