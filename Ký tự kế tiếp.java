
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        a = Character.toLowerCase(a);
        if(a == 'z' || a == 'Z'){
            System.out.println('a');
            return;
        }
        int num = (int)a;
        num++;
        System.out.println((char)num);
    }
}
