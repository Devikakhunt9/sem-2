class Member{
	String name;
	int age;
	String moNo;
	String addrress;
	String salary;
	void printSalary()
	{
		System.out.println(salary);
	}
}
class Employee extends Member
{	
	String specialization;
	Employee(String name,int age, String moNo,String addrress,String salary,String specialization)
	{
	System.out.println(name+" "+age+" "+moNo+" "+addrress+" "+salary+" "+specialization);
	}
}
class Manager extends Member
{
	String department;
	Manager(String name,int age,String moNo,String addrress,String salary,String department)
	{
		System.out.println(name+" "+age+" "+moNo+" "+addrress+" "+salary+" "+department);
	}
}
class Lab6_3
{
	public static void main(String[] args)
	{
		Employee e = new Employee("Rakesh",28,"1234567890","abc","10000","java");
		Manager m = new Manager("Manoj",32,"9876543210","xyz","120000","computer");
	}
}