class Counter{
// variable without static keyword
int count1 = 0;
// variable static
static int count2 = 0;
// constructor
    Counter(){
         count1++;
         count2++;
         System.out.println("count1 : " + count1 + " count2 : " + count2);   
     }
// static block
    static{
        // non-static variable (count1) cannot be referenced from a static context
        count2++; // static variable can be referenced from a static context
        System.out.println("static blocks perform initialization tasks");    
    }
}
public class Main {
	public static void main(String[] args) {
		new Counter();
		new Counter();
		new Counter();
	}
}