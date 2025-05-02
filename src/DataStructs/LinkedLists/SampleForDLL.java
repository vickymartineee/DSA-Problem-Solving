package DataStructs.LinkedLists;

public class SampleForDLL {
    public static void main(String[] args) {
        int[] arr = {3,2};
        DLLNode n = DoublyLinkedListImpl.insertIntoDLL(arr);
//        DoublyLinkedListImpl.printDLList(n);
        System.out.println("<----------------------->");
//        DLLNode n1 = DoublyLinkedListImpl.deleteHead(n);
//        DoublyLinkedListImpl.printDLList(n1);
//        System.out.println("<----------------------->");
//        DLLNode n2 = DoublyLinkedListImpl.deleteTail(n1);
//        DoublyLinkedListImpl.printDLList(n2);
//        DLLNode n3 = DoublyLinkedListImpl.deleteByIndex(n, 0);
//        DoublyLinkedListImpl.printDLList(n3);
//        DLLNode n3 = DoublyLinkedListImpl.deleteByIndex(n, 100);
//        DoublyLinkedListImpl.printDLList(n3);
        DLLNode n4 = DoublyLinkedListImpl.insertAtIndex(n,1,1);
        DoublyLinkedListImpl.printDLList(n4);
        System.out.println("<----------------------->");

        DLLNode h1 = DoublyLinkedListImpl.reverseDLL(n4);
        DoublyLinkedListImpl.printDLList(h1);

    }

}

