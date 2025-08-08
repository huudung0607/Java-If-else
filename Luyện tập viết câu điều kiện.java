import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0) System.out.println("YES");
        else System.out.println("NO");
        if (n % 3 == 0 && n % 5 == 0) System.out.println("YES");
        else System.out.println("NO");
        if (n % 3 ==0 && n % 7 != 0) System.out.println("YES");
        else System.out.println("NO");
        if (n % 3 == 0 || n % 7 == 0) System.out.println("YES");
        else System.out.println("NO");
        if (n > 30 && n < 50) System.out.println("YES");
        else System.out.println("NO");
        if (n >= 30 && (n % 2 == 0 || n % 3 == 0 || n % 5 == 0)) System.out.println("YES");
        else System.out.println("NO");
        int last_num = n % 10;
	if (n >= 10 && n <= 99 && (last_num == 2 || last_num == 3 || last_num == 5 || last_num == 7)){
            System.out.println("YES");
        }
        else System.out.println("NO");
        if (n >= 23 && n < 100 && n % 23 == 0) System.out.println("YES");
        else System.out.println("NO");
        if (n < 10 || n > 20) System.out.println("YES");
        else System.out.println("NO");
        if (last_num % 3 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
