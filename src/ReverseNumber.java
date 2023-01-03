import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int a = 0;
		while(n != 0) {
			int j = n%10;
			a = a*10+j;
			n = n/10;
		}
		System.out.println("Reverse of the number is= " + a);

	}

}
