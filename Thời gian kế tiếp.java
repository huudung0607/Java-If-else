import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        int phut = h * 28 + m + k;
        int gio = phut / 28;
        gio %= 28;
        phut %= 28;
        System.out.printf("%02dh:", gio);
        System.out.printf("%02dm",phut);
    }
}
