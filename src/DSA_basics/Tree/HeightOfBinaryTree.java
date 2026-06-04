package DSA_basics.Tree;

import java.util.LinkedList;
import java.util.Queue;

class HeightOfBinaryTree {
    static int height(Node root){
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
    static int height_itr( Node root){
        if(root == null) return 0;
        int depth = 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null); //Pushing first level element along with null

        while(!q.isEmpty()){
            Node temp = q.remove();
            if(temp == null) // A full level has been traversed
                depth++;

            if(temp != null){ //If null not encountered, keep moving
                if(temp.left!=null)  q.add(temp.left);
                if(temp.right!=null)  q.add(temp.right);
            }
            if(temp == null && !q.isEmpty()) // More levels still remain, so mark next level end too
                q.add(null);
        }

        return depth;
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
        System.out.println(height(root));
        System.out.println(height_itr(root));
        System.out.println(height_itr(null));
    }
}
