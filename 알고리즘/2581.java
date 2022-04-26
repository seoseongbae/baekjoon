import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static boolean prime[];
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int m=sc.nextInt();
		int n=sc.nextInt();
		
		prime=new boolean[n+1];
		get_prime();
		
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=m;i<=n;i++)
		{
			if(prime[i]==false)
			{
				sum+=i;
				if(min==Integer.MAX_VALUE) {
					min=i;
				}
			}
		}
		if(sum == 0) {	// 소수가 없다면 
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
	public static void get_prime() {
		prime[0]=true;
		prime[1]=true;
		
		for(int i=2;i<Math.sqrt(prime.length);i++)
		{
			for(int j=i*i;j<prime.length;j+=i)
			{
				prime[j]=true;
			}
		}
	}
}
