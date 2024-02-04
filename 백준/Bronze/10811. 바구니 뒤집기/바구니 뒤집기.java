import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] num = new int[n];

		for(int i = 0 ; i < n ; i++) {
			num[i] = i+1;
		}

		for(int index = 0 ; index < m ; index ++) {

			st = new StringTokenizer(br.readLine());

			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;

			for(int idx = i, idx2 = j ; idx < idx2 ; idx++, idx2--) {
				int temp = num[idx];
				num[idx] = num[idx2];
				num[idx2] = temp;
			}
		}

		for(int i = 0 ; i < n ; i++) {
			bw.write(num[i] + " ");
		}
		
		bw.close();
	}
}