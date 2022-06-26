abstract class Vegetable{
	String color;
	public abstract String toString();
}
class Potato extends Vegetable{
	public Potato(){
		color = "skin";
	}
	public String toString(){
		return ("color of Potato:"+(color));
	}
}
class Brinjal extends Vegetable{
	public Brinjal(){
		color = "Brinjal";
	}
	public String toString(){
		return("color of Brinjal:"+(color));
	}
}
class Tomato extends Vegetable{
	public Tomato(){
		color = "Tomato";
	}
	public String toString(){
		return ("color of Tomato:"+(color));
	}
}
public class Lab7_1{
	public static void main(String[] args) {
		Potato p = new Potato();
		System.out.println(p.color);
		Brinjal b = new Brinjal();
		System.out.println(b.color);
		Tomato t = new Tomato();
		System.out.println(t.color);
	}
}