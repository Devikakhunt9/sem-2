class MyPoint
{
	double x,y;
	 public MyPoint()
	{
		x = 0;
		y = 0;
	}
	public MyPoint(double x,double y){
		this.x = x;
		this.y = y;
	}
	public double distance(MyPoint mp){
		double ans = Math.sqrt(Math.pow(mp.x - this.x,2)+Math.pow(mp.y - this.y,2));
		return ans;
	}
	public double distance(double x,double y){
	return Math.sqrt(Math.pow(x - this.x,2)+Math.pow(y - this.y,2));	
	}
}
public class Lab6_4{
	public static void main(String[] args){
		MyPoint mp1 = new MyPoint();
		MyPoint mp2 = new MyPoint(1,1);
		System.out.println(mp1.distance(mp2));
		ThreeDPoint th1 = new ThreeDPoint();
		ThreeDPoint th2 = new ThreeDPoint(10,30,25.5);
		System.out.println(th1.distance(th2));
	}
}
class ThreeDPoint extends MyPoint{
	double z;
	public ThreeDPoint(){
		x = 0;
		y = 0; 
		z = 0;
	}
	public ThreeDPoint(double x,double y,double z){
		this.x = x;
		this.y =y;
		this.z =z;
	}
	public double distance(ThreeDPoint th){
		double ans = Math.sqrt(Math.pow(th.x - this.x,2)+Math.pow(th.y - this.y,2)+Math.pow(th.y - this.y,2));
		return ans;
	}
}