boolean == 값이 들어가있음 true 없으면 false로 되어 값을 체크하는데 유용하다

import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		boolean[] arr=new boolean[101];
		int count=0;
		for(int i=1;i<=a;i++)
		{
				int b=sc.nextInt();
				if(arr[b]==true)
				{
					count++;
					
				}
				else {
					arr[b]=true;
				}
		}
		System.out.println(count);
	}
}

