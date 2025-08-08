
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt();
        System.out.print(a / b * b);
        System.out.print(" ");
        if(a % b == 0) System.out.print(a);
        else System.out.print((a/b + 1)*b);
    }
}
