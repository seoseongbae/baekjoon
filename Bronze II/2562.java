import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] a = new int[9+1];
		
		for(int i=1;i<=9;i++)
		{
			a[i]=scanner.nextInt();
		}
		int max=a[0];
		int count=0;
		for(int i=1;i<=9;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				count=i;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}
