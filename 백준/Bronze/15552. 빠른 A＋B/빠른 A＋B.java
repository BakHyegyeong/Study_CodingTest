import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		ArrayList<Integer> sum = new ArrayList<Integer>();
		
		int t = Integer.parseInt(bf.readLine());
		int[] sum = new int[t];
		
		for(int i = 0 ; i < t ; i++) {
			String[] arr = bf.readLine().split(" ");
			
			sum[i] = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
			
		}
		
		for(int in : sum) {
			bw.write(in + "\n");
		}
		
		bw.close();
	}

}
