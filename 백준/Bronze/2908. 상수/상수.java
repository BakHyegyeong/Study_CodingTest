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
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(st.hasMoreTokens()) {
			char[] input = (st.nextToken()).toCharArray();
			
			char temp = input[0];
			input[0] = input[2];
			input[2] = temp;
			
			result.add(Integer.parseInt(String.valueOf(input)));
		}
		
		bw.write(Collections.max(result) + " ");

		bw.close();
	}

}
