package DataStructs.hashtable;

import java.util.Objects;

public class HashTableForString {


    private static int defaultCapacity = 10;
    private static final String SENTINEL = null;
    String[] x;

    HashTableForString(int defaultSize) {
        defaultCapacity = defaultSize;
        x = new String[defaultCapacity];
    }

    HashTableForString() {
    }

    private int hashFunction(int n) {
        int k = 0;
        return n % defaultCapacity;
    }

    public void put(String n) {
        doLinearProbing(n);
    }

    public String get(String s) {
        return x[hashFunction(s.length())];
    }

    public void print() {
        for (String m : x) {
            System.out.println(m);
        }
    }

    private void doLinearProbing(String n) {
        int k = hashFunction(n.length());
        String currentData = x[k];
        if (Objects.isNull(currentData)) {
            x[k] = n;
        } else {
            if (Objects.isNull(x[k + 1])) {
                x[k + 1] = n;
            } else if (Objects.isNull(x[k - 1])) {
                x[k - 1] = n;
            } else {
                for (int i = k + 1; i < x.length; i++) { //search towards front of array
                    if (Objects.isNull(x[i])) {
                        x[i] = n;
                        break;
                    }
                }
                for (int i = 0; i < k - 1; i++) { //search towards back of array
                    if (Objects.isNull(x[i])) {
                        x[i] = n;
                        break;
                    }
                }
            }

        }
    }
}


