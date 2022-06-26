import java.util.Scanner;
public class Lab3_2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER STRING:");
		String n = input.nextLine();
		int l = n.length();
		String rev = "";
		for(int i = l-1;i>=0;i--)
		{
			rev = rev + n.charAt(i);
		}
		System.out.println(rev);

		if (n.equals(rev))
		 {
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}