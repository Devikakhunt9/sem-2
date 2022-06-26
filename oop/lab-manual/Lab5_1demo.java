import java.util.Scanner;
class Lab5_1{
	public void areaofcircle(double r){
		double ans = 3.14*r*r;
		System.out.println("AREA OF CIRCLE:"+ans);
	}
}
class Lab5_1demo{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER R:");
		double r = input.nextDouble();
		Lab5_1 sc = new Lab5_1();
		sc.areaofcircle(r);
	}

}