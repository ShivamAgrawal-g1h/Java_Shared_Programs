package DSA_basics.Tree;

class Node{
    int key;
    Node left;
    Node right;
    Node(int data){
        key = data;
    }
}
class Implementation {
    static void main() {
        // empty tree => root = null;

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
    }
}
