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
		
		for(int i=0 ; i < n ; i++) {
			int pay = Integer.parseInt(br.readLine());
						
			int qu = pay / 25;
			pay -= qu * 25;
			int di = (pay % 25) / 10;
			pay -= di * 10;
			int ni = (pay % 10) / 5;
			pay -= ni * 5;
			int pe = (pay % 5) / 1;
			
			bw.write(qu + " " + di + " " 
					+ ni + " " + pe + " " + "\n");
		}

		bw.close();
	}

}
