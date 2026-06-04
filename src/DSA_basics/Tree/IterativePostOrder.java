package DSA_basics.Tree;

import java.util.Stack;

class IterativePostOrder {
    static void postOrder(Node root){
        if(root == null) return;
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while( !st1.isEmpty() ){
            Node curr = st1.pop();
            st2.push(curr);
            if(curr.left != null) st1.push(curr.left);
            if(curr.right != null) st1.push(curr.right);
        }
        while( !st2.isEmpty() )
            System.out.print(st2.pop().key+" ");
    }

    static void postOrder_(Node root){
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while( !st.isEmpty() || curr != null ){
            while(curr != null){
                st.push(curr);
                st.push(curr); // Push twice
                curr = curr.left;
            }
            curr = st.pop();
            // If the popped node is the same as the top, it's the first time
            // we've seen it; move to the right subtree.
            if( !st.isEmpty() && curr == st.peek() ) /// Process right subtree
            {
                curr = curr.right;
                //if(curr.right != null) st.push(curr.right);
            }
            else {
                System.out.print(curr.key + " ");
                curr = null;
            }
        }
    }

    static void postOrder__(Node root){
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while( !st.isEmpty() || curr != null){
            while(curr != null){
                if(curr.right != null) st.push(curr.right);

                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            if(!st.isEmpty() && curr.right != null && curr.right == st.peek() ){
                st.pop();
                st.push(curr);
                curr = curr.right;
            }
            else{
                System.out.print(curr.key+" ");
                curr = null;
            }
        }
    }

    static void postOrder___(Node root){
        if( root == null ) return;
        Stack<Node> s = new Stack<>();
        Node lastVisited = null;
        while (!s.isEmpty() || root != null) {
            if (root != null) {
                s.push(root);
                root = root.left;
            }
            else {
                Node peekNode = s.peek();
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    root = peekNode.right;
                }
                else {
                    System.out.print(peekNode.key+" ");
                    lastVisited = s.pop();
                }
            }
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
        postOrder(root);
        System.out.println();
        postOrder_(root);
        System.out.println();
        postOrder__(root);
        System.out.println();
        postOrder___(root);
    }
}
