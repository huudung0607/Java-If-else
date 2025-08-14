import java.util.*;
import java.lang.*;
import java.io.*;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n * (n + 1)/2);
        System.out.println(n * (n + 1) * (2 * n + 1) / 6);
        System.out.println(n/3);
        System.out.println(3 * (n/3 * (n/3 + 1) / 2));
    }
}
