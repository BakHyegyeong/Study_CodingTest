import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		long h = scan.nextInt();
		long m = scan.nextInt();
		long time = scan.nextInt();
		
		long sum = m + time;
		
		if(sum >= 60 ) {
			m = (sum % 60);
			h += (sum / 60);
		}else {
			m = sum;
		}	
		
		if(h<0) {
			h += 24;
		}else if(h >= 24) {
			h -= 24;
		}
		
		System.out.println(h + " " + m);
			
	}

}
