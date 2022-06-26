import java.util.Scanner;
public class Lab3_4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENetr no:");
		int no = input.nextInt();
		int i,m=0,flag=0;
		m = no/2;
		if(no==0 || no ==1){
			System.out.println("NOT PRIME");
		} 
		else  {
			for (i=2;i<=m;i++ ) {
				if (no%i==0) {
					System.out.println("NOT PRIME");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("PRIME");
			}
		}
	}
}