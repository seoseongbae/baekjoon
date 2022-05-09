import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
		int a =Integer.parseInt(br.readLine());
		int b=0,c=0;
		for(int i=0;i<a;i++)
		{
			 st = new StringTokenizer(br.readLine(), " ");
			b=Integer.parseInt(st.nextToken());
			c=Integer.parseInt(st.nextToken());
			bw.write(b+c + "\n");
		}
		 bw.flush();
         bw.close();
         br.close();
	}
}
