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
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		char[] input = (br.readLine()).toCharArray();
		int time = 0;
		
		for(int i=0 ; i<input.length ; i++) {
			
			switch(input[i]) {
				case 'A': case 'B': case 'C':
					time += 3; break;
				case 'D': case 'E': case 'F':
					time += 4; break;
				case 'G': case 'H': case 'I':
					time += 5; break;
				case 'J': case 'K': case 'L':
					time += 6; break;
				case 'M': case 'N': case 'O':
					time += 7; break;
				case 'P': case 'Q': case 'R': case 'S':
					time += 8; break;
				case 'T': case 'U': case 'V':
					time += 9; break;
				case 'W': case 'X': case 'Y': case 'Z':
					time += 10; break;
			}
		}
		
		bw.write(time + "\n");
		
		bw.close();
	}

}
