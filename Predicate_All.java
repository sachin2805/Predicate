package predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class  Predicate_All {

	public static void main(String[] args) {
	Integer i=100;
	
	//Using Lambda Expression :

	
	IntPredicate i1=(int t)->{
			
			if(t<10)
				return true;
			return false;
	};
	// More Simple lambda expression
	
	IntPredicate i2=(t)->(t>20);
	IntPredicate i3=(t)->(t<60);
	System.out.println("Using test() method in IntPredicate :");
	System.out.println(i1.test(i));
	
	System.out.println(i2.test(50));
	
	System.out.println("------------------------------------------------");
	
	System.out.println("Using and in IntPredicate :");
	System.out.println(i2.and(i3).test(25)); // in that check if both condition are true then and then print True otherwise false
	
	
	System.out.println("------------------------------------------------");
	
    Predicate<String> lp =(str)->str.length() > 10;
    System.out.println("For String length Checking condition Using Predicate :");
    System.out.println(lp.test("SACHINPOWAR"));  // just check o/p using test() method
    
	System.out.println("------------------------------------------------");
	
    System.out.println("Using 'or' compare length of String : ");
	 Predicate<String> p = s -> s.contains("Sachin"); 
     System.out.println(lp.or(p).test("Sachin"));  //Using or  (if both condition is false then and then only print false otherwise true)
	
     System.out.println("------------------------------------------------");
     System.out.println("Using 'and' compare length of String : ");
     System.out.println(lp.and(p).test("Sachin"));   // Using and
     
	
	}

}

/*OUTPUT
Using test() method in IntPredicate :
false
true
------------------------------------------------
Using and in IntPredicate :
true
------------------------------------------------
For String length Checking condition Using Predicate :
true
------------------------------------------------
Using 'or' compare length of String : 
true
------------------------------------------------
Using 'and' compare length of String : 
false
*/
