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
		
		int n = Integer.parseInt(br.readLine());
		int[][] ground = new int[100][100];
		int result = 0;
		
		for(int i=0 ; i < n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=x ; j < x+10 ; j++) {
				for(int k=y ; k < y+10 ; k++) {
//					bw.write(j+", "+k + "\n");
					ground[j][k] = 1;
				}
			}
			
		}
		
		for(int i=0 ; i < ground.length ; i++) {
			
			for(int j=0 ; j < ground[i].length ; j++) {
				
				if(ground[i][j] == 1) {
					result++;
				}
			}
		}
		
		bw.write(result + "");
		
		bw.close();
	}

}