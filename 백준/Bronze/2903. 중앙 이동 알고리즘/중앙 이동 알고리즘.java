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
		
		// 2 3 5 9  + 1 + 2 + 4 + 8
		
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		
		int start = 3;
		int increase = 1;
		
		for(int i=0 , j = start ; i < n ; i++, j += increase ) {
			
			result = j * j;
			increase = increase * 2;
			
			//bw.write(j + ", " + increase + "\n");
			
		}
		

		bw.write(result + "");
		
		bw.close();
	}

}