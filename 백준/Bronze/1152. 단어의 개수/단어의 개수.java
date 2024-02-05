import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = 0;
		
//		ArrayList<Integer> result = new ArrayList<Integer>();
		
//		String[] input = br.readLine().split(" ");	
		
//		if(input[0] == "") {
//			bw.write( input.length-1 + "\n");
//		}else {
//			bw.write( input.length + "\n");
//		}
		
		while(st.hasMoreTokens()) {
			String i = st.nextToken();
			count++;
		}
		
		bw.write(count + " ");

		bw.close();
	}

}
