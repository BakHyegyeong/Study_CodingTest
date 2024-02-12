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

		int[][] input = new int[9][9];
		int max = 0;
		int max_i = 0;
		int max_j = 0;
		
		for(int i=0 ; i < 9 ; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int j=0 ; j <9 ; j++) {
				input[i][j] = Integer.parseInt(st.nextToken());
				
				if(input[i][j] >= max) {
					max = input[i][j] ; max_i = i+1; max_j = j+1;
				}
			}
		}
		
		bw.write(max + "\n");
		bw.write(max_i + " " + max_j);
		
		
		bw.close();
	}

}
