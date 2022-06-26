//import java.util.Scanner;
class Complexno{
	int real1,imagnary1,real2,imagnary2;
	Complexno(int r1,int i1,int r2,int i2)
	{
		real1 =r1;
		imagnary1 = i1;
		real2 =r2;
		imagnary2 = i2;
	}
	Complexno(int r1){
		real1 = r1;
	}
	Complexno(int r1,int i1)
	{
		real1 =r1;
		imagnary1 = i1;
}
void add(){
		int sumofreal = real1 + real2;
		int sumofimg = imagnary1+imagnary2;
		System.out.println(sumofreal+"+"+sumofimg+"i");
	}
}
class Lab5_5{
	public static void main(String[] args) {
		Complexno exp1 = new Complexno(5,2,1,3);
		Complexno exp2 = new Complexno(5);
		Complexno exp3 = new Complexno(5,2);
		exp1.add();
		exp2.add();
		exp3.add();

	}
}