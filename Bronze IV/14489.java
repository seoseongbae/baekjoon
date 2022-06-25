import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ch=sc.nextInt();
		int sum=a+b;
		if(sum>=ch*2)
		{
			System.out.println(sum-ch*2);
		}
		else {
			System.out.println(sum);
		}
		
	}
}
