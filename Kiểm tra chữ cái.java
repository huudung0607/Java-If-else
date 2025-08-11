
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a >= 'A' && a <= 'Z'){
            System.out.println("UPPER");
        }
        else if(a >= 'a' && a <= 'z'){
            System.out.println("LOWER");
        }
        else if(a >= '0' && a <= '9'){
            System.out.println("DIGIT");
        }
        else System.out.println("SPECIAL");
    }
}
