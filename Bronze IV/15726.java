import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());
		
		if(((A * B) / C) > ((A / B) * C)) {
			System.out.println((int) ((A * B) / C));
		}else {
			System.out.println((int) ((A / B) * C));
		}
		}
}
