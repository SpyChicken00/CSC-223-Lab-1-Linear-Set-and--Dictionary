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
	
	void testAddMany()
	{
		for(int i = 0;i < 5; i++ )
		{
			list.add("sum " + 1);
		}
		
		assertEquals(list.size(), 5);
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
