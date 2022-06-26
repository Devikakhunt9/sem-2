import java.util.Scanner;
public class Lab4_2{
	public static void main(String[] args) {
		int sum =0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter digit");
		int a[]= new int[4];
		for ( int i=0;i<4;i++ ) {
			System.out.println("ENTER NO:");
			a[i]=input.nextInt();
			sum = sum+a[i];
		}
		int avg = sum/4;
		System.out.println("AVRAGE :"+avg);
	}
}