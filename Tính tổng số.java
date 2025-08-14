
import java.util.*;
import java.lang.*;
import java.io.*;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0, kyTu = 0;
        for(int i = 0 ;i < n; ++i){
            char c = sc.next().charAt(0);
            if(Character.isLetter(c)){
                kyTu++;
            }
            else if(Character.isDigit(c)){
                tong += c - '0';
            }
        }
        System.out.println(kyTu);
        System.out.print(tong);
    }
}
