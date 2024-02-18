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
		String result = "";

		int i = 0;
		int count = 0;
		
		while(true) {
			
			if(n - i > 0){
				n -= i;
				count++; i++;
				continue;
			}
			
			break;
		}
		
		int num = count+1;
		
		if(num % 2 == 0) {
			for(int j = num-1 , p = 0; p < n ; j--, p++) {
				int k = num - j;
				
				result = j + "/" + k;
			}
		}else {
			for(int j = 1 , p = 0; p < n ; j++, p++) {
				int k = num - j;
				
				result = j + "/" + k;

			}	
			
		}
		
		bw.write(result);
		
		bw.close();
	}

}
