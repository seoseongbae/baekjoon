import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int p=sc.nextInt();
		
		int x=p*a;
		int y=0;
		
		if(p<=c)
		{
			y=b;
		}
		else {
			y=b+(p-c)*d;
		}
		if(x>y) {
			System.out.println(y);
		}
		else {
			System.out.println(x);
		}
		
				
	}
}
