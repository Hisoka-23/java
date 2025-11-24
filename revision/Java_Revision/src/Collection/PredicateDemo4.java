package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo4 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("prakash", "noida", "development");
		Employee e2 = new Employee("rajat", "pune", "hr");
		Employee e3 = new Employee("om", "hyd", "sale");
		Employee e4 = new Employee("hello", "delhi", "marketing");
		Employee e5 = new Employee("hii", "mumbai", "sale");
		Employee e6 = new Employee("hey", "hyd", "sale");
		
		List<Employee> emp = Arrays.asList(e1, e2, e3, e4, e5, e6);
		
		Predicate<Employee> p1 = (i) -> i.location.equals("noida");
		Predicate<Employee> p2 = (i) -> i.dept.equals("development");
		
		Predicate<Employee> p = p1.and(p2);
		
		for(Employee e: emp) {
			if(p.test(e)) {
				System.out.println(e.name);
			}
		}
		
	}
	
}
