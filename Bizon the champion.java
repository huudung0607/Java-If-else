
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a1 = sc.nextLong(), a2 = sc.nextLong(), a3 = sc.nextLong();
        long b1 = sc.nextLong(), b2 = sc.nextLong(), b3 = sc.nextLong();
        long n = sc.nextLong();
        long cup = a1 + a2 + a3;
        long huyChuong = b1 + b2 + b3;
        long soKe = 0;
        if(cup % 5 == 0){
            soKe += cup / 5;
        }
        else{
            soKe += (cup / 5) + 1;
        }
        if(huyChuong % 10 == 0){
            soKe += huyChuong / 10;
        }
        else soKe += (huyChuong / 10) + 1;
        if(soKe <= n) System.out.println("YES");
        else System.out.println("NO");
    }
}
