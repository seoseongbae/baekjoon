import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		long a=sc.nextInt();
		long b=sc.nextInt();
		long sum=0;
		sum=(a+b)*(a-b);
		System.out.println(sum);
	}
}
