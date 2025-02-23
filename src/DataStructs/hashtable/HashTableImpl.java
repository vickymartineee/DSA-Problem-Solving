package DataStructs.hashtable;

public class HashTableImpl {
    public static void main(String[] args) {
        HashTableForInt h = new HashTableForInt(10);
        for (int i = 0; i < 9; i++) {
            h.put(i);
        }
        h.print();
        System.out.println("------");
        System.out.println(h.get(5));
        HashTableForString s = new HashTableForString(10);
        for (int i = 0; i < 9; i++) {
            s.put("Vicky_" + i);
        }
        s.print();
    }
}
