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

		// itr = list.iterator();//uncomment to make method work correctly
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			if (str.equalsIgnoreCase("Amit")) {
				itr.remove();
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
// 1: We cant use an iterator twice to remove.Assign a new Iterator Object.
// IteratorRemoveTwice()
// 2: IteratorMethodCall() method is removing value from list each time. But we
// have to pass a new itr object.