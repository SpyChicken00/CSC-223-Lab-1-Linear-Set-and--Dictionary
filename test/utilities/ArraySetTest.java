package utilities;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ArraySetTest
{
	protected ArraySet<String> list;
	
	public ArraySetTest()
	{
		list = new ArraySet<String>();
	}
	
	
	
	
	@Test
	void testArraySetCollectionOfE()
	{
	}

	@Test
	void testAddE()
	{
	}

	/**
	 * AddAllAllCollectionOfQextendsE Tests
	 */
	@Test
	void testAddAllCollectionOfQextendsE()
	{
	}

	/**
	 * RetainAll Tests
	 */
	@Test
	void testRetainAll()
	{
	}
	
	/**
	 * RemoveAll Tests
	 */
	@Test
	void testAdd1RemoveAll()
	{
		//add 1 item to the list
		list.add("Test");
		list.removeAll(list);
		assertTrue(list.isEmpty());
		
	}
	
	@Test
	void testAddMultipleRemoveAll()
	{
		//remove multiple items
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");

		list.removeAll(list);
		assertTrue(list.isEmpty());
	}
	
	@Test
	void testEmptyRemoveAll()
	{
		//clear empty list
		list.removeAll(list);
		assertTrue(list.isEmpty());
		
	}
	
	@Test
	void testEmptyStringRemoveAll()
	{
		list.add("");
		list.add("");
		list.add("");
		
		list.removeAll(list);
		assertTrue(list.isEmpty());
		
	}
	
	
	
	/**
	 * AddAllIntCollectionOfQextendsE Tests
	 */

	@Test
	void testAddAllIntCollectionOfQextendsE()
	{
	}
}
