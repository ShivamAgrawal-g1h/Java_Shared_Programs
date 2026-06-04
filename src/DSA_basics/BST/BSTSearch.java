package DSA_basics.BST;
class Node{
    int key;
    Node left;
    Node right;
    Node(int key){
        this.key = key;
    }
}
class BSTSearch {
    static boolean search(Node root, int key) {
        //recursive
        // if(root == null) return false;
        // if(root.key == key) return true;
        // else if(root.key > key) return search(root.left,key);
        // else return search(root.right,key);

        Node curr = root;
        while(curr != null){
            if(curr.key == key) return true;
            else if(curr.key > key) curr = curr.left;
            else curr = curr.right;
        }
        return false;
    }
    static void main() {
        // Create the following Binary Search Tree
        //            50
        //          /    \
        //         20     70
        //       /   \      \
        //     10     30     90
        //           /   \
        //         25     40
        Node root = new Node(50);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(10);
        root.left.right = new Node(70);
        root.left.right.left = new Node(25);
        root.left.right.right = new Node(40);
        root.right.right = new Node(90);
        System.out.println(search(root,25));
    }
}
