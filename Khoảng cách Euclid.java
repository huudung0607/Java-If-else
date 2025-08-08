
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); int y = sc.nextInt();
        int z = sc.nextInt(); int t = sc.nextInt();
        double res = 1.0 * Math.sqrt((x - z) * (x - z) + (y - t) * (y - t));
        System.out.printf("%.2f",res);
        
    }
}
