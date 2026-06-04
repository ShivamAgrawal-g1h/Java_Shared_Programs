package DSA_basics.Tree;

import java.util.Stack;

class IterativePreorder {
    static void preOrder(Node root){
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while( !st.isEmpty() || curr != null) {
            while (curr != null) {
                st.push(curr);
                System.out.print(curr.key + " ");
                curr = curr.left;
            }
            curr = st.pop();
            curr = curr.right;
        }
    }
    static void preOrder_Standard(Node root){
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while( !st.isEmpty() ){
            Node curr = st.pop();
            System.out.print(curr.key+" ");
            if(curr.right != null) st.push(curr.right);
            if(curr.left != null) st.push(curr.left);
        }
    }
    static void preOrder_SpaceOptimized(Node root){
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while( !st.isEmpty() || curr != null){
            while(curr != null){
                System.out.print(curr.key+" ");
                if( curr.right != null) st.push(curr.right);
                curr = curr.left;
            }
            if(!st.isEmpty())curr = st.pop();
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
        preOrder(root);
        System.out.println();
        preOrder_Standard(root);
        System.out.println();
        preOrder_SpaceOptimized(root);
    }
}
