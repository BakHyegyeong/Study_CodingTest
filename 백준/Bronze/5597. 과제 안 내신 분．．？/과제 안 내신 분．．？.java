import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st ;
//		st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int index =1; index <= 30 ; index++) {
			num.add(index);
		}
		
		for(int index = 0 ; index < 28 ; index ++) {
			
			int n = Integer.parseInt(br.readLine());
			
			num.remove(Integer.valueOf(n));
			
		}
		
		for(int in : num) {
			bw.write(in + "\n");
		}
		
		bw.close();
	}

}