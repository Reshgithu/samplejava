package inheritance;

public class Forest {

	public Forest extends Diversity{
		int area=9;
		public void number() {
			System.out.println("type");
		}
			public static void main(String args[]) {
				Forest f1=new Forest();
				f1.animals();
				f1.number();
				System.out.println("species");
				System.out.println("area");
				
			
		}

	}


