public class Lab8_1{
	public static void main(String[] args) {
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("ANS:"+(x*y));
		}
		catch(Exception e){
			System.out.println(e.printStackTrace());
			System.out.println("Some error occured");
		}
		System.out.println("HI");
	}
}