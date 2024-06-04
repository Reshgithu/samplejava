package inheritance;

public class Tester extends Employee{
	int yesskill=8;
	public void myskill() {
		System.out.println("share");
	}

	public static void main(String[] args) {
		Tester ts=new Tester();
		ts.myskill();
		ts.talent();
		
		Developer dc=new Developer();
		dc.noskill();
		dc.talent();
		
	}
	

}
