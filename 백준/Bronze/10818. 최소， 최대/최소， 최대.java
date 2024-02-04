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
		StringTokenizer st ;
		st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n ; i++) {
			num.add(Integer.parseInt(st.nextToken()));	
		}
		
		bw.write(Collections.min(num) + " ");
		bw.write(Collections.max(num) + " ");
		
		bw.close();
	}

}