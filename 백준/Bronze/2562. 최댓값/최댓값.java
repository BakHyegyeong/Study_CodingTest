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
//		int n = Integer.parseInt(br.readLine());

//		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<9 ; i++) {
			num.add(Integer.parseInt(br.readLine()));	
		}
		
		int max_num = Collections.max(num);
		
		bw.write(max_num + "\n");
		bw.write(num.indexOf(Integer.valueOf(max_num)) + 1 + "\n" );
		
		bw.close();
	}

}