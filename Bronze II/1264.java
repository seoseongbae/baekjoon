import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			String a=sc.nextLine();
			int count=0;
			
			if(a.equals("#"))
			{
				break;
			}
			a=a.toLowerCase();
			
			for(int i=0;i<a.length();i++)
			{
				switch(a.charAt(i))
				{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
				default:
					break;
				}
			}
			System.out.println(count);
		}
	}
}

