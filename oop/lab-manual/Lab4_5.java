import java.util.Scanner;
public class Lab4_5{
	public static void main(String[] args) {
		//System.out.println(args[0]);
		String name = args[0];
		//System.out.println(name);
		char a[] = new char[name.length()];
		for ( int i=0;i<name.length() ;i++ ) {
			a[i]=name.charAt(i);
		}
				
				if (a[0]>60&&a[0]<90) {
					System.out.println(name);

				}
				else
				{
					System.out.println("ERROR");
				}
}


}