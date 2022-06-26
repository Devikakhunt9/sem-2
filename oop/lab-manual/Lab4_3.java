import java.util.Scanner;
public class Lab4_3{
	public static void main(String[] args) {
		int rev;
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int a[] = new int[i];
		for (int j=0;j<i;j++)
		{
			a[j] = input.nextInt();
		}
		for (int k=i-1;k>=0;k--)
		{
			rev=a[k];
			System.out.println("Reverse of String:"+rev);
		}
		
	}
}