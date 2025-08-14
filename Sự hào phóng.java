
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt(), c2 = sc.nextInt(), c3 = sc.nextInt(), c4 = sc.nextInt(), c5 = sc.nextInt();
        int tong = c1 + c2 + c3 + c4 + c5;
        if(tong % 5 == 0 && tong / 5 != 0){
            System.out.println(tong/5);
        }
        else System.out.println(-1);
    }
}
