import java.util.Scanner;
public class Lab4_1{
	public static void main(String[] args) {
		int vowel=0;
		int con=0;
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		int l = s1.length();
		String s2 = s1.toLowerCase();
		for ( int i=0;i<l;i++ ) {

			char ch = s2.charAt(i);
			if (ch =='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u') {
				vowel++;	
			}
			else{
				con++;
			}
		}
			System.out.println("TOTAL VOWEL :" +vowel);

			System.out.println("TOTAL CONSONANT:"+con);
	}
}