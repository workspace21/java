class Parent{
    void showParent(){
        System.out.println("I'm from Parent class");    
    }   
}

class Child extends Parent{
    void showChild(){
        System.out.println("I'm from Child class");    
    }
}

public class Main {
	/*
	Parent Class/Super Class: Superclass is the class from where a subclass inherits the features. 
	    It is also called a base class or a parent class.
	Child Class/Sub Class: Subclass is a class which inherits the other class. 
	    It is also called a derived class, extended class, or child class.
	*/
	public static void main(String[] args) {
		// instance Child class
		Child child1 = new Child();
		child1.showParent(); // method from Parent class (Single Inheritance)
		child1.showChild(); // method from Child class
		
	}
}
/* Output

I'm from Parent class
I'm from Child class

[Program finished]
*/