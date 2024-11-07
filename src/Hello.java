import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello bitches !!!");
		int number1 =5;
		double number2 = 15.5;
		double sum ;
		
		sum = number1 + number2;
		System.out.println(AddFifteen(sum));
		
		double extra;
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a number");
		extra = reader.nextDouble();
		sum+= extra;
		System.out.println("the new sum +" + extra + " = "+AddFifteen(sum));
		
	}

	
	
	public static double AddFifteen(double number) {
		double f = 15+ number;
		return f;
	}
	
	
}
