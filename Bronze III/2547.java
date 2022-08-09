import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			BigInteger sum = new BigInteger("0");

			for (int j = 0; j < n; j++) {
				sum = sum.add(scanner.nextBigInteger());
			}

			String reminder = String.valueOf(sum.remainder(BigInteger.valueOf(n)));
			if (reminder.equals("0"))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
