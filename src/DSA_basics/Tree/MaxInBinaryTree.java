package DSA_basics.Tree;

import java.util.LinkedList;
import java.util.Queue;

class MaxInBinaryTree {
    static int maximum(Node root){ // O(n) time, A.S. = O(w)
        if(root == null) return Integer.MIN_VALUE;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int m = root.key;
        while( !q.isEmpty() ){
            Node curr = q.poll();
            m = Math.max(m,curr.key);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        return m;
    }
    static int maximum2(Node root){ // O(n) time, A.S. = O(h)
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.key,Math.max(
                maximum2(root.left), maximum2(root.right)));
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
        System.out.println(maximum(root));
        System.out.println(maximum2(root));
    }
}
