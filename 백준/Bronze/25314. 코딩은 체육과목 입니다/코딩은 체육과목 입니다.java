import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int save = scan.nextInt();
		
		String msg = "long int";
		
		for(int i = 1 ; i < save /4; i++) {
			msg = "long " + msg;
		}
		
		System.out.println(msg);
	}

}
