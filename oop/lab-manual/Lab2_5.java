import java.util.Scanner;
public class Lab2_5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("temprature(fahernhit)");
		double f = input.nextDouble();
		double c = (f-32)*(5/9);
		System.out.println("temprature(Celcius)"+c);
	}
}