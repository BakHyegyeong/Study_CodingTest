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
		
		
		double[] num = new double[20];
		double[] d_grade = new double[20];
		
		double num_result = 0;
		double grade_result = 0;
		
		
		for(int i=0 ; i < 20 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			st.nextToken();
			num[i] = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			if(grade.equals("P")) {
				num[i] = 0.0;
				d_grade[i] = 0;
			}else if(grade.equals("F")) {
				d_grade[i] = 0;
			}else if(grade.equals("A+")) {
				d_grade[i] = 4.5;
			}else if(grade.equals("A0")) {
				d_grade[i] = 4.0;
			}else if(grade.equals("B+")) {
				d_grade[i] = 3.5;
			}else if(grade.equals("B0")) {
				d_grade[i] = 3.0;
			}else if(grade.equals("C+")) {
				d_grade[i] = 2.5;
			}else if(grade.equals("C0")) {
				d_grade[i] = 2.0;
			}else if(grade.equals("D+")) {
				d_grade[i] = 1.5;
			}else if(grade.equals("D0")) {
				d_grade[i] = 1.0;
			}			
		}
		
		for(int i=0 ; i < 20 ; i++) {
			num_result += num[i];
			grade_result += num[i] * d_grade[i];
		}
		
		double sum = (grade_result / num_result);

		bw.write(String.format("%.6f", sum) + "");
	
		bw.close();
	}

}
