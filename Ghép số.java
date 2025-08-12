
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long k2 = sc.nextLong(), k3 = sc.nextLong(), k5 = sc.nextLong(), k6 = sc.nextLong();
        long k256 = Math.min(k2,Math.min(k5,k6));
        long k32 = Math.min(k3,k2 - k256);
        System.out.println(k256 *256 + 32 * k32);
    }
}
