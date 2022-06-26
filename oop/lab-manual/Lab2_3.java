import java.util.Scanner;
public class Lab2_3{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("a b");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("ur choice");
		System.out.println("1.add (+)");
		System.out.println("2. sub(-)");
		System.out.println("3. mul(*)");
		System.out.println("4. div(/)");
		System.out.println("5.Modulo(%)");
		char op = input.next().charAt(0);
		switch(op)
		{
			case '+' :
			int ans = a+b;
			System.out.println("ANS :"+ans);
			break;
			case '-':
			 ans = a-b;
			System.out.println("ANS :"+ans);
			break;
			case '/':
			 ans = a/b;
			System.out.println("ANS :"+ans);
			break;
			case '*':
			 ans = a*b;
			System.out.println("ANS :"+ans);
			break;
			case '%':
			 ans =a%b;
			System.out.println("ANS :"+ans);
			default :
			System.out.println("please enter valid oprator");

		}


	}
}