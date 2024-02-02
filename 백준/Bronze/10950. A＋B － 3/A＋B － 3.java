import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		long[] sum = new long[count];
		
		for(int i=0 ; i<sum.length ; i++) {
			long num1 = scan.nextInt();
			long num2 = scan.nextInt();
			
			sum[i] = num1 + num2;
		}
		
		for(long in : sum) {
			System.out.println(in);
		}

	}

}
