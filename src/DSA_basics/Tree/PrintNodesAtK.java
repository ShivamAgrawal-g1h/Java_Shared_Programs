package DSA_basics.Tree;

class PrintNodesAtK {
    static void KthLevelNodes(Node root, int k){
        if(root == null) return;
        if(k == 0){
            System.out.print(root.key+" ");
            return;
        }
        KthLevelNodes(root.left,k-1);
        KthLevelNodes(root.right,k-1);
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
        KthLevelNodes(root, 2);
    }
}
