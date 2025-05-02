package DataStructs.trees;

public class Node {
    int data;
    Node rightNode;
    Node leftNode;

    Node(int data, Node r, Node l){
        this.data = data;
        this.leftNode = l;
        this.rightNode =r;
    }
    Node(int data){
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }
}
