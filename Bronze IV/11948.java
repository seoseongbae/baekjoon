import java.util.*;



import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		int sum=0;
		
		for(int i=0;i<6;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr,0,4);
		Arrays.sort(arr,4,6);
		for(int i=1;i<4;i++)
		{
		sum+=arr[i];
		}
		sum+=Math.max(arr[4],arr[5]);
		System.out.println(sum);
	}
}
