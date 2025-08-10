
package javaapplication1;

import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), n = sc.nextInt();
        if (t > 0 && t < 13 && n > 0)
	{
		if (t == 1 || t == 3 || t == 5 || t == 7 || t == 8 || t == 10 || t == 12)
		{
			System.out.println("31");
		}
		else if (t == 4 || t == 6 || t == 9 || t == 11)
		{
			System.out.println("30");
		}
		else
		{
			if (t == 2 && (n % 400 == 0) || (n % 4 == 0 && n % 100 != 0))
			{
				System.out.println("29");
			}
			else if (t == 2 && (n % 400 != 0) || (n % 4 != 0 && n % 100 == 0))
			{
				System.out.println("28");
			}
		}
	}
	else
	{
		System.out.println("INVALID");
	}
    }
}
