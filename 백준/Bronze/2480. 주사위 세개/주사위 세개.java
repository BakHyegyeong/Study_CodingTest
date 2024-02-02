import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Long> num = new ArrayList<Long>();
		long money = 0; 
		long same_num = 0; long max_num = 0;
		
		num.add(scan.nextLong());
		num.add(scan.nextLong());
		num.add(scan.nextLong());
		
		for(int i=0 ; i < num.size() ; i++) {
			
			for(int j = i+1 ; j < num.size(); j++) {
				
				if((num.get(i) == num.get(j)) && num.size()!=1) {
					same_num = num.get(i);
					
					while(num.remove(Long.valueOf(same_num))) {}
				}
			}
		}
		
		if(num.size() == 3) {
			
			for( long in : num) {
				if(in > max_num) 
					max_num = in;
			}
			
			money = max_num * 100;
			
		}else if(num.size() == 1) {
			
			money = 1000 + same_num * 100;
			
		}else {

			money = 10000 +same_num * 1000;		
		}
		
		System.out.println(money);

	}

}
