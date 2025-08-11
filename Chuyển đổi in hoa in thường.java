import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(Character.isLowerCase(a)){
            a = Character.toUpperCase(a);
            System.out.println(a);
        }
        else{
            a = Character.toLowerCase(a);
            System.out.println(a);
        }
    }
}
