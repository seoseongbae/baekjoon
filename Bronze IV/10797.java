import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int[] arr=new int[5];
		int a=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==a)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
