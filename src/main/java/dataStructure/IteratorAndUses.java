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
				System.out.println("Ashish removed");
			}
		}
		System.out.println(list);

		// itr = list.iterator();//uncomment to make method work correctly
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			if (str.equalsIgnoreCase("Amit")) {
				itr.remove();
				System.out.println("Amit removed");
			}
		}
		System.out.println(list);
	}

	public void IteratorMethodCall(List<String> list) {
		System.out.println(list);
		String name = "Ashish";
		iteration(list.iterator(), name);
		System.out.println(list);
		iteration(list.iterator(), "Aman");
		System.out.println(list);
	}

	private void iteration(Iterator<String> itr, String name) {
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			if (str.equalsIgnoreCase(name)) {
				itr.remove();
			}
		}
	}
}

// Findings:
// 1: We cant use an iterator twice to remove.Assign a new Iterator
// Object.IteratorRemoveTwice().This behaviour is because we are at the end of
// itr in the end of first loop. After that if we try to iterate again, since it
// is at the end, it doesnt iterate/delete further. Use ListIterator to go back to old index or re create object
//
// 2: IteratorMethodCall() method is removing value from list each time. But we
// have to pass a new itr object.