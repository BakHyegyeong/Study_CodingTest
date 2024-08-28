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

        Integer result = 0;
        int n = Integer.parseInt(br.readLine());

        for(int index = 0 ; index < n ; index++){
            String input = br.readLine();

            switch (input) {
                case "pop":
                    result = queue.poll();
                    if(result == null){
                        bw.write("-1" + "\n");
                    }else{
                        bw.write(result + "\n");
                    }
                    // bw.flush();                  
                    break;
                case "size" :
                    bw.write(queue.size() + "\n");
                    // bw.flush();
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        bw.write("1" + "\n");
                    }else{
                        bw.write("0" + "\n");
                    }
                    // bw.flush();                  
                    break;
                case "front" :
                    if(queue.isEmpty()){
                        bw.write("-1" + "\n");
                    }else{
                        bw.write(queue.peek() + "\n");
                    }
                    // bw.flush();                  
                    break;
                case "back" :
                    if(queue.isEmpty()){
                        bw.write("-1" + "\n");
                    }else{
                        bw.write(queue.peekLast() + "\n");
                    }
                    // bw.flush();                  
                    break;
                default:
                    String[] push = input.split(" ");
                    queue.add(Integer.parseInt(push[1]));
            }
        } 
        
        // bw.write(n);
        bw.flush();
        // num.add(n);

        bw.close();
    }

}
