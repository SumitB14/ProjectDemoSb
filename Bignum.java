import java.util.Scanner;


public class Bignum{
	public static void main(String[]args) {
		Scanner Scr= new Scanner(System.in);
		int b1=Scr.nextInt();
		int b2=Scr.nextInt();
		int b3=Scr.nextInt();
		int b4=Scr.nextInt();
		int b5=(b1>b2 && b1>b3 && b1>b4) ? b1:((b2>b3 && b2>b4) ? b2:(b3>b4 ? b3:b4));
		System.out.print(b5);
	}
}
