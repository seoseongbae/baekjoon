import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int S = Integer.parseInt(st.nextToken());
	        int K = Integer.parseInt(st.nextToken());
	        int H = Integer.parseInt(st.nextToken());

	        int sum = S + K + H;
	        if(sum >= 100){
	            bw.write("OK\n");
	        } else {
	            int min = Math.min(S , K);
	            min = Math.min (min, H);
	            if(min == S) bw.write("Soongsil\n");
	            else if(min == K ) bw.write("Korea\n");
	            else if(min == H) bw.write("Hanyang\n");
	        }

	        bw.flush();
	        br.close();
	        bw.close();
	}
}
