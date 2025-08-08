import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double F = 1.0 * x * 9/5 + 32;
        System.out.printf("%.2f",F);
    }
}
