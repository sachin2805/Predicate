package predicate;

import java.util.function.IntPredicate;

public class IntPredicate_test {

	public static void main(String[] args) {
	Integer i=100;
	
	//Using Anynomous class :
	IntPredicate i1=new IntPredicate() {
		
		@Override
		public boolean test(int t) {
			
			if(t<10)
				return true;
			return false;
		}
	};
	
	//Using Lambda Expression :
	
	IntPredicate i2=(t)->(t>20);
	IntPredicate i3=(t)->(t<60);
	System.out.println(i1.test(i));
	
	System.out.println(i2.test(50));
	
	System.out.println(i2.and(i3).test(25)); // in that check both condition if both are true then and then print True otherwise false
	}

}
/*OUTPUT :
false
true
true
*/