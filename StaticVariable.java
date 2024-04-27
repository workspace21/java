// class without static variable
class CounterOne{
     int count = 0;
     // constructor
      CounterOne(){
         count++;
         System.out.println(count); 
      }
 }
 // class using static variable and static block
 class CounterTwo{
     // static variable
     static int count = 0;
     // constructor
      CounterTwo(){
         count++;
         System.out.println(count); 
      }
      // static block
      static{
          System.out.println("this is a static block invoked ");    
      }
 }

public class Main {
	public static void main(String[] args) {
		// instance of class without static variable
		CounterOne c1 = new CounterOne();
		CounterOne c2 = new CounterOne();
		CounterOne c3 = new CounterOne();
		
		System.out.println();
		
		// instance of class using static variable
        CounterTwo c4 = new CounterTwo();
        CounterTwo c5 = new CounterTwo();
        CounterTwo c6 = new CounterTwo();		
	}
}

/* Output
1
1
1

this is a static block invoked
1
2
3

[Program finished]
*/