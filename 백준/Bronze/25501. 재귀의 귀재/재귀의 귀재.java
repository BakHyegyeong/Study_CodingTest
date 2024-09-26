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

		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i < n ; i++){
			String input = br.readLine();

			int[] result = isPalindrome(input);
			bw.write(result[0] + " " + result[1] + "\n");
		}

		bw.flush();
		bw.close();
		
	}

	public static int[] recursion(String s, int l, int r, int count){
        if(l >= r) return new int[]{1,count};
        else if(s.charAt(l) != s.charAt(r)) return new int[]{0,count};
        else return recursion(s, l+1, r-1, ++count);
    }
    public static int[] isPalindrome(String s) {
		return recursion(s, 0, s.length()-1, 1);
    }

}