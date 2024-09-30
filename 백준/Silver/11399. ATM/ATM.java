import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// int n = Integer.parseInt(st.nextToken());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] array = new int[n];
		for(int i=0 ; i < n ; i++){
			array[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(array);

		int result = 0;
		for(int i=0 ; i < n ; i++){
			result += array[i] * (array.length - i);
		}
		
		bw.write(result + "");

		bw.flush();
		bw.close();
		
	}

	

}