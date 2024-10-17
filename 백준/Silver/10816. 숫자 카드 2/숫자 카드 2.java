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
// 코테는 java.util.* 로!
// 자바는 java.io.* 로!

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i < n ; i++){
			array[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(array);

		int m = Integer.parseInt(br.readLine());	
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i < m ; i++){
			int num = Integer.parseInt(st.nextToken());

			bw.write(upperbound(array, num, 0, n) - lowerbound(array, num, 0, n) + " ");
		}	
		
		// bw.write(money + "");

		bw.flush();
		bw.close();
		
	}

	public static int search(int[] array, int key, int low, int high){
		int mid;

		while(low <= high){
			mid = (low + high)/2;

			if(key == array[mid]){
				return 1;
			}else if(key < array[mid]){
				high = mid-1;
			}else{
				low = mid+1;
			}
		}

		return 0;
	}

	public static int lowerbound(int[] array, int key, int low, int high){
		int mid;

		while(low < high){
			mid = (low + high)/2;

			if(key <= array[mid]){
				high = mid;
			}else{
				low = mid+1;
			}
		}

		return low;
	}

	public static int upperbound(int[] array, int key, int low, int high){
		int mid;

		while(low < high){
			mid = (low + high)/2;

			if(key >= array[mid]){
				low = mid+1;
			}else{
				high = mid;
			}
		}

		return low;
	}

	

}