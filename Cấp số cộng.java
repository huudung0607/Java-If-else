
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), u1 = sc.nextLong(), d = sc.nextLong();
        System.out.println(1L * n * (2 * u1 + (n - 1) * d)/2);
    }
}
