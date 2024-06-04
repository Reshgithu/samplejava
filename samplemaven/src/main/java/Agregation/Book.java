package Agregation;

public class Book {
	String title;
	int pageno;
	String color;
	Author ar;
	public Book(String title, int pageno, String color, Author ar) {
		this.title=title;
		this.pageno=pageno;
		this.color=color;
		this.ar=ar;
	}

	
	public void display() {
	System.out.println(title);
	System.out.println(pageno);
	System.out.println(color);
	System.out.println(ar.authorname);
	System.out.println(ar.age);
	System.out.println(ar.city);
	}

	
	
	public static void main(String[] args) {
		Author at= new Author("john", 76, "tvm") ;
		Book bk=new Book("rose", 32,"red",at);
		bk.display();


}
}