import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();

        // StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Integer n = Integer.parseInt(br.readLine());

        bw.write(re(n)+"");
        bw.flush();
        bw.close();

    }

    public static Integer re(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        return re(n-1) + re(n-2);
    }
    

}