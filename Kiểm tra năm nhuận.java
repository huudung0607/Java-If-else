
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) System.out.print("YES");
        else System.out.print("NO");
    }
}
