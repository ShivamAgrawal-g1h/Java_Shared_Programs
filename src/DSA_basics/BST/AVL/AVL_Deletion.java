package DSA_basics.BST.AVL;

class AVL_Deletion {
    static Node deleteNode(Node root, int key) {
        if(root == null) return null;
        else if(root.key == key){
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                Node succ = root.right;
                while(succ.left != null) succ = succ.left;
                root.key = succ.key;
                root.right = deleteNode(root.right, succ.key);
            }
        }
        else if(root.key > key)
            root.left = deleteNode(root.left,key);
        else
            root.right = deleteNode(root.right,key);

        if(root == null) return null;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = height(root.left) - height(root.right);

        if(balance > 1 && getBalance(root.left)>=0)
            root = rightRotate(root);
        else if(balance > 1 && getBalance(root.left)<0){
            root.left = leftRotate(root.left);
            root = rightRotate(root);
        }
        else if(balance < -1 && getBalance(root.right) <= 0)
            root = leftRotate(root);
        else if(balance < -1 && getBalance(root.right) > 0){
            root.right = rightRotate(root.right);
            root = leftRotate(root);
        }
        return root;
    }
    static int height(Node curr){
        return curr == null ? 0 : curr.height;
    }
    static Node rightRotate(Node curr){
        Node fresh_root = curr.left;
        curr.left = fresh_root.right;
        fresh_root.right = curr;
        //
        curr.height = 1 + Math.max(height(curr.left), height(curr.right));
        fresh_root.height = 1 + Math.max(height(fresh_root.left), height(fresh_root.right));
        return fresh_root;
    }
    static Node leftRotate(Node curr){
        Node fresh_root = curr.right;
        curr.right = fresh_root.left;
        fresh_root.left = curr;
        //
        curr.height = 1 + Math.max(height(curr.left), height(curr.right));

        fresh_root.height = 1 + Math.max(height(fresh_root.left), height(fresh_root.right));
        return fresh_root;
    }
    // Get Balance factor of node curr
    static int getBalance(Node curr) {
        if (curr == null)
            return 0;
        return height(curr.left) - height(curr.right);
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
