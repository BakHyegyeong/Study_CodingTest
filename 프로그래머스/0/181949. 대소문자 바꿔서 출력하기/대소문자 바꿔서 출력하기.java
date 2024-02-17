import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] c = new char[a.length()];
        
        for(int i = 0 ; i < a.length() ; i++){
            if(a.charAt(i) >= 97){
                c[i] = (char)(a.charAt(i) - 32);
            }else{
                c[i] = (char)(a.charAt(i) + 32);
            }
        }
        
        System.out.print(String.valueOf(c));
        
    }
}