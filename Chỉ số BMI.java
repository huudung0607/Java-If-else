
import java.util.*;
import java.lang.*;
import java.io.*;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double w  = sc.nextDouble(), h = sc.nextDouble();
        double height = h / 100;
        double bmi = w / (height * height);
        if (bmi < 18.5)
	{
		System.out.println("Under weight");
	}
	else if (bmi >= 18.5 && bmi < 25)
	{
		System.out.println("Normal");
	}
	else if (bmi >= 25 && bmi < 30)
	{
		System.out.println("Over weight");
	}
	else if (bmi >= 30 && bmi < 35)
	{
		System.out.println("Obesity 1");
	}
	else if (bmi >= 35 && bmi < 40)
	{
		System.out.println("Obesity 2");
	}
	else if (bmi >= 40)
	{
		System.out.println("Extreme obesity");
	}
    }
}
