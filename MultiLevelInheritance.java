class Parent{
    void showParent(){
        System.out.println("I'm from Parent class"); 
    }      
    void display(){
        System.out.println("method with the same name in differents classes (from Parent)");    
    }   
}

class ChildA extends Parent{
    void showChildA(){
        System.out.println("I'm from ChildA class");    
    }     
    void display(){
        System.out.println("method with the same name in differents classes (from ChildA)");    
    }       
}

class ChildB extends ChildA{
    void showChildB(){
        System.out.println("I'm from ChildB class");    
    }
         
}

public class Main {
/*
*  Multilevel Inheritance
* Java doesn't directly support multiple inheritance for classes
* When a child class inherits methods with the same name from multiple parent classes, 
* Java uses method resolution order (MRO)
* MRO defines the order in which the compiler searches for methods in the class hierarchy. 
* It starts with the child class
*/
	public static void main(String[] args) {
		// Instance ChildB
		ChildB childB = new ChildB();
		
		childB.showParent(); // method from Parent class
		childB.showChildA(); // method from ChildA class
		childB.showChildB(); // method from ChildB class
		
		// Now which display() method would be invoked? 
		childB.display();
		
	}
}
/* Output

I'm from Parent class
I'm from ChildA class
I'm from ChildB class
method with the same name in differents classes (from ChildA)

[Program finished]

*/