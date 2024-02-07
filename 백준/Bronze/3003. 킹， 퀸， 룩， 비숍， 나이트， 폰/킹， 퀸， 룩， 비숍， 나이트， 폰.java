import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] num_chess = {1,1,2,2,2,8};
		ArrayList<Integer> num_input = new ArrayList<Integer>();
			
		while(st.hasMoreTokens()) {
			num_input.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i=0 ; i < num_input.size(); i++) {
			bw.write(num_chess[i] - num_input.get(i) + " ");
		}
		
		bw.close();
	}

}
