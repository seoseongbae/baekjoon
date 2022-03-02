import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr=new int[9];
		int sum=0;
		int spyA = 0, spyB = 0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		
		
		for(int a = 0; a < arr.length-1; a++) {
			for(int b = a+1; b < arr.length; b++) {
				if(sum - arr[a] - arr[b] == 100) {
					spyA = a;
					spyB = b;
					break;
				}
			}
		}
		for(int j = 0; j < arr.length; j++) {
			if(j == spyA || j == spyB)
				continue;
			System.out.println(arr[j]);
		}
	}
}

