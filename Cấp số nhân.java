
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong() , d = sc.nextLong();
        if(b % a == 0){
            long congBoi1 =  b / a;
            if(b * congBoi1 % c == 0){
                long congBoi2 = c / b;
                if(c * congBoi2 % d == 0){
                    long congBoi3 = d / c;
                    if(d * congBoi3 % d == 0){
                        System.out.println("YES");
                    }
                    else System.out.println("NO");
                }
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
        else System.out.println("NO");
    }
}
