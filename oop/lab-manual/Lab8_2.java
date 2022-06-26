class Number extends Exception{
	String typeOfNumber;
	int n;
	Number(String number,int a){
		typeOfNumber = number;
		n = a;
	}
	String display(){
		return typeOfNumber;
	}
}
public class Lab8_2{
	public static void main(String[] args) {
		int  sum = 0;
		for(int i = 0;i<args.length;i++){
			int flag = 0;
			String typeOfNumber = "";
			try{
				int n = Integer.parseInt(args[i]);
				if(n<0){
					typeOfNumber += args[i]+" is nagative";
					flag = 1;
				}
				if(n%10 == 0){
					typeOfNumber += args[i]+" is divisible by 10";
					flag = 1;
				}
				if(n>1000 && n<2000){
					typeOfNumber += args[i]+" is less then 1000 or graterthan 2000";
					flag = 1;
				}
				if(n>7000){
					typeOfNumber += args[i]+" is graterthan 7000";
					flag = 1;
				}
				if(flag ==1){
					throw new Number(typeOfNumber,n);
				}
				else{
					sum +=n;
				}
			}
			catch(Number e){
				System.out.println(e.display());
			}
		}
		System.out.println("sum = "+sum);
	}
}