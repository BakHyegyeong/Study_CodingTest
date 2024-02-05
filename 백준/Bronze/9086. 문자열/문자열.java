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
		
		ArrayList<String> result = new ArrayList<String>();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i< t ; i++) {
			String input = br.readLine();
			
			char start = input.charAt(0);
			char end = input.charAt(input.length()-1);
			
			result.add(String.valueOf(start) + String.valueOf(end));
		}
		
		for(String st : result) {
			bw.write( st + "\n");
		}
		
		
		
		bw.close();
	}

}
