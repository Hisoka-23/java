package Collection;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> P = i -> i > 10;
		System.out.println(P.test(15));
		System.out.println(P.test(5));
		
	}

}
