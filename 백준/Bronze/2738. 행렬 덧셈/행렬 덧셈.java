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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		int[][] result = new int[n][m];
		
		for(int i=0 ; i < a.length ; i++) {
			
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			
			for(int j=0 ; j < a[i].length ; j++) {
		
				a[i][j] = Integer.parseInt(st1.nextToken());
			}
		}
		
		for(int i=0 ; i < b.length ; i++) {
			
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			
			for(int j=0 ; j < b[i].length ; j++) {
		
				b[i][j] = Integer.parseInt(st1.nextToken());
			}
		}
		
		for(int i=0 ; i < result.length ; i++) {
			
			for(int j=0 ; j < result[i].length ; j++) {
		
				result[i][j] = a[i][j] + b[i][j];
				bw.write(result[i][j] + " ");
			}
			
			bw.write("\n");
			
		}
		
		bw.close();
	}

}
