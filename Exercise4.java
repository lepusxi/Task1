import java.util.Scanner;

public class Exercise4{
	public static void main(String[] args){
		Scanner input = new Scanner(System. in);
		System.out.println("Enter desired grade");
		String grade =  input.next(); 
		System.out.println("Enter minimum average required");
		float min =  input.nextFloat();
		System.out.println("Enter current average in course");
		float current =  input.nextFloat();
		System.out.println("Enter how much the final count as a percentage of the course grade");
		float  fi =  input.nextFloat();

		float result = (min - (current * (1- fi/100))) / (fi/100);
		System.out.println("You need a score of " + result + " on the final to get " + grade + " ." );
	}
}
