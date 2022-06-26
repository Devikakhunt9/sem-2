import java.util.Scanner;
public class Lab4_6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENter string:");
		String name = input.nextLine();
		int l = name.length();
		System.out.println(l);
		for(int i=0;i<l;i++)
		{		
			for(int k=1;k<=l-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++)
			{
				System.out.print(" "+name.charAt(j));
			}
				System.out.println();
			
		}	
	}
}
/*
     d
    de
   dev
   devi
  devik
 devika
*/