import java.util.*;

public class ABC{
	public static void main(String... args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of Rows : ");
		int rows = obj.nextInt();
		//char ch = 'A';

		for(int i=1; i<=rows; i++){
			for(char ch='A'; ch < 'A'+i; ch++){
				System.out.print(ch+" ");
				
			}
			System.out.println();
			//ch++;
		}
	}
}