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

        // ArrayList<Integer> num = new ArrayList<Integer>();
        LinkedList<Integer> queue = new LinkedList<Integer>();

        int n = Integer.parseInt(br.readLine());

        for(int index = 1 ; index <= n ; index++){
            queue.add(index);
        }

        while(queue.size() != 1){
            queue.poll();
            queue.add(queue.poll());
        }

        bw.write(queue.peek() + "\n");
        bw.flush();
        // num.add(n);

        bw.close();
    }

}
