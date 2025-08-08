
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.printf("%.4f", 1.0 * 3.14 * 2 * x);
        System.out.print(" ");
        System.out.printf("%.4f", 3.14 * x * x);
    }
}
