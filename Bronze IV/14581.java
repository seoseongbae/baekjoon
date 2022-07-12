import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		 final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        String k = ":fan::fan::fan:\n" +
	                ":fan::kkkkkreplkkkkk::fan:\n" +
	                ":fan::fan::fan:";

	        k = k.replaceFirst("kkkkkreplkkkkk", br.readLine());

	        System.out.println(k);
	        br.close();
	}
}
