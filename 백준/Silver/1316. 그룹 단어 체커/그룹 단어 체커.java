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
		int num = 0;
		
		
		for(int i=0 ; i < n ; i++) {
			
			char[] input = br.readLine().toCharArray();
			boolean isCheck = true;
			
			for(int j=0 ; j < input.length ; j++) {
				
				char c = input[j];
				
				for(int k=j+1 ; k <= input.length -1 ; k++ ) {
					
//					bw.write(c + " " + input[k] + " " + j + " " + k + "\n" );
					
					if(c == input[k] && k - j != 1 ) {
						
						if(input[k-1] == input[k]) {
							continue;
						}else {
//							bw.write("check X! \n");
							isCheck = false;
						}
						
					}
				}
				
					
			}
			
			if(isCheck) {num++;}
			
		}
		
		bw.write(num + "");
		
		bw.close();
	}

}