package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        
        System.out.println(list);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        
        Iterator<Integer> itr = list.iterator();
        
        while (itr.hasNext()) {
            Integer num = itr.next();
            if (num % 2 == 0) {
                System.out.print(num+" ");
            } else {
                itr.remove();
            }
        }
        
        System.out.println("After removing odds: " + list); // [0, 2, 4, 6, 8, 10]

    }
}
