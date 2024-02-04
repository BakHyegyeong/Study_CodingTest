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
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<n ; i++) {
			num.add(Integer.parseInt(st.nextToken()));
		}
		
		int v = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int in : num) {
			if(in == v) {
				count ++;
			}
		}
		
		bw.write(count + "\n");
		
		bw.close();
	}

}