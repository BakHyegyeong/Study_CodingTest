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
		
//		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int[] result = new int[26];
		
//		for(int i : result) {
//			i = -1;
//		}
		
		for(int i=0 ; i < result.length ; i++) {
			result[i] = -1;
		}
		
		String s = br.readLine();
		int asc = 97;
		
		for(int j=0 ; j < s.length() ; j++) {
			
			int ch = s.charAt(j);
			
			for(int i=asc ; i <= asc+35 ; i++) {
				
				if(ch == i && result[i-97] == -1) {
					result[i - 97] = j;
				}			
			}
			
		}
		
		for(int in : result) {
			bw.write( in + " ");
		}
		
		bw.close();
	}

}
