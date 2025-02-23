package DataStructs.LinkedLists;

public class DLLNode {
    int data;
    DLLNode prev;
    DLLNode next;

    DLLNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    DLLNode(int data,DLLNode prev, DLLNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    DLLNode(){

    }
}
