import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> num = new ArrayList<Integer>();

        int k = Integer.parseInt(br.readLine());

        for(int index = 0 ; index < k ; index ++) {

            int input = Integer.parseInt(br.readLine());

            if(input != 0){
                num.add(input);
            }else{
                num.remove(num.size()-1);
            }
            
		}

        int result = 0;
        for(Integer i : num){
            result += i;
        }

        bw.write(result + "\n");
        bw.flush();

        bw.close();
    }
}
