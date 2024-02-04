import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st ;
		st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n ; i++) {
			
			int input = Integer.parseInt(st.nextToken());
			
			if(input < x) {
				num.add(input);
			}
		}
		
		for(int in : num) {
			bw.write(in + " ");
		}
		
		bw.close();
	}

}