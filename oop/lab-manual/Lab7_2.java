interface A{
	int a =1;
	void printA1();
}
interface A1 extends A{
	int b = 2;
	void printA1();
}
interface A2 extends A{
	int c = 3;
	void printA2();
}
interface A12 extends A1,A2{
	int d = 4;
	void printA12();
}
class B implements A12{
	public void printA1(){
		System.out.println(b);
	}
	public void printA2(){
		System.out.println(c);
	}
	public void printA(){
		System.out.println(a);
	}
	public void printA12(){
		System.out.println(d);
	}
	public void printB(){
		System.out.println("print B");
	}
}
class Lab7_2{
	public static void main(String[] args){
		B bObj = new B();
		bObj.printA();
		bObj.printA1();
		bObj.printA2();
		bObj.printA12();
	}
}