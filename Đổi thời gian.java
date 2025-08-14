
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long h = n / 3600;
        long m = (n % 3600) / 60;
        long s = (n % 3600) % 60;
        System.out.println(h + "h : " + m + "m : " + s + "s");
    }
}
