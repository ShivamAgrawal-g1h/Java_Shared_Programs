package DSA_basics.Tree;

import java.util.*;

class ZigZag {
    List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root == null) return l;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        boolean flag = true;
        while( !q.isEmpty() ){
            int size = q.size();
            Integer[] currLevel = new Integer[size];
            for(int i = 0; i<size; i++){
                Node curr = q.remove();
                int k = flag ? i : size - 1 - i;
                currLevel[k] = curr.key;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            l.add(Arrays.asList(currLevel));
            flag = !flag;
        }
        return l;
    }

    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null) return al;

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);

        while( !st1.isEmpty() || !st2.isEmpty() ){
            while( !st1.isEmpty() ){
                Node curr = st1.pop();
                al.add(curr.key);
                if(curr.left != null) st2.push(curr.left);
                if(curr.right != null) st2.push(curr.right);
            }
            while( !st2.isEmpty() ){
                Node curr = st2.pop();
                al.add(curr.key);
                if(curr.right != null) st1.push(curr.right);
                if(curr.left != null) st1.push(curr.left);
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
    }
}
