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

		int n = Integer.parseInt(br.readLine());

		ArrayList<Double> num = new ArrayList<Double>();
		st = new StringTokenizer(br.readLine());

		for(int index = 0 ; index < n ; index ++) {
			num.add(Double.parseDouble(st.nextToken()));
		}

		double max_num = Collections.max(num);
		double sum = 0; 
		
		for(double in : num) {			
			sum += in/max_num * 100;		
		}
		
		double avg = sum / n;
		
		bw.write(Double.toString(avg));
		
		bw.close();
	}
}