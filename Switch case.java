
import java.util.*;
import java.lang.*;
import java.io.*;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        char c = sc.next().charAt(0);
        switch(c){
            case '+':
		System.out.println(a + " + " + b + " = " + (a + b));
		break;
            case'-':
		System.out.println(a + " - " + b + " = " + (a - b));
		break;
            case'*':
		System.out.println(a + " * " + b + " = " + (a * b));
		break;
            case'/':
                double res = 1.0 * a/b;
		System.out.printf("%d / %d = %.2f",a,b,res);
		break;
            case'%':
		System.out.println(a + " % " + b + " = " + (a % b));
                break;
        }
    }
}
