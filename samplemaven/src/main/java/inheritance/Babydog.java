package inheritance;

public class Babydog extends Dog {
	int limit=3;
	public void goal() {
		System.out.println(limit);
	}

	public static void main(String[] args) {
	Babydog bc=new Babydog();
	bc.jump();
	bc.color();
	bc.goal();


	}

}
