package DSA_basics.Tree;

import java.util.ArrayList;
import java.util.Stack;

class IterativeInorder_And_Morris {
    static void inOrder(Node root){
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while( !st.isEmpty() || curr != null ){
            while(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            System.out.print(curr.key+" ");
            curr = curr.right;
        }
    }
    static ArrayList<Integer> inOrder_Morris(Node root) {
        ArrayList<Integer> al = new  ArrayList<>();
        if(root == null) return al;

        Node curr = root;
        while(curr != null){
            if(curr.left == null){
                al.add(curr.key);
                curr = curr.right;
            }
            else{
                // find InOrder Predecessor
                Node inP = curr.left;
                while(inP.right != null && inP.right != curr){
                    inP = inP.right;
                }
                if(inP.right == curr){
                    // second vist
                    inP.right = null;
                    al.add(curr.key);
                    curr = curr.right;
                }
                else {
                    inP.right = curr;
                    curr = curr.left;
                }
            }
        }
        return al;
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
        inOrder(root);
        System.out.println();
        ArrayList<Integer> al = inOrder_Morris(root);
        for(int ele : al) System.out.print(ele+" ");
    }
}
