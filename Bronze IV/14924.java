import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt(), t = sc.nextInt(), d = sc.nextInt();
        System.out.println(d/(2*s)*t);
	}
}
