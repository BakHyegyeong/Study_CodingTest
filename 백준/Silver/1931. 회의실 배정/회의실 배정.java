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
		// StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[][] array = new int[n][2];
		for(int i=0 ; i < n ; i++){
			String[] input = br.readLine().split(" ");
			int num1 = Integer.parseInt(input[0]);
			int num2 = Integer.parseInt(input[1]);

			array[i][0] = num1;
			array[i][1] = num2;
		}

		// 2차원 배열 정렬
		Arrays.sort(array, (start, end) -> {
			return (start[1] == end[1] ? start[0] - end[0] : start[1] - end[1] );	
			// 2차원 값을 기준으로 오름차순 정렬하되 비교하는 숫자의 값이 같을 경우
			// 1차원 값을 기준으로 오름차순 정렬(끝나는 시간이 더 빠른)
		});

		// for(int i=0 ; i < n ; i++){
		// 	bw.write("시작 시간 : " + array[i][0] + "끝나는 시간 : " +  array[i][1] + "\n");
		// }

		int end = 0; int result = 0;
		for(int i=0 ; i < n ; i++){

			// bw.write(i + "번째 시작 시간 : " + array[i][0] + "\n");
			// bw.write(i + "번째 끝 시간 : " + array[i][1] + "\n");
			// bw.write(i + "번째 끝나는 시간 : " + end + "\n");

			if( end <= array[i][0]){
				result++;
				end = array[i][1];
				// bw.write(i + "번째 끝나는 시간 : " + end + "\n");
			}

		}

		bw.write( result + "");

		bw.flush();
		bw.close();
		
	}

	

}