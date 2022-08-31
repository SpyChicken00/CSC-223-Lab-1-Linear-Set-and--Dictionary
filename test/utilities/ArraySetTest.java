/**
 * Test Cases for ArraySet Class
 * 
 * <p>Bugs: 
 * 
 * @author Jace Rettig and James ???
 * @Date 8-28-22
 */
package utilities;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ArraySetTest
{
	protected ArraySet<String> list;
	protected ArraySet<Integer> numlist;
	
	public ArraySetTest()
	{
		this.list = new ArraySet<String>();
		this.numlist = new ArraySet<Integer>();
		
	}
	
	
	
	
	@Test
	void testArraySetCollectionOfE()
	{
		//TODO?
	}
/*
 * add stuff
 * 
 */
	@Test
	void testAdd()
	{
		list.add("E");
		assertFalse(list.isEmpty());
	}
	
	@Test
	void testAddMany()
	{
		for(int i = 0;i < 5; i++ )
		{
			list.add("sum " + 1);
		}
		
		assertEquals(list.size(), 5);
	}

	/**
	 * AddAllAllCollectionOfQextendsE Tests
	 */
	@Test
	void testAddAllCollectionOfQextendsE()
	{
		//TODO
	}

	/**
	 * RetainAll Tests
	 */
	
	/**
	 * check if list will be empty despite retaining empty list
	 */
	@Test
	void testEmptyRetainAll()
	{
		List<Integer> testList = Arrays.asList();
		this.numlist.addAll(testList);
		this.numlist.retainAll(testList);
		assertTrue(this.numlist.isEmpty());
	}
	/**
	 * check if list will retain list
	 */
	@Test
	void testRetainList() {
		List<Integer> testList1 = Arrays.asList(1, 2, 3);
		List<Integer> testList2 = Arrays.asList(4, 5, 6);
		
		this.numlist.addAll(testList1);
		this.numlist.addAll(testList2);
		this.numlist.retainAll(testList1);
		//ensure list only contains items from list 1
		assertTrue(this.numlist.containsAll(testList1));
		assertFalse(this.numlist.containsAll(testList2));
	}
	/**
	 * check if list will retain list with null value
	 */
	@Test
	void testRetainList2() {
		List<Integer> testList1 = Arrays.asList(1, 2, 3);
		List<Integer> testList2 = Arrays.asList(4, 5, 6);
		List<Integer> testList3 = Arrays.asList(7, 8 ,9);
		
		
		this.numlist.addAll(testList1);
		this.numlist.addAll(testList2);
		this.numlist.addAll(testList3);
		this.numlist.add(null);
		
		this.numlist.retainAll(testList3);
		//ensure list only contains items from list 1
		assertTrue(this.numlist.containsAll(testList3));
		assertFalse(this.numlist.containsAll(testList2));
		assertFalse(this.numlist.containsAll(testList1));
		assertFalse(this.numlist.contains(null));
	}
	/**
	 * check if retain will save empty list
	 */
	@Test
	void testRetainEmptyList() {
		List<Integer> testList1 = Arrays.asList();
		this.numlist.addAll(testList1);
		this.numlist.retainAll(testList1);
		assertTrue(this.numlist.containsAll(testList1));
	}
	
	/**
	 * RemoveAll Tests
	 */
	@Test
	void testAdd1RemoveAll()
	{
		//add 1 item to the list
		this.list.add("Test");
		this.list.removeAll(list);
		assertTrue(this.list.isEmpty());
		
	}
	
	@Test
	void testAddMultipleRemoveAll()
	{
		//remove multiple items
		this.list.add("Test1");
		this.list.add("Test2");
		this.list.add("Test3");
		this.list.add("Test4");

		this.list.removeAll(list);
		assertTrue(list.isEmpty());
	}
	
	@Test
	void testEmptyRemoveAll()
	{
		//clear empty list
		this.list.removeAll(list);
		assertTrue(list.isEmpty());
		
	}
	
	@Test
	void testEmptyStringRemoveAll()
	{
		this.list.add("");
		this.list.add("");
		this.list.add("");
		
		this.list.removeAll(list);
		assertTrue(list.isEmpty());
		
	}
	
	
	
	/**
	 * AddAllIntCollectionOfQextendsE Tests
	 */
	@Test
	void testAddEmptyList() {
		List<String> testList = Arrays.asList();
		this.list.addAll(0, testList);
		assertTrue(list.isEmpty());
	}
	
	/**
	 * add values to beginning of list index
	 */
	@Test
	void testAddValuestoBeginningAddAllIndex()
	{
		List<String> testList = Arrays.asList();
		testList = Arrays.asList("a", "b", "c");
		this.list.addAll(0, testList);
		assertFalse(list.isEmpty());
		assertTrue(list.contains("a"));
	}
	
	/**
	 * add values to the end of list index
	 */
	@Test
	void testAddValuestoEndAddAllIndex()
	{
		List<String> testList = Arrays.asList();
		testList = Arrays.asList("a", "b", "c");
		list.add("z");
		list.add("x");
		this.list.addAll(2, testList);
		assertFalse(list.isEmpty());
		assertEquals(list.get(4), "c");
	}
	/**
	 * add null list to index 0
	 */
	@Test
	void testAddNullList() {
		List<String> testList = Arrays.asList(null, null, null);
		this.list.addAll(0, testList);
		//see if list is still empty
		assertFalse(testList.isEmpty());	
	}
	
	
}
