package DataStructs.LinkedLists;

public class Sample {
    public static void main(String[] args) {
        Node s = new Node(100);
        Node s2 = new Node(101);
        s.nextNode = s2;
        int[] arr = {1,24,5,6,1};
        Node xyz = LinkedListImpl.convertArrToLL(arr);

        int length = LinkedListImpl.length(xyz);
        System.out.println("Length ---> "+ length);
        System.out.println("find the element "+ LinkedListImpl.findItem(xyz,5));
        Node hy =  LinkedListImpl.deleteHead(xyz);
        LinkedListImpl.printAllElements(hy);
        System.out.println("===================");
        LinkedListImpl.printAllElements(xyz);
//        LinkedListImpl.removeTail(xyz);
        System.out.println("===================");
        LinkedListImpl.printAllElements(xyz);
        System.out.println("-----------remove at index");
        Node p =  LinkedListImpl.removeElementByIndex(xyz,1);
        LinkedListImpl.printAllElements(p);
   /*     System.out.println("-----------remove by Element");
        Node p3 = LinkedListImpl.removeElement(xyz,5);
        LinkedListImpl.printAllElements(p3);*/
        System.out.println("-----------Insert by Element");
        Node p5 = LinkedListImpl.insertElement(xyz,3,100);
        LinkedListImpl.printAllElements(p5);
        System.out.println("-----------Insert by Element");
        Node p6 = LinkedListImpl.insertElement(xyz,7,32);
        LinkedListImpl.printAllElements(p6);
        System.out.println("-----------Odd/EVEN");
        Node P7 = LinkedListImpl.oddEvenList(p6);
        LinkedListImpl.printAllElements(P7);
    }
}
