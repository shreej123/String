package abc;

import java.util.Scanner;

public class aa {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String ip=sc.next();
	int length=ip.length();
	int middle=(length/2);
	char ch =ip.charAt(middle);
	System.out.println("ch");
	
}
}
