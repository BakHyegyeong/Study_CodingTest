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
		StringTokenizer st ;
		
//		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int t = Integer.parseInt(br.readLine());
		String[] result = new String[t];
		
		for(int i=0 ; i < t ; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken());
			char[] input = (st.nextToken()).toCharArray();
			
			for(int j=0 ; j <input.length ; j++) {
				
				for(int k=0 ; k < num ; k++) {
					
					if(result[i] == null) {
						result[i] = String.valueOf(input[j]);
					}else {
						result[i] += String.valueOf(input[j]);
					}
				}
				
			}
			
		}
		
		for(String in : result) {
			bw.write( in + "\n");
		}
		
		bw.close();
	}

}
