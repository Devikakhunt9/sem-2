/*public class Lab2_1{
	public static void main(String[] args) {
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float c = a + b;
		System.out.println(c);
	}
}*/



import java.util.Scanner;
public class Lab2_1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("a b");
		int a = input.nextInt();
		int b = input.nextInt();
		int ans = a + b;
		System.out.println(ans);
	}
}