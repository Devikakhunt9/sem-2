class A{
	int a =10;
	public void printA(){
		System.out.println("a(A) :"+a);
		System.out.println("this.a:(A):"+this.a);
	}
}
class B extends A{
	int a = 20;
	public void printB(){
		System.out.println("a(B):"+a);
		System.out.println("this.a(B):"+this.a);
		System.out.println("super.a(B):"+super.a);
	}
}
public class Lab6_6{
	public static void main(String[] args) {
		A aobj = new B();
		aobj.printA();
		//aobj.printB();
	}
}