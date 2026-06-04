package DSA_basics.Tree;

class DepthFirstTraversals {
    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);

        System.out.print(root.key+" ");

        inorder(root.right);
    }
    static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.key+" ");

        preorder(root.left);

        preorder(root.right);
    }
    static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);

        postorder(root.right);

        System.out.print(root.key+" ");

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
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
}
