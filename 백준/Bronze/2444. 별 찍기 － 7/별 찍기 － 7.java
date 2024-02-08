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
		
		int n = Integer.parseInt(br.readLine());
		int n_max = 2*n -1;
		
		for(int i = 1 ; i <= n_max ; i = i+2 ) {
			
			int space = (n_max - i) / 2;
			
			for(int j = 0 ; j < space ; j ++) {
				bw.write(" " +"");
			}
			for(int k = 0 ; k < i ; k++) {
				bw.write("*" + "");
			}
			bw.write("\n");
			
		}
		
		
		for(int i = n_max -2 ; i >= 1 ; i = i -2) {
			
			int space = (n_max - i) / 2;
			
			for(int j = 0 ; j < space ; j ++) {
				bw.write(" " +"");
			}
			for(int k = 0 ; k < i ; k++) {
				bw.write("*" + "");
			}
			
			bw.write("\n");
			
		}
		
		bw.close();
	}

}
