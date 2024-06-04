package Agregation;

public class Student {
	String name;
	int age;
	Address adv;
	public Student(String name, int age, Address adv) {
		this.name=name;
		this.age=age;
		this.adv=adv;
	}

	public static void main(String[] args) {
		Address  s1=new Address ("aswathy",74,"tvm",69552);
		Student v1=new Student("Reshma",5,s1);
		v1.display();

	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(adv.housename);
		System.out.println(adv.houseno);
		System.out.println(adv.streetname);
		System.out.println(adv.pincode);
	
		
		
	}

}
