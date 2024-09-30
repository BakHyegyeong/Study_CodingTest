import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// int n = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] array = new int[n];
		for(int i=0 ; i < n ; i++){
			array[i] = Integer.parseInt(br.readLine());
		}

		int money = k; int count = 0;
		for(int i=n-1 ; i >= 0 ; i--){
			if(array[i] > money){
				continue;
			}else if(array[i] == k){
				count = 1;
				break;
			}else {
				count += money / array[i];
				money = money % array[i];
			}
		}

		bw.write(count + "");

		bw.flush();
		bw.close();
		
	}

	

}