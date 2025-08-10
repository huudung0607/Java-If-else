import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nam = n / 365;
        int tuan = (n % 365) / 7;
        int ngay = (n % 365) % 7;
        System.out.print(nam + " " + tuan + " " + ngay);
    }
}
