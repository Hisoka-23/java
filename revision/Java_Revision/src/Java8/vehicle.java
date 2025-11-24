package Java8;

public interface vehicle {

	public void start();
	
	public default void clean() {
		System.out.println("Clean...!");
	}
	
	public static void myClean() {
		System.out.println("myClean...!");
	}
	
}
