import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> num = new ArrayList<Integer>();

        int n = Integer.parseInt(br.readLine());

        for(int index = 0 ; index < n ; index ++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int input = Integer.parseInt(st.nextToken());

            switch (input) {
                case 1:
                    num.add(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if(num.isEmpty()){
                        bw.write("-1" + "\n");
                        bw.flush();
                    }else{
                        bw.write(num.get(num.size()-1) + "\n");
                        bw.flush();
                        num.remove(num.size()-1);
                    }
                    break;
                case 3:
                    bw.write(num.size() + "\n");
                    bw.flush();
                    break;
                case 4:
                    if(num.isEmpty()){
                        bw.write("1" + "\n");
                        bw.flush();
                    }else{
                        bw.write("0" + "\n");
                        bw.flush();
                    }
                    break;
                case 5:
                    if(num.isEmpty()){
                        bw.write("-1" + "\n");
                        bw.flush();
                    }else{
                        bw.write(num.get(num.size()-1) + "\n");
                        bw.flush();
                    }
                    break;
                default:
                    throw new AssertionError();
            }
		}

        bw.close();
    }
}
