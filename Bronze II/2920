import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[8];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		String a="";
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1]-1)
			{
				a="ascending";
			}
			else if(arr[i]==arr[i+1]+1)
			{
				a="descending";
			}
			else {
				a="mixed";
				break;
			}
		}
		System.out.println(a);
	}
}
