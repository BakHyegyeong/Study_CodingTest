import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		ArrayList<String> result = new ArrayList<String>();
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		String input = br.readLine();
		
		for(int i=0 ; i < input.length() ; i++) {
			String in = String.valueOf(input.charAt(i));
			int in2 = Integer.parseInt(in);
			
			sum += in2;
			
		}
	
		bw.write( sum + "\n");
		
		bw.close();
	}

}
