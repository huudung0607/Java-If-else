
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 1 || n == 5 || n == 10 || n == 20 || n == 100){
            System.out.println(1);
            return;
        }
        long dola100 = n / 100;
        long dola20 = (n % 100) / 20;
        long dola10 = ((n % 100) % 20) / 10;
        long dola5 = (((n % 100) % 20) % 10) / 5;
	      long dola1 = ((((n % 100) % 20) % 10) % 5) / 1;
        System.out.println(dola100 + dola20 + dola10 + dola5 + dola1);
    }
}
