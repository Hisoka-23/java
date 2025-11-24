package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("balakrishna");
		list.add("venki");
		list.add("chiru");
		list.add("nag");
		
		System.out.println(list);//[balakrishna, venki, chiru, nag]
		
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			
			if(str.equals("venki")) {
				itr.remove();//[balakrishna, chiru, nag]
			}else if(str.equals("nag")) {
				itr.add("chaitu");//[balakrishna, chiru, nag, chaitu]
			}else if(str.equals("chiru")) {
				itr.set("charan");//[balakrishna,charan, nag, chaitu]
			}
		}
		
		System.out.println(list);//[balakrishna, charan, nag, chaitu]
		
	}
	
}
