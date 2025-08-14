
import java.util.*;
import java.lang.*;
import java.io.*;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        Vector<Integer> v = new Vector<>();      
        v.add(a);
        v.add(b);
        v.add(c);
        Collections.sort(v);
        for(int x : v){
            System.out.print(x + " ");
        }
    }
}
