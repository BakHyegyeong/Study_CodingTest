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
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		char[] input = (br.readLine().toUpperCase()).toCharArray();
//		ArrayList<String> s_input = new ArrayList<String>();
//		
//		for(char c : input) {
//			s_input.add(String.valueOf(c));	
//		}
	
		
		
//		ArrayList<String> max_string = new ArrayList<String>();
//		ArrayList<Integer> count = new ArrayList<Integer>();
		
		char[] max_char = new char[26];
		int[] count = new int[26];
		
		for(int j=0 ; j < input.length ; j++) {
			
			for(int i = 'A' ; i <= 'Z' ; i++) {
				if(input[j] == i) {
					max_char[ i - 'A'] = (char) i;
					count[ i - 'A']++;
				}
			}
			
			
		}
						
//		for(String s : s_input) {
//			count.add(Collections.frequency(s_input, s));
//		}
//		
//		int num = Collections.max(count);
		
		int num = 0;
		String msg = "";
		
		for(int i = 0 ; i < count.length ; i++) {
			if(count[i]> num) {
				num = count[i];
				msg = String.valueOf(max_char[i]);
			}else if(count[i] == num) {
				msg = "?";
			}
		}
		
//		for(int i=0 ; i < count.size() ; i++) {
//			
//			if(count.get(i) == num && !max_string.contains(s_input.get(i))) {
//				max_string.add(s_input.get(i));
//			}	
//		}
		
//		String msg = (max_string.size() != 1) ? "?" : max_string.get(0);
		
		bw.write(msg + "");
		
		bw.close();
	}

}
