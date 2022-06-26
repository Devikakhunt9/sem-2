interface Transport{
	void diliver();
}
abstract class Animal{
	public abstract void display();
}
class Tiger extends Animal{
	public void display(){
		System.out.println("Tiger Class");
	}
}
class Camel extends Animal implements Transport{
	public void diliver(){
		System.out.println("used for transporation");
	}
	public void display(){
		System.out.println("Class Camel");
	}
}
class Deer extends Animal{
	public void display(){
		System.out.println("Deer class");
	}
}
class Donkey extends Animal implements Transport{
	public void diliver(){
		System.out.println("used for transporation");
	}
	public void display(){
		System.out.println("Donkey class0");
	}
}
class Lab7_3{
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.display();

		Camel c = new Camel();
		c.diliver();
		c.display();

		Deer d = new Deer();
		d.display();

		Donkey dy = new Donkey();
		dy.diliver();
		dy.display();
	}
}