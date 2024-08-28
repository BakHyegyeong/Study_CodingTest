import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> num = new ArrayList<Integer>();
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 1;

        for(int index = 1 ; index <= n ; index++){
            queue.add(index);
        }

        while(count <= n){
            for(int index = 1; index <= k ; index++){
                if(index == k){
                    num.add(queue.poll());
                    count++;
                }else{
                    queue.add(queue.poll());
                }
            }
        }

        bw.write("<");
        for(int index = 0 ; index < num.size() ; index++){
            if(index == num.size()-1){
                bw.write(num.get(index) + "");
            }else{
                bw.write(num.get(index) + ", ");
            }
        }
        bw.write(">");
        bw.flush();

        bw.close();
    }

}
