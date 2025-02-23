package DataStructs.LinkedLists;

public class LinkedListImpl {
    public static Node convertArrToLL(int [] arr){
        Node n = new Node(arr[0]);
        Node ptr = n;
        for(int i=1;i<arr.length;i++){
            Node n1 = new Node(arr[i]);
            ptr.nextNode = n1;
            ptr = n1;
        }
        return n;
    }
    public static void printAllElements(Node n){
        Node n1 = n;
        while(n1!= null){
            System.out.println(n1.data);
            n1 = n1.nextNode;
        }
    }
    static int length(Node n){
        Node n1 = n;
        int  l = 0;
        while(n1!=null){
            l++;
            n1 = n1.nextNode;
        }
        return l;
    }

    static int findItem(Node n, int x){
        Node temp = n;
        while(temp != null){
            if(temp.data == x){
                return 1;
            }
            temp = temp.nextNode;
        }
        return 0;
    }

    static Node deleteHead(Node n){
        if(n== null)
            return null;
        n = n.nextNode;
        return n;
    }

    static Node removeTail(Node n){
        if(n==null || n.nextNode== null){
            return null;
        }
        Node temp = n;
        while(temp.nextNode.nextNode != null){
            temp = temp.nextNode;
        }
        temp.nextNode = null;
        return temp;
    }
    static Node removeElementByIndex(Node n, int index){
        Node temp = n;
        Node prev = null;
        int count =1;
        if(index == 1){
            n = n.nextNode;
            return n;
        }
        while(temp!=null){
            if(count == index){
                prev.nextNode = prev.nextNode.nextNode;
                break;
            }
            count++;
            prev = temp;
            temp = temp.nextNode;
        }
        return n;
    }

    static Node removeElement(Node n, int element){
        Node temp = n;
        Node prev = null;
        if(element == temp.data){
            n = n.nextNode;
            return n;
        }
        while(temp!=null){
            if(temp.data == element){
                prev.nextNode = prev.nextNode.nextNode;
                break;
            }
            prev = temp;
            temp = temp.nextNode;
        }
        return n;
    }

    static Node insertElement(Node n, int index,int element){
        if(n==null && index ==1){
            return new Node(element,n);
        }
        if(index == 1){
            return new Node(element,n);
        }
        Node temp = n;
        Node prev = null;
        int count = 1;
        while(temp!=null){
            if(index == count){
                prev.nextNode = new Node(element,temp);
                break;
            }
            if((count+1 == index) && temp.nextNode == null){
                temp.nextNode = new Node(element,null);
                break;
            }
            prev = temp;
            temp = temp.nextNode;
            count++;
        }
        return n;
    }
     static Node oddEvenList(Node head) {
        if(head ==null || head.nextNode ==null){
            return head;
        }
        Node odd  = head;
        Node even = head.nextNode;
        Node evenHead = head.nextNode;
        while(even!=null && even.nextNode!=null){
            odd.nextNode = odd.nextNode.nextNode;
            odd = odd.nextNode;
            even.nextNode = even.nextNode.nextNode;
            even = even.nextNode;
        }
        odd.nextNode = evenHead;
        return head;
    }

}

