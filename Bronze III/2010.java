import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			int num = sc.nextInt();
			sum+=num;
		}
		System.out.println(sum-(cnt-1));
		
	}
}
