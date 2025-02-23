package DataStructs.hashtable;

public class HashTableForInt {

    private static int defaultCapacity = 10;
    private static final int SENTINEL = -1;
    int[] x;

    HashTableForInt(int defaultSize) {
        defaultCapacity = defaultSize;
        x = new int[defaultCapacity];
        for (int p = 0; p < defaultSize; p++) {
            x[p] = SENTINEL;
        }
    }

    HashTableForInt() {
    }

    private int hashFunction(int n) {
        int k = 0;
        return n % defaultCapacity;
    }

    public void put(int n) {
        doLinearProbing(n);
    }

    public int get(int n) {
        return x[hashFunction(n)];
    }

    public void print() {
        for (int m : x) {
            System.out.println(m);
        }
    }

    private void doLinearProbing(int n) {
        int k = hashFunction(n);
        int currentData = x[k];
        if (currentData == SENTINEL) {
            x[k] = n;
        } else {
            if (x[k + 1] == SENTINEL) {
                x[k + 1] = n;
            } else if (x[k - 1] == SENTINEL) {
                x[k - 1] = n;
            } else {
                for (int i = k + 1; i < x.length; i++) { //search towards front of array
                    if (x[i] == SENTINEL) {
                        x[i] = n;
                        break;
                    }
                }
                for (int i = 0; i < k - 1; i++) { //search towards back of array
                    if (x[i] == SENTINEL) {
                        x[i] = n;
                        break;
                    }
                }
            }

        }
    }
}
