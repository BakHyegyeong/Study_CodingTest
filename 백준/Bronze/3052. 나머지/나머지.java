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
		int count = 10;
		
		for(int index = 0 ; index < 10 ; index ++) {
			
			int n = (Integer.parseInt(br.readLine())) % 42;
			
			if(!num.contains(n)) {
				num.add(n);
			}	
		}

		
		
		bw.write(num.size() + " ");
		
		bw.close();
	}

}