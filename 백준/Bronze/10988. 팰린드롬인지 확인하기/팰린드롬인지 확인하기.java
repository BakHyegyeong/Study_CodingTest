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
		
		char[] input = (br.readLine()).toCharArray();
		int result = 0;
		
		for(int i =0 ; i < input.length / 2 ; i++) {
			
			if(input[i] == input[(input.length-1) -i]) {
				result++;
			}
		}
		
		if(result == input.length / 2) {
			bw.write(1 + "");
		}else {
			bw.write(0 + "");
		}
		
		
		
		bw.close();
	}

}
