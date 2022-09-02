/**
 * A Dictionary implemented using parallel arrays for key and value
 * 
 * <p>Bugs: 
 * 
 * @author Jace Rettig and James ???
 * @Date 8-28-22
 */
package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.AbstractMap;

public class ParallelArrayDictionary<Key, Value> implements Map<Key, Value> {
	protected ArraySet<Key> keys;
	protected ArrayList<Value> values;

	public ParallelArrayDictionary()
	{
		this.keys = new ArraySet<Key>();	
		this.values = new ArrayList<Value>();
	}

	@Override
	public int size() {
		return this.keys.size();
	}

	@Override
	public boolean isEmpty() {
		return this.keys.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return this.keys.contains(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return this.values.contains(value);
	}

	@Override
	public Value get(Object key) {
		//return value at same index of value
		return this.values.get(keys.indexOf(key));
	}

	@Override
	public Value put(Key key, Value value) {
		this.keys.add(key);
		this.values.add(value);
		return value;
	}

	//
	@Override
	public Value remove(Object key) {
		//must remove from values first so save to variable
		Value v = this.values.remove(this.keys.indexOf(key));
		
		//remove from keys
		this.keys.remove(this.keys.indexOf(key));
		
		//return value
		return v;
	}

	@Override
	public void putAll(Map<? extends Key, ? extends Value> m) {
		for (Key K : m.keySet())
		{
			if (this.keys.contains(K))
			{
				this.remove(K);
			}
			this.keys.add(K);
			this.values.add(m.get(K));
		}
	}

	@Override
	public void clear() {
		//clear keys
		this.keys.clear();
		//clear values
		this.values.clear();
		
	}

	@Override
	public Set<Key> keySet() {
		
		return keys;
	}

	@Override
	public Collection<Value> values() {
		
		return values;
	}

	@Override
	public Set<Entry<Key, Value>> entrySet() {
		ArraySet <Entry<Key, Value>> S;
		S = new ArraySet<>();
		for (Key K : this.keys)
		{
			S.add(new AbstractMap.SimpleEntry<>(K, this.values.get(keys.indexOf(K))));
		}
		return S;
	}

}
