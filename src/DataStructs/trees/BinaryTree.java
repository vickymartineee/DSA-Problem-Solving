package DataStructs.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    static Node convertListToBTree(List<Integer> list) {
        Node n = new Node(list.get(0));
        Queue<Node> queue = new LinkedList<>();
        queue.offer(n);
        int i = 1;
        while (i < list.size() && !queue.isEmpty()) {
            Node current = queue.poll();
            if (i < list.size()) {
                current.leftNode = new Node(list.get(i++));
                queue.offer(current.leftNode);
            }
            if (i < list.size()) {
                current.rightNode = new Node(list.get(i++));
                queue.offer(current.rightNode);

            }
        }
        return n;
    }

    static void printTree(Node binaryNode, String space, boolean isNodeLeft) {
        if (binaryNode != null) {
            System.out.print(space);
            System.out.print(isNodeLeft ? "|-l " : "|_r ");
            System.out.println(binaryNode.data);
            printTree(binaryNode.leftNode, (isNodeLeft ? "| " : " "), true);
            printTree(binaryNode.rightNode, (isNodeLeft ? "| " : " "), false);

        }
    }
}
