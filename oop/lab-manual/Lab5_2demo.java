import java.util.Scanner;
class Time{
	int hour1,minute1;
	Time(int hour1,int minute1){
		this.hour1 = hour1;
		this.minute1 = minute1;
		
	}
	
	void add(Time t){
		minute1 = minute1+ t.minute1;
		if(minute1>=60){
			hour1++;
			minute1-=60;
		}
	hour1 = hour1+t.hour1;
	
	}
}
class Labhour1_2demo{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hour1 = input.nextInt();
		int minute1 = input.nextInt();
		int hour2 = input.nextInt();
		int minute2 = input.nextInt();
		Time t1 = new Time(hour1,minute1);
		Time t2 = new Time(hour2,minute2);
		t1.add(t2);
		System.out.println(hour1+":"+minute1);
		

	}
}