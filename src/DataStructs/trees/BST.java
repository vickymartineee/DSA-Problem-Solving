package DataStructs.trees;

import java.util.*;

class Pair {
    Node node;
    int horizontalDistance;

    Pair(Node n, int hd) {
        node = n;
        horizontalDistance = hd;
    }
}

public class BST {

    Node root;

    BST() {
        root = null;
    }

    void addNode(Integer data) {
        root = insertRecursiveNodes(root, data);
    }

    private Node insertRecursiveNodes(Node n, Integer data) {
        if (n == null) {
            return new Node(data);
        }
        if (data < n.data) {
            n.leftNode = insertRecursiveNodes(n.leftNode, data);
        }
        if (data > n.data) {
            n.rightNode = insertRecursiveNodes(n.rightNode, data);
        }
        return n;
    }

    public boolean isElementExists(Integer data) {
        return search(root, data);
    }

    private boolean search(Node n, Integer data) {
        if (n == null) {
            return false;
        }
        if (n.data == data) {
            return true;
        }
        if (n.data < data) {
            return search(n.leftNode, data);
        } else {
            return search(n.rightNode, data);
        }
    }

    public void preOrderTraversal(Node n) {
        if (n == null) {
            return;
        }

        System.out.print(n.data + " ");
        preOrderTraversal(n.leftNode);
        preOrderTraversal(n.rightNode);
    }

    public void postOrderTraversal(Node n) {
        if (n == null) {
            return;
        }
        postOrderTraversal(n.leftNode);
        postOrderTraversal(n.rightNode);
        System.out.print(n.data + " ");
    }

    public void inOrderTraversal(Node n) {
        if (n == null) {
            return;
        }
        inOrderTraversal(n.leftNode);
        System.out.print(n.data + " ");
        inOrderTraversal(n.rightNode);
    }

    public Integer findHeight(Node n) {
        if (n == null) {
            return 0;
        }
        int left = findHeight(n.leftNode);
        int right = findHeight(n.rightNode);
        return 1 + Math.max(left, right);
    }

    public void printTopView(Node n) {
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> result = new TreeMap<>();
        q.offer(new Pair(n, 0));
        while (!q.isEmpty()) {
            Pair cp = q.poll();
            if (!result.containsKey(cp.horizontalDistance)) {
                result.put(cp.horizontalDistance, cp.node.data);
            }
            if (cp.node.leftNode != null) {
                Pair leftCp = new Pair(cp.node.leftNode, cp.horizontalDistance - 1);
                q.offer(leftCp);
            }
            if (cp.node.rightNode != null) {
                Pair rightCp = new Pair(cp.node.rightNode, cp.horizontalDistance + 1);
                q.offer(rightCp);
            }
        }
        result.forEach((key, value) -> System.out.print(value + " "));


    }

    public void levelOrderTraversal(Node n) {
        Queue<Node> q = new LinkedList<>();
        List<Integer> sub = new ArrayList<>();
        q.offer(n);
        while (!q.isEmpty()) {
            if (q.peek() != null && q.peek().leftNode != null) {
                q.offer(q.peek().leftNode);
            }
            for (int i = 0; i < q.size(); i++) {
                if (q.peek().rightNode != null) {
                    q.offer(q.peek().rightNode);
                }

                sub.add(Objects.requireNonNull(q.poll()).data);
            }
        }
        System.out.println(sub);
    }

    public Integer lowestCommonAncestor(Node n, int x, int y){
        if(n == null){
            return null;
        }
        if(n.data< x && n.data <y){
            return  lowestCommonAncestor(n.rightNode , x,y);
        }
        if(n.data>x && n.data > y){
            return  lowestCommonAncestor(n.rightNode, x, y);
        }
        return n.data;
    }
}
