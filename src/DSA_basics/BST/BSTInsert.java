package DSA_basics.BST;

class BSTInsert {
    static Node insert(Node root, int key) {
        if(root == null) return new Node(key);
        else if(root.key == key) return root; // Duplicate check
        else if(root.key > key) root.left = insert(root.left,key);
        else root.right = insert(root.right,key);
        return root;
    }
    public Node insert_(Node root, int key) {
        if(root == null) return new Node(key);
        Node curr = root;
        Node parent = null;
        while(curr != null){
            parent = curr;
            if(curr.key == key)
                return root;
            else if(curr.key > key)
                curr = curr.left;
            else
                curr = curr.right;
        }
        if(parent.key > key)
            parent.left = new Node(key);
        else
            parent.right = new Node(key);
        return root;
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
        System.out.println(root == insert(root,25));
        System.out.println(root == insert(root,25));
    }
}
