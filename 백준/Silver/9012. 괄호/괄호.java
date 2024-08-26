import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> result = new ArrayList<>();

        for(int index = 0 ; index < n ; index ++) {

            ArrayList<Integer> num = new ArrayList<Integer>();
            char[] input = br.readLine().toCharArray();
            boolean is_finished = true;

            for(char i : input){

                if(i == '('){
                    num.add(1);
                }else if(!num.isEmpty() && i == ')'){
                    num.remove(num.size() -1);
                }else if(num.isEmpty() && i == ')'){
                    is_finished = false;
                }
            }

            if(num.isEmpty() && is_finished){
                result.add("YES");
            }else{
                result.add("NO");
            }
            
		}

        for(String s : result){
            bw.write(s + "\n");
            bw.flush();
        }

        bw.close();
    }
}
