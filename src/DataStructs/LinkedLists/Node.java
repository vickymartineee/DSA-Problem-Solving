package DataStructs.LinkedLists;

public class Node {
    int data;
    Node nextNode;

    Node(int data){
        this.data = data;
        this.nextNode = null;
    }

    Node(int data,Node next){
        this.data = data;
        this.nextNode = next;
    }
}


