package lab7;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		courseBook cb=new courseBook();
      cb.issueBook(12);
      cb.printName();
      System.out.println("-------");
       
      
      Book b= new Book();
      b.printname();
      b.issuebook(10);
      System.out.println("-------");
      
      Book b1 = new courseBook ();
	  b1.printname ();
	
	}

}
