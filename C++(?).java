
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int demC = 0;
        int demCong = 0;
        for(int i = 0 ; i < n; ++i){
            char c = sc.next().charAt(0);
            if(c == 'C') demC++;
            if(c == '+') demCong++;
            if(demC >= 1 && demCong >= 2){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
