import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		long sum = 0;
		
		for(int i = num ; i >= 1 ; i--) {
			sum += i;
		}
		
		System.out.println(sum);

	}

}
