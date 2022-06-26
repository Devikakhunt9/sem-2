import java.util.Scanner;
public class Lab3_3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("a,b,c");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if (a>c) {
			if (a>b) {
				System.out.println(a);
			}
			else
			{
				System.out.println(b);
			}
		}
		else{
			if (c>a) {
				if (c>b) {
					System.out.println(c);	
				}
			}
			else{
				System.out.println(b);	
			}
		}
	}
}