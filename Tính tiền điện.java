
import java.util.*;
import java.lang.*;
import java.io.*;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tienDien = 0, tienPhuTroi = 0;
        if (n >= 1000)
	{
		tienDien = 4500;
		tienPhuTroi = 1200000;
	}
	else if (n >= 800 && n < 1000)
	{
		tienDien = 3900;
		tienPhuTroi = 900000;
	}
	else if (n >= 500 && n < 800)
	{
		tienDien = 3700;
		tienPhuTroi = 800000;
	}
	else if (n < 500)
	{
		tienDien = 3300;
		tienPhuTroi = 0;
	}
        long tong = 1L * tienDien * n + tienPhuTroi;
        System.out.println(tong);
    }
}
