package DSA_basics.Tree;

import java.util.LinkedList;
import java.util.Queue;

class SizeOfBinaryTree {
    static int size(Node root){ // T.C. = O(n)
        if(root == null) return 0;
        return size(root.left) + 1 + size(root.right);
    }
    static int size2(Node root){
        if(root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        while( !q.isEmpty() ){
            Node curr = q.poll();
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
            count++;
        }
        return count;
    }
    static void main() {
        // Create the following Binary Tree
        //            10
        //          /    \
        //         20     30
        //       /   \      \
        //      40    50     60
        //           /   \
        //         70     80
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(70);
        root.left.right.right = new Node(80);
        root.right.right = new Node(60);
        System.out.println(size(root));
        System.out.println(size2(root));
    }
}
