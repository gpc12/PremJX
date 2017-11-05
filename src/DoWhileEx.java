import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a number:");
		int value=scr.nextInt();
		while(value!=5) {
			System.out.println("enter a number:");
			value=scr.nextInt();
		}
		System.out.println("Got 5");
		scr.close();

	}

}
