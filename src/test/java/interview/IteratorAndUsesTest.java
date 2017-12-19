package interview;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import dataStructure.IteratorAndUses;

public class IteratorAndUsesTest {
	private IteratorAndUses sut;

	@Before
	public void setup() {
		sut = new IteratorAndUses();
	}

	@Ignore
	@Test
	public void IteratorRemoveTwiceTest() {
		List<String> list = mockStringList();
		sut.IteratorRemoveTwice(list);
	}

	@Test
	public void IteratorMethodCallTest() {
		List<String> list = mockStringList();
		sut.IteratorMethodCall(list);
	}

	private List<String> mockStringList() {
		List<String> list = new ArrayList<String>();
		list.add("Ashish");
		list.add("Aman");
		list.add("Avneesh");
		list.add("Amit");
		return list;
	}

}
