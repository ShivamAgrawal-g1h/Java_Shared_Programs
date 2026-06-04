package DSA_basics.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class InsertionDeletion {
    static void insert(Node temp, int key) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.remove();
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else q.add(temp.right);
        }
    }
    static void deleteDeepest(Node root, Node d_node) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Do level order traversal until last node
        while(!q.isEmpty()) {
            Node temp = q.remove();

            if (temp.right!=null) {
                if (temp.right == d_node) {
                    temp.right = null;
                    return;
                }
                else q.add(temp.right);
            }

            if (temp.left!=null) {
                if (temp.left == d_node) {
                    temp.left=null;
                    return;
                }
                else q.add(temp.left);
            }
        }
    }

    // Function to delete element in binary tree
    static Node deletion(Node root, int key) {
        if (root == null) return null;
        if (root.left == null && root.right == null) {
            if (root.key == key) return null;
            else return root;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        Node temp = null;
        Node target_node = null;

        // Do level order traversal to find deepest
        // node(temp) and node to be deleted (target_node)
        while (!q.isEmpty()) {
            temp = q.remove();

            if (temp.key == key) target_node = temp;

            if (temp.left!=null)  q.add(temp.left);
            if (temp.right!=null)  q.add(temp.right);
        }

        if (target_node != null) {
            int x = temp.key;
            deleteDeepest(root, temp);
            target_node.key = x;
        }
        return root;
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
        ArrayList<Integer> al = inOrder_Morris(root);
        for(int ele : al) System.out.print(ele+" ");
        insert(root,100);
        System.out.println();

        al = inOrder_Morris(root);
        for(int ele : al) System.out.print(ele+" ");
        System.out.println();

        root = deletion(root,100);
        al = inOrder_Morris(root);
        for(int ele : al) System.out.print(ele+" ");
    }
}
