class ThisKeyword{
    String user;
    int password;
    
    String user2;
    int password2;
    boolean choice;
        
        // constructor without this keyword
        ThisKeyword(String user, int password){
            user = user;
            password = password;    
        
        } 
        // duplicate constructors are differentiated by the number of parameters in the list and their types.
        // construcstor using this keyword
        ThisKeyword(String user2, int password2, boolean choice){
             this.user2 = user2;
             this.password2 = password2;
             this.choice = choice;
         }
         
        void showWithoutThis(){
            System.out.println("if we dont use this keyword : " + user + " - " + password);
        } 
        
        void showUsingThis(){
            System.out.println("if we are using this keyword : " + user2 + " - " + password2 + " - " + choice); 
            // you can to call a method into another method using this keyword
            this.showMethodWithThis();  
        }
        
        void showMethodWithThis(){
            System.out.println("calling method with this keyword");
        }
        
}
public class Main {
	public static void main(String[] args) {
		ThisKeyword t1 = new ThisKeyword("Gilberto",21);
		ThisKeyword t2 = new ThisKeyword("Gilberto Ferrari",21,true);
		
		t1.showWithoutThis();
		t2.showUsingThis();
		
	}
}
/* Output

if we dont use this keyword : null - 0
if we are using this keyword : Gilberto Ferrari - 21 - true
calling method with this keyword

[Program finished]
*/