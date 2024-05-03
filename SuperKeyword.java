/*
* In Java, super keyword is used to refer to immediate parent class of a class. 
* In other words, super keyword is used by a subclass whenever it need to refer to its immediate super class.
*/
class Parent{
	String name;	
}
class Child extends Parent{
	String name;
	
		void showDetails(){
			// refers to Parent class
			super.name = "Parent";
			name = "Child";
			System.out.println(super.name + " - " + name);	
		}	
}
public class Main {
	public static void main(String[] args) {
		Child child = new Child();
		child.showDetails();
	}
}
/* Output
*
* Parent - Child
*
*[Program finished]
*/