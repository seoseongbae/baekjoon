import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int star = sc.nextInt();

	     // 첫번째 for문
	    for(int i = 1 ; i <= star; i++) {
	      //공백찍기
	      for(int j = 1; j < i; j++) {
	        System.out.print(" ");
	      }
	      //별찍기
	      for(int k = (2*star)-(i*2-1); k > 0; k--) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
		
		
	}
}
