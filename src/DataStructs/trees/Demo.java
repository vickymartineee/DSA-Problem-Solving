package DataStructs.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> test = Arrays.asList(1, 2,3,4,5);
        Node n = BinaryTree.convertListToBTree(test);
//        System.out.println(n.data);
        BinaryTree.printTree(n, "", true);

        BST bst = new BST();
        bst.addNode(9);
        bst.addNode(12);
        bst.addNode(10);
        bst.addNode(8);
        bst.addNode(13);
        System.out.println(bst.isElementExists( 10));
        bst.preOrderTraversal(bst.root);
        System.out.println();
        bst.postOrderTraversal(bst.root);
        System.out.println();
        bst.inOrderTraversal(bst.root);
        System.out.println();
        System.out.println(bst.findHeight(bst.root));
        System.out.println();
        bst.printTopView(bst.root);
        System.out.println("--------------");
        bst.levelOrderTraversal(bst.root);
        System.out.println("-----LCA-------");
        System.out.println(bst.lowestCommonAncestor(bst.root, 12,8));
    }


}
