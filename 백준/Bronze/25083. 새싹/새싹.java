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
		
//		ArrayList<Integer> result = new ArrayList<Integer>();
			
		String see = "         ,r'\"7\n"
				+ "r`-_   ,'  ,/\n"
				+ " \\. \". L_r'\n"
				+ "   `~\\/\n"
				+ "      |\n"
				+ "      |";
		
		
		
		bw.write(see + " ");
		
		bw.close();
	}

}
