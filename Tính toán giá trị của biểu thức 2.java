
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = 1L * a * (b + c) + b * (a + c);
        System.out.println(1L * s);
    }
}
