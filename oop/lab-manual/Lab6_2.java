class Book{
	String authorName ="abc";
}
class Book_publication extends Book{
	String title = "def";
	public void print(){
		System.out.println(title);
	}
}
class Paper_publication extends Book{
	String title = "ghi";
	public void print(){
		System.out.println(title);
	}
}
public class Lab6_2{
	public static void main(String[] args){
		Book_publication b1 = new Book_publication();
		b1.print();
		Paper_publication b2 = new Paper_publication();
		b2.print();
	}
}