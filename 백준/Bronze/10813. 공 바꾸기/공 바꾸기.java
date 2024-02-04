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
		StringTokenizer st ;
		st = new StringTokenizer(br.readLine());
		
//		ArrayList<Integer> num = new ArrayList<Integer>();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] num = new int[n][1];
		
		for(int i =0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				num[i][j] = i+1;
			}
		}
		
		for(int index =0; index < m ; index++) {
			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			
			int temp = num[i][0];
			num[i][0] = num[j][0];
			num[j][0] = temp;
			
		}
		
		for(int index = 0 ; index < n ; index ++) {
			bw.write(num[index][0] + " ");
		}
		
		bw.close();
	}

}