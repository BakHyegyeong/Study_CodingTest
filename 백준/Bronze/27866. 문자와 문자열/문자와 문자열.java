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
		
//		ArrayList<Integer> sum = new ArrayList<Integer>();
		
		String input = br.readLine();
		int i = Integer.parseInt(br.readLine()) - 1;

		bw.write(input.charAt(i));
		
		bw.close();
	}

}
