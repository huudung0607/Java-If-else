
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int gio = sc.nextInt(), phut = sc.nextInt();
        System.out.println(1440 - (gio * 60 + phut));
    }
}
