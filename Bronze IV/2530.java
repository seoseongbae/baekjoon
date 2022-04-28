import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int d = sc.nextInt();
        
        c += d;
        b += c/60;
        c %= 60;
        a += b/60;
        b %= 60;
        a %= 24;
        
        System.out.println(a + " " + b + " " + c);
	}
}
