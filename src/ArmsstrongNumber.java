import java.util.Scanner;

public class ArmsstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int i = 0, result = 0;
		int n1 = n, temp = n;
		while(n != 0){
			n = n/10;
			i++;
		}
		//System.out.println(i); //length of the number
		
		while(n1 != 0) {
			int a = n1%10;
		    result += (int) Math.pow(a, i);
			n1 = n1/10;
		}
		//System.out.println(result);
		if(result == temp) {
			System.out.println("the number is a armstrong number");
		}
		else{
			System.out.println("the number is not a armstrong number");
		}
	}

}
