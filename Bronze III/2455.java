import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int max = 0;
		int now = 0;
		for(int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			int bye = Integer.valueOf(st.nextToken());
			int hello = Integer.valueOf(st.nextToken());
			
			now = now - bye + hello;
			max = Math.max(max, now);
		}
		System.out.println(max);
	}
}
