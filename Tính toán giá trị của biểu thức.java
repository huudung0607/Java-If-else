
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long ans = 1L * x*x*x + 3*(x*x) + x + 1;
        System.out.println(1L * ans);
    }
}
