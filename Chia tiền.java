
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), n = sc.nextLong();
        long tongXu = a + b + c + n;
        long chiaXu = tongXu/3;
        if((tongXu % 3 == 0) && chiaXu >= a && chiaXu >= b && chiaXu >= c) System.out.println("YES");
        else System.out.println("NO");
    }
}
