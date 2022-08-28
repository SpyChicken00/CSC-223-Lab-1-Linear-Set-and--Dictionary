/**
 * Test cases for the Parallel Array Dictionary Class
 * 
 * <p>Bugs: 
 * 
 * @author Jace Rettig and James ???
 * @Date 8-28-22
 */
package utilities;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class ParallelArrayDictionaryTest
{
	private ParallelArrayDictionary<Integer, String> intStringDictionary;
	private ParallelArrayDictionary<Integer, Double> intDoubleDictionary;
	
	ParallelArrayDictionaryTest()
	{
		this.intStringDictionary = new ParallelArrayDictionary<Integer, String>();
		this.intDoubleDictionary = new ParallelArrayDictionary<Integer, Double>();
	}
	
	private void fillDictionaries() {
		this.intDoubleDictionary.put(1, 1.0);
		this.intDoubleDictionary.put(2, 2.0);
		this.intDoubleDictionary.put(3, 3.0);
		
		this.intStringDictionary.put(1, "one");
		this.intStringDictionary.put(2, "two");
		this.intStringDictionary.put(3, "three");
	}
	
	//JACE
	/**
	 * Get method tests
	 */
	//tests intDoubleDictionary
	@Test
	void testIntDoubleGet()
	{
		this.fillDictionaries();
		assertEquals((Double)1.0, intDoubleDictionary.get(1));
		assertEquals((Double)2.0, intDoubleDictionary.get(2));
		assertEquals((Double)3.0, intDoubleDictionary.get(3));
	}
	
	//tests intStringDictionary
	@Test
	void testIntStringGet() {
		this.fillDictionaries();
		assertEquals("one", intStringDictionary.get(1));
		assertEquals("two", intStringDictionary.get(2));
		assertEquals("three", intStringDictionary.get(3));
	}
	
	//tests to see if empty string can be gotten
	@Test
	void testGetEmptyString() {
		this.intStringDictionary.put(0, "");
		assertEquals("", intStringDictionary.get(0));
	}
	
	//tests to see if null dictionary can be gotten
	@Test
	void testGetNullDictionary() {
		assertTrue(intDoubleDictionary.isEmpty());
		intDoubleDictionary.put(null, null);
		assertNull(intDoubleDictionary.get(null));
	}
	
	//tests to see if negative keys will work
	@Test
	void testNegativeKey() {
		this.intDoubleDictionary.put(-1, 1.0);
		assertEquals((Double)1.0, intDoubleDictionary.get(-1));
		
	}
	
	/**
	 * Remove method tests
	 */
	@Test
	void testRemoveString()
	{
		this.fillDictionaries();
		assertEquals("one", intStringDictionary.remove(1));
		assertEquals("two", intStringDictionary.remove(2));
		
		assertFalse(intStringDictionary.containsKey(1));
		assertFalse(intStringDictionary.containsKey(2));
		assertTrue(intStringDictionary.containsKey(3));
		assertFalse(intStringDictionary.containsValue("one"));
		assertFalse(intStringDictionary.containsValue("two"));
		assertTrue(intStringDictionary.containsValue("three"));
		
		
	}
	
	@Test
	void testRemoveDouble() {
		this.fillDictionaries();
		assertEquals((Double) 1.0, intDoubleDictionary.remove(1));
		assertEquals((Double) 2.0, intDoubleDictionary.remove(2));
		
		assertFalse(intDoubleDictionary.containsKey(1));
		assertFalse(intDoubleDictionary.containsKey(2));
		assertTrue(intDoubleDictionary.containsKey(3));
		assertFalse(intDoubleDictionary.containsValue(1.0));
		assertFalse(intDoubleDictionary.containsValue(2.0));
		assertTrue(intDoubleDictionary.containsValue(3.0));
	}
	
	@Test
	void testRemoveNull() {
		this.intStringDictionary.put(1, "one");
		this.intStringDictionary.put(null, null);
		
		assertNull(intStringDictionary.remove(null));
		assertEquals("one", intStringDictionary.get(1));
	}
	
	@Test
	void testRemovethenAdd() {
		this.fillDictionaries();
		assertEquals("one", intStringDictionary.remove(1));
		
		intStringDictionary.put(1, "one");
		assertEquals("one", intStringDictionary.get(1));
		
	}

	/**
	 * Clear method tests
	 */
	@Test
	void testClearFullDictionary()
	{
		this.fillDictionaries();
		intStringDictionary.clear();
		intDoubleDictionary.clear();
		assertTrue("String Dictionary is not empty", intStringDictionary.isEmpty());
		assertTrue("Double Dictionary is not empty", intDoubleDictionary.isEmpty());
	}
	
	@Test
	void testClearEmptyDictionary() {
		intStringDictionary.clear();
		intDoubleDictionary.clear();
		assertTrue(intStringDictionary.isEmpty());
		assertTrue(intDoubleDictionary.isEmpty());
	}
	
	@Test
	void testClearNullDictionary() {
		intStringDictionary.put(null, null);
		intStringDictionary.put(null, null);
		intDoubleDictionary.put(null, null);
		intDoubleDictionary.put(null, null);
		
		intStringDictionary.clear();
		intDoubleDictionary.clear();
		assertTrue(intStringDictionary.isEmpty());
		assertTrue(intDoubleDictionary.isEmpty());
	}

	
	
	//JAMES
	/**
	 * Put method tests
	 */
	@Test
	void testPut()
	{
		//TODO
	}
	
	@Test
	void testPutAll()
	{
		//TODO
	}
}
