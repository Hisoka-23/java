public class Demo{
	public static void main(String... args){
		boolean[] trueFalse = new boolean[3];
		trueFalse[2] = true;
		for(int i=0; i<trueFalse.length; i++){
			System.out.print(trueFalse[i]+" ");
		}
	}
}