package DSA_basics.Tree;

import java.util.LinkedList;
import java.util.Queue;

class LevelOrderTraverse {
    static void levelOrder(Node root){ // T.C. = O(h*n) , A.S. = O(h)
        int h = height(root); // O(n)
        for(int i = 0 ; i<h; i++) // O(h*n)
            printKthLevel(root,i);
    }
    static void printKthLevel(Node root, int k) { // O(n)
        if(root == null) return;
        if(k == 0){
            System.out.print(root.key+" ");
            return;
        }
        printKthLevel(root.left,k-1);
        printKthLevel(root.right,k-1);
    }

    static int height(Node root){ // O(n)
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static void levelOrder2(Node root){ // T.C. = O(n), A.S. = O(n)
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while( !q.isEmpty() ){
            Node curr = q.poll();
            System.out.print(curr.key+" ");
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
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
        levelOrder(root);
        System.out.println();
        levelOrder2(root);
    }
}
