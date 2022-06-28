import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int k=a-i;k<a;k++)
			{
				System.out.print(" ");
			}
			for(int j=a;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
