import java.util.Scanner;

public class Exercise3{
	public static void main(String[] args){
		Scanner input = new Scanner(System. in);
		System.out.println("Enter the amount you need to covert");
		float amount = input.nextFloat();
		System.out.println("Enter either 1 or 2");
		int check = input.nextInt();

		if (check == 1){
			double euro=amount*0.9;
		 System.out.println("You entered " + amount + " in Dollars and they are equal to " + euro + " Euros.");
		}
			

		if (check == 2){
			double dollar=amount/0.9;
		 System.out.println("You entered " + amount + " in Euros and they are equal to " + dollar + " Dollars.");
		}

	}
}