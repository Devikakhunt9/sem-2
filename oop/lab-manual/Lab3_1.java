import java.util.Scanner;
public class Lab3_1{
	public static void main(String[] args) {
		int marks,per;
		int sum = 0 ;
		int a[] = new int[5];
		Scanner input = new Scanner(System.in);
		for (int i =0 ;i<5;i++ ) {
			System.out.println("ENTER marks:");
			 a[i] = input.nextInt();
			 sum = sum + a[i];
		}
		per = sum/5;
		System.out.println("PERCENTAGE:"+per);
		if (per>100) {
			System.out.println("Please check your marks.\nEnter valid marks ");
		}
		else if (per>=60&&per<=100) {
					System.out.println("FIRST DIVISION");
				}qqq		        per>=40) {
			System.out.println("THIRD DIVISION");
		}
		else{
			System.out.println("FAIL");
		}
}
	}   