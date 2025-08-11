import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
        long maxNum = Math.max(Math.max(a,b),Math.max(c,d));
        long minNum = Math.min(Math.min(a,b),Math.min(c,d));
        System.out.println(maxNum + " " + minNum);
    }
}
