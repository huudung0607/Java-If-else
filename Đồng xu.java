
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), s = sc.nextLong();
        if(s % n == 0){
            System.out.println(s/n);
        }
        else System.out.println(s/n + 1);
    }
}
