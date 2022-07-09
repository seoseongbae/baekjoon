import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int p=0; p<n; p++) {
            for(int q=0; q<n-p-1; q++) {
                System.out.print(" ");
            }
            for(int q=0; q<=p; q++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int p=1; p<n; p++) {
            for(int q=0; q<p; q++) {
                System.out.print(" ");
            }
            for(int q=0; q<=n-p-1; q++) {
                System.out.print("*");
            }
            System.out.println("");
        }
	}
}
