package DataStructs.hashmap;

import java.util.LinkedList;
import java.util.Objects;

public class HashMapPlain {
    private static final int default_capacity = 10;
    private LinkedList<Entry>[] table;

    private int size;


    private int hash(int key){
        return Math.abs(key)% table.length;
    }

    private void insert(int key, String value){
        int index = hash(key);
        if(table[index]==null){
            table[index] = new LinkedList<>();
        }
        LinkedList<Entry> bucket = table[index];
        for(Entry entry: bucket){
            if(entry.key == key){
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry(key,value));
        size++;
    }
    private String get(int key){
        int index = hash(key);
        LinkedList<Entry> bucket = table[index];
        for(Entry entry: bucket){
            if(entry.key == key){
                return entry.value;
            }
        }
        return null;
    }

    private boolean remove(int key){
        int idx = hash(key);
        LinkedList<Entry> bucket = table[idx];
        for(Entry entry: bucket){
            if(entry.key == key){
                bucket.remove();
                size--;
                return true;
            }
        }
        return false;
    }

    private int size(){
        return size;
    }
    private  boolean isEmpty(){
        return size==0;
    }

    private static class Entry{
        int key;
        String value;

        public Entry(int key, String value){
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if(o== null || getClass() !=o.getClass()) return false;
            Entry e = (Entry) o;
            return key == e.key && Objects.equals(value, e.value);
        }

        @Override
        public int hashCode(){
            return Objects.hash(key,value);
        }
    }
}
