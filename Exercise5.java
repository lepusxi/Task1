import java.util.Scanner;

public class Exercise5{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an interger: ");
		int x = input.nextInt();
		System.out.println("Enter an interger: ");
		int y = input.nextInt();

		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x*y);
		System.out.println(x%y);
	}
}