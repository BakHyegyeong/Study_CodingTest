import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        Integer result = 0;
        String[] push = null;

        for(int index = 0 ; index < n ; index++){
            String input = br.readLine();

            switch (input) {
                case "3" :
                    result = deque.pollFirst();
                    if(result == null){
                        bw.write("-1" + "\n");
                    }else{
                        bw.write(result + "\n");
                    }                 
                    break;
                case "4" :
                    result = deque.pollLast();
                    if(result == null){
                        bw.write("-1" + "\n");
                    }else{
                        bw.write(result + "\n");
                    }                 
                    break;
                case "5" :
                    bw.write(deque.size() + "\n");
                    break;
                case "6":
                    if(deque.isEmpty()){
                        bw.write("1" + "\n");
                    }else{
                        bw.write("0" + "\n");
                    }                
                    break;
                case "7" :
                    if(deque.isEmpty()){
                        bw.write("-1" + "\n");
                    }else{
                        bw.write(deque.peekFirst() + "\n");
                    }               
                    break;
                case "8" :
                    if(deque.isEmpty()){
                        bw.write("-1" + "\n");
                    }else{
                        bw.write(deque.peekLast() + "\n");
                    }           
                    break;
                default:
                    push = input.split(" ");
                    if(Integer.parseInt(push[0]) == 1){
                        deque.addFirst(Integer.parseInt(push[1]));
                    }else{
                        deque.addLast(Integer.parseInt(push[1]));
                    }
                    break;
            }
        } 
        
        // bw.write(n);
        bw.flush();
        // num.add(n);

        bw.close();
    }

}
