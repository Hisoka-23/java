package Collection;

public class Employee {
	
	String name;
	String location;
	String dept;
	
	Employee(String name, String location, String dept){
		this.name = name;
		this.location = location;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", dept=" + dept + "]";
	}

}
