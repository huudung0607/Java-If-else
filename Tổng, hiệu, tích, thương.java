import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(); long b = sc.nextLong();
        System.out.println(1L * a + b);
        System.out.println(1L * a - b);
        System.out.println(1L * a * b);
        if(b == 0) System.out.println("INVALID");
        else System.out.printf("%.4f",(double)a/b);
                
    }
}
