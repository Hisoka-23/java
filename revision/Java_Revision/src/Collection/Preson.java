package Collection;

public class Preson {

	String name;
	int age;
	
	Preson(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Preson [name=" + name + ", age=" + age + "]";
	}
	
}