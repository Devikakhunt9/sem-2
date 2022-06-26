import java.util.Scanner;
class CountVowel{
	public void countVowel(){
	int count = 0;
	String sentence = "";
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Enetr String:");
			 sentence = input.nextLine();
			 for (int i =0;i<sentence.length();i++ ) {
			 	if(sentence.charAt(i)=='a'|| sentence.charAt(i)=='e'|| sentence.charAt(i)=='o'|| sentence.charAt(i)=='u'|| sentence.charAt(i)=='i'){
			 		count++;
			 	}
			 }
		}while(!sentence.equals("quit"));
		count-=2;
		System.out.println("Total Vowels:"+count);
	}
}
public class Lab5_3{
	public static void main(String[] args) {
		CountVowel cv = new CountVowel();
		cv.countVowel();
	}
}