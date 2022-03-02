import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int m=sc.nextInt();
		int l=sc.nextInt();
		int[] arr=new int[n+1];
		int count=0;
		
			arr[1]=1;
			int index=1;
			while(true)
			{
				if(arr[index]==m)
				{
					break;
				}
				if(arr[index]%2==1) index=index+l;
				else index=index-l;
				if(index>n)index %=n;
				else if(index<1)index+=n;
				arr[index]++;
				count++;
			}
			
		System.out.println(count);
	}
}

