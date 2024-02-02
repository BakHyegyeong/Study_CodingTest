import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int sum_money = 0;
		
		int all_money = scan.nextInt();
		int count = scan.nextInt();
		
		for(int i=0 ; i < count ; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			sum_money += a*b;
		
		}
		
		if(sum_money != all_money) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
		
		
		
		
	}

}
