import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> sum = new ArrayList<Integer>();
		
		boolean isFinish = true;
		
		do {
				
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			if( (num1 == 0) && (num2 == 0)) {
				isFinish = false;
			}else {
				sum.add(num1 + num2);
			}
				
		
		}while(isFinish);
		
		for(int in : sum) {
			bw.write(in + "\n");
		}
		
		bw.close();
	}

}