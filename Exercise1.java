import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an interger: ");
		int x = input.nextInt();
		int y = input.nextInt();

		if (x!= 0 && y!=0){
			System.out.println("The result is " + ((3+4*x)/5-(10*(y-5)/x)+9*(4/x+(9+x)/y)));
		}


	}
}