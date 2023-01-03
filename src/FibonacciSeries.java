import java.util.Scanner;

public class FibonacciSeries {

	static int fib(int a) {
		if(a==0) return 0;
		else if (a==1) return 1;
		else return(fib(a-1)+fib(a-2));
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a limit");
	int n = sc.nextInt();
	for(int i = 0; i<n; i++) {
		System.out.print(fib(i)+" ,");
	}
    sc.close();
	}

}
