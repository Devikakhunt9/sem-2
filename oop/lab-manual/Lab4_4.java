import java.util.Scanner;
public class Lab4_4{
	public static void main(String[] args) {
		String half;
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER STRING:");
		String a = input.nextLine();
		int l = a.length();
		System.out.println("LENGTH OF STRING:"+l);
		half = a.substring(l/2,l);
		System.out.println(half);
	}
}