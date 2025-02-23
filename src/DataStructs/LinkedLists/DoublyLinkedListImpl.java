package DataStructs.LinkedLists;

public class DoublyLinkedListImpl {
    static void printDLList(DLLNode node) {
        DLLNode temp = node;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static DLLNode insertIntoDLL(int[] arr) {
        DLLNode node = new DLLNode(arr[0]);
        DLLNode prev = node;
        for (int i = 1; i < arr.length; i++) {
            DLLNode temp = new DLLNode(arr[i], prev, null);
            prev.next = temp;
            prev = temp;
        }
        return node;
    }

    static DLLNode deleteHead(DLLNode node) {
        if (node == null || node.next == null) {
            return null;
        }
        DLLNode prev = node;
        node = node.next;

        node.prev = null;
        prev.next = null;
        return node;
    }

    static DLLNode deleteTail(DLLNode node) {
        DLLNode temp = node;
        if (node == null || node.next == null) {
            return null;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        DLLNode tail = temp.prev;
        tail.next = null;
        temp.prev = null;

        return node;

    }

    static DLLNode deleteByIndex(DLLNode dllNode, int i) {
        DLLNode tempNode = dllNode;
        DLLNode prevNode = tempNode;
        int index = 0;
        if (dllNode == null) {
            return null;
        }
        if (i == 0) {
            return deleteHead(dllNode);
        }
        if (dllNode.next == null && dllNode.prev == null) {
            return new DLLNode();
        }

        while (tempNode != null) {
            if (index == i) {
                prevNode.next = tempNode.next;
                tempNode = tempNode.next;
                tempNode.prev = prevNode;
                break;
            }
            prevNode = tempNode;
            tempNode = tempNode.next;
            if (tempNode != null && tempNode.next == null && ((index+1) == i)) {
                tempNode = prevNode;
                tempNode.next = null;
                break;
            }
            index++;
        }
        return dllNode;
    }

    static DLLNode deleteByNumber(DLLNode dllNode, int i) {
        DLLNode tempNode = dllNode;
        DLLNode prevNode = tempNode;
        if (dllNode == null) {
            return null;
        }
        if (i == dllNode.data) {
            return deleteHead(dllNode);
        }
        if (dllNode.next == null && dllNode.prev == null) {
            return new DLLNode();
        }

        while (tempNode != null) {
            if (tempNode.data == i) {
                prevNode.next = tempNode.next;
                tempNode = tempNode.next;
                tempNode.prev = prevNode;
                break;
            }
            prevNode = tempNode;
            tempNode = tempNode.next;
            if (tempNode != null && tempNode.next == null && tempNode.data == i) {
                tempNode = prevNode;
                tempNode.next = null;
                break;
            }
        }
        return dllNode;
    }

    static DLLNode insertAtIndex(DLLNode dllNode,int i, int element){
        DLLNode temp = dllNode;
        DLLNode next;
        int index =0;
        while(temp!=null){
            if(index+1 == i){
                DLLNode newDllNode = new DLLNode(element,temp,temp.next);
                next = temp.next;
                next.prev = newDllNode;
                temp.next = newDllNode;
            }
            temp = temp.next;
            index++;
        }
        return dllNode;
    }
//    It kinda messes up the initial Node which I didn't like
    static DLLNode reverseDLL(DLLNode node){
        DLLNode temp = node;

        DLLNode prev = null;
        if(temp == null || temp.next == null){
            return temp;
        }
        while (temp!=null){
            prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            temp = temp.prev;
        }
        return prev.prev;
    }

}
