class Parent{
    void showParent(){
        System.out.println("I'm from Parent class"); 
    }      
    void display(){
        System.out.println("method with the same name in classes differents (from Parent)");    
    }   
}

class ChildA extends Parent{
    void showChildA(){
        System.out.println("I'm from ChildA class");    
    }     
    void display(){
        System.out.println("method with the same name in classes differents (from ChildA)");    
    }       
}

class ChildB extends ChildA{
    void showChildB(){
        System.out.println("I'm from ChildB class");    
    }
         
}

public class Main {
	/*
	    Multilevel inheritance
	*/
	public static void main(String[] args) {
		// instance ChildB
		ChildB childB = new ChildB();
		
		childB.showParent(); // method from Parent class
		childB.showChildA(); // method from ChildA class
		childB.showChildB(); // method from ChildB class
		
		// now which display() method would be invoked? 
		childB.display();
		
	}
}
/* Output

I'm from Parent class
I'm from ChildA class
I'm from ChildB class
method with the same name in classes differents (from ChildA)

[Program finished]

*/