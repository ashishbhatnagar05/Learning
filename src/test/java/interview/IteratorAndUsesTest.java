package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@Ignore
	@Test
	public void IteratorMethodCallTest() {
		List<String> list = mockStringList();
		sut.IteratorMethodCall(list);
	}

	@Ignore
	@Test
	public void iterateOverListUsingAdvancedForTest() {
		// List<String> list=Arrays.asList("Ashish","aman","sandeep");
		List<Integer> list = Arrays.asList(new Integer(1), new Integer(2), new Integer(3), new Integer(4));
		sut.iterateOverListUsingAdvancedFor(list);
	}

	@Test
	public void iterateOverMapTest() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ashish", 1);
		map.put("aman", 2);
		sut.iterateOverMap(map);
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
