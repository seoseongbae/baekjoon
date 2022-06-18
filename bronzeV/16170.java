import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.MONTH)+1);
		System.out.println(cal.get(cal.DATE));
	}
}
