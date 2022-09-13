import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		//연산에 따라 출력한다.
		if(A + B == C) {
			System.out.println(A + "+" + B + "=" + C);
		}else if(A - B == C) {
			System.out.println(A + "-" + B + "=" + C);
		}else if(A * B == C) {
			System.out.println(A + "*" + B + "=" + C);
		}else if(A / B == C) {
			System.out.println(A + "/" + B + "=" + C);
		}else if(A == B + C) {
			System.out.println(A + "=" + B + "+" + C);
		}else if(A == B - C) {
			System.out.println(A + "=" + B + "-" + C);
		}else if(A == B * C) {
			System.out.println(A + "=" + B + "*" + C);
		}else if(A == B / C) {
			System.out.println(A + "=" + B + "/" + C);
		}
	}
}
