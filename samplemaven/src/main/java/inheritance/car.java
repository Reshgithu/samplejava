package inheritance;

public class car extends vehicle{
	int size=4;
	public void color() {
		System.out.println("type");
		
	}

	public static void main(String[] args) {
		car c1=new car();
		c1.speed();
		c1.color();
		System.out.println(c1.weight);
		System.out.println(c1.size);
		

	}

}
