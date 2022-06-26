interface EventListener{
	void performEvent();
}
interface MouseListner extends EventListener{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
	void mouseMoved();
	void mouseDragged();
}
interface KeyListner extends EventListener{
	void keyPressed();
	void keyReleased();
}
class EventDemo implements MouseListner,KeyListner{
	public void performEvent(){
		System.out.println("performEvent");
	}
	public void mouseClicked(){
		System.out.println("mouseClicked");
	}
	public void mousePressed(){
		System.out.println("keyPressed");
	}
	public void mouseReleased(){
		System.out.println("mouseReleased");
	}
	public void mouseMoved(){
		System.out.println("mouseMoved");
	}
	public void mouseDragged(){
		System.out.println("mouseDragged");
	}
	public void keyPressed(){
		System.out.println("keyPressed");
	}
	public void keyReleased(){
		System.out.println("keyReleased");
	}
}
class Lab7_4{
	public static void main(String[] args) {
		EventDemo e = new EventDemo();
		e.mouseClicked();
		e.mousePressed();
		e.mouseReleased();
		e.mouseMoved();
		e.mouseDragged();
		e.keyPressed();
		e.keyReleased();
	}
}