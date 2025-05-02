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
    }


}
