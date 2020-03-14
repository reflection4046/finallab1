package lab7;

public class Book {
	public void printname() {
		System.out.println("this is normal book");
		
	}
 public void issuebook(int n) {
	 System.out.println("issue book id:"+n);
 }
 public void returnbook(int n) {
	 System.out.println("return book id:"+n);
	 
 }
}
 class courseBook extends Book{
	 //overriding
	 public void printName() {
		 System.out.println("this is course book");
		 
	 }
	 //overriding
	 public void issueBook(int n) {
		 System.out.println("issue book id:"+n);
	 }
	 //overloading
	 public void issueBook() {
		 System.out.println("issue book without id:");
	 }
	 //overloading
	 public void returnBook(int n, int m) {
		 System.out.println("return Book ID1:"+n+ "Return B00k ID2:" +m);
		 
	 }
 }