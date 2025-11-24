package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo3 {

public static void main(String[] args) {
		
		Preson p1 = new Preson("gojo", 27);
		Preson p2 = new Preson("yuta", 25);
		Preson p3 = new Preson("vikash", 17);
		Preson p4 = new Preson("stayam", 26);
		Preson p5 = new Preson("rajat", 16);
		Preson p6 = new Preson("pooja", 14);
		
		List<Preson> preson = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Preson> p = i -> i.age > 18;
		
		for(Preson pre: preson) {
			if(p.test(pre)) {
				System.out.println(pre.name);
			}
		}
		
	}
	
}
