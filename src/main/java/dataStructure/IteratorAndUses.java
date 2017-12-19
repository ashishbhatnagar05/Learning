package dataStructure;

import java.util.Iterator;
import java.util.List;

public class IteratorAndUses {
	public void IteratorRemoveTwice(List<String> list) {
		System.out.println(list);
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			if (str.equalsIgnoreCase("Ashish")) {
				itr.remove();
			}
		}
		System.out.println(list);

		//itr = list.iterator();//uncomment to make method work correctly
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			if (str.equalsIgnoreCase("Amit")) {
				itr.remove();
			}
		}
		System.out.println(list);
	}

}

// Findings:
// 1: We cant use an iterator twice to remove.Assign a new Iterator Object. IteratorRemoveTwice()