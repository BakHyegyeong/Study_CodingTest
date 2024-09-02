import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Integer n = Integer.parseInt(br.readLine());
        long result = 1;

        for(int index=1 ; index <= n ; index++){
            result *=index;
        }

        System.out.println(result);

    }

}