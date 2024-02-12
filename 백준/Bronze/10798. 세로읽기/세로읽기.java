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
		
		int[][] input = new int[5][15];
		
		for(int i=0 ; i < 5 ; i++) {
			
			char[] c_input = br.readLine().toCharArray();

			for(int j=0 ; j <c_input.length ; j++) {
				
				input[i][j] = c_input[j];
				
			}
		}
		
		for(int i=0 ; i < 15 ; i++) {
			for(int j=0 ; j < 5 ; j++) {
				if(input[j][i] != 0) {
					bw.write((char)input[j][i]+"");
				}
			}
		}
		
		
		
		
		bw.close();
	}

}
