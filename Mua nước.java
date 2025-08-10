import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a = sc.nextInt(), b = sc.nextInt();
        int motLit = b / 2;
        if(motLit < a){
            if(n % 2 == 0){
                long nuoc = n / 2;
                System.out.println(b * nuoc);
            }
            else{
                long nuoc = n / 2;
                System.out.println(b * nuoc + a);
            }
        }
        else{
            System.out.println(a * n);
        }
    }
}
