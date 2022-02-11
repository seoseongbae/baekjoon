import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=3;
		
		BigInteger zero = new BigInteger("0");
		for(int i=0;i<a;i++)
		{
			int b=sc.nextInt();
			BigInteger sum=zero;
			for(int j=0;j<b;j++)
			{
				BigInteger c=sc.nextBigInteger();
				sum=sum.add(c);
			}
			if(sum.compareTo(zero)==0)
			{
				System.out.println(0);
			}
			else if(sum.compareTo(zero)==1)
			{
				System.out.println("+");
			}
			else if(sum.compareTo(zero)==-1)
			{
				System.out.println("-");
			}
		}
	}
}
