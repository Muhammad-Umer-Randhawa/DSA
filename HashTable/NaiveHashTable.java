public class NaiveHashTable implements Map{
    private Entry[] entries = new Entry[11];
    private int size;
    private class Entry{
      Object key;
      Object value;
      Entry(Object k, Object v){
        key = k;
        value = v;
      }
    }
    private int hash(Object key){
      return (key.hashCode() & 0x7FFFFFFF) % entries.length;
    }
    public Object get(Object key){
      return entries[hash(key)].value;
    }
    public Object put(Object key, Object value){
      entries[hash(key)] = new Entry(key, value);
      ++size;
      return null;
    }
    public Object remove(Object key){
      int h = hash(key);
      Object v = entries[h].value;
      entries[h] = null;
      --size;
      return v;
    }
    public int size(){
      return size;
    }
}