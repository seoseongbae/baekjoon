import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int n = a * b * c;
		int[] arr = new int[10];
		while(n>0)
		{
			arr[n%10]++;
			n/=10;
		}
		for(int i=0;i<arr.length;++i)
		{
			System.out.println(arr[i]);
		}
	}
}
