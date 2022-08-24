package utilities;

import static org.junit.Assert.assertTrue;

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

	@Test
	void testAddAllCollectionOfQextendsE()
	{
	}

	@Test
	void testRetainAll()
	{
	}
	
	/**
	 * RemoveAll Tests
	 */
	@Test
	void testRemoveAll()
	{
		//add 1 item to the list
		list.add("Test");
		list.removeAll(list);
		assertTrue(list.isEmpty());
		
		assertTrue(list.isEmpty());
	}
	
	

	@Test
	void testAddAllIntCollectionOfQextendsE()
	{
	}
}
