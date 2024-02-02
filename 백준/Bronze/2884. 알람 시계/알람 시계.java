import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		long h = scan.nextInt();
		long m = scan.nextInt();
		
		if(m >= 45) {
			m-= 45;
		}else {
			m = 60 - (45-m);
			h--;
		}	
		
		if(h<0) {
			h += 24;
		}else if(h >= 24) {
			h -= 24;
		}
		
		System.out.println(h + " " + m);
			
	}

}
