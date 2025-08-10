
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble();
        double diem = (1.0 * a + b + c * 2 + d * 3)/7;
	if (diem >= 8.0)
	{
		System.out.println("GIOI");
	}
	else if (diem < 8.0 && diem >= 6.5)
	{
		System.out.println("KHA");
	}
	else if (diem < 6.5 && diem >= 5.0)
	{
		System.out.println("TRUNG BINH");
	}
	else
	{
		System.out.println("YEU");
	}
    }
}
