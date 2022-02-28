import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] t=new String[41];
		int[] a=new int[21];
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s=sc.next();
		t=s.split(",");
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(t[i]);
		}
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				a[j]=a[j+1]-a[j];
			}
		}
		for(int i=0;i<n-k;i++)
		{
			System.out.print(a[i]);
			if(i!=n-k-1)
			{
				System.out.print(",");
			}
		}
		
	}
}
