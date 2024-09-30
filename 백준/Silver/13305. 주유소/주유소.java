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

		int[] load = new int[n-1];	// 도로의 길이
		int need = 0; int have = 0;	// 필요한 기름 값, 보유 기름 값
		for(int i=0 ; i < n-1 ; i++){
			load[i] = Integer.parseInt(st.nextToken());
			need += load[i];
		}

		st = new StringTokenizer(br.readLine(), " ");
		int[] station = new int[n];	// 리터당 가격
		int money = 0; int min = 5; int max = 5;
		for(int i=0 ; i < n ; i++){
			station[i] = Integer.parseInt(st.nextToken());

			if(station[i] < min){
				min = station[i];
			}else if (station[i] > max){
				max = station[i];
			}
		}

		int i = 0; int location = 0;
		while(need != 0 && i <= station.length-1){
			// bw.write("현재 need : "+ need + ", 현재 index :" + i + "\n");
			if(station[i] == min){
				for(int j=i ; j <= load.length-1 ; j++){
					money += station[i] * load[j];
					need -= load[j]; 
					// bw.write("현재 money : "+ money + ", 현재 need : "+ need + " 종료!\n");
				}
				break;
			}else if (station[i] == max){
				money += station[i] * load[i];
				need -= load[i]; 
				i++;
				// bw.write("현재 money : "+ money + ", 현재 need : "+ need + " 다음!\n");
			} else {
				for(int j = i+1 ; j <= station.length -1 ; j++){
					money += station[i] * load[j-1];
					need -= load[j-1];
					// bw.write("현재 money : "+ money + ", 현재 need : "+ need + " 다음!!\n");
					if(station[i] > station[j]){
						break;
					}
				}
				i++;
			}
		}
		
		bw.write(money + "");

		bw.flush();
		bw.close();
		
	}

	

}