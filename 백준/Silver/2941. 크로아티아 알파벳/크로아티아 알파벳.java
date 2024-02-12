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
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
//		ArrayList<Integer> result = new ArrayList<Integer>();
		
		String input = br.readLine();
		char[] c_input = input.toCharArray();
		int count = input.length();
		
		for(int i=0, j=i+1 ; j < input.length() ; i++, j++) {
			
			String m = String.valueOf(c_input[i]).concat(String.valueOf(c_input[j]));
			
//			bw.write(m + "\n");
			
			if(m.equals("c=")) {
				count--;
			}else if(m.equals("c-")) {
				count--;
			}else if(m.equals("d-")) {
				count--;
			}else if(m.equals("lj")) {
				count--;
			}else if(m.equals("nj")) {
				count--;
			}else if(m.equals("s=")) {
				count--;
			}else if(m.equals("dz") && (j+2) <= input.length()) {
				if(c_input[i+2] == '=') {
					count = count-2;
					i = i+2;
					j = j+2;
				}
			}
			else if(m.equals("z=")) {
				count--;
			}
		}
			
		bw.write( count + " ");
		
		bw.close();
	}

}
