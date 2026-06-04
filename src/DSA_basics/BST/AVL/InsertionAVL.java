package DSA_basics.BST.AVL;
class Node
{
    int key, height;
    Node left, right;
    Node(int x)
    {
        key = x;
        height = 1;
        left = right = null;
    }
}
class InsertionAVL {
    static Node insertToAVL(Node root, int data) {

        if(root == null) return new Node(data);
        else if(root.key > data){
            root.left = insertToAVL(root.left,data);
        }
        else if(root.key < data){
            root.right = insertToAVL(root.right,data);
        }
        else return root;


        int lh = height(root.left);
        int rh = height(root.right);
        root.height = 1 + Math.max(lh, rh);
        int balance = lh - rh;
        if(balance == 2){ //+2 → left heavy
            if(root.left.key > data){ // left left case
                root = rightRotate(root);
            }
            else{ // root.left.data < data // left right case
                root.left = leftRotate(root.left);
                root = rightRotate(root);
            }
        }
        else if(balance == -2){ //-2 → right heavy
            if(root.right.key < data){ // right right case
                root = leftRotate(root);
            }
            else{ // root.right.data > data // right left case
                root.right = rightRotate(root.right);
                root = leftRotate(root);
            }
        }
        return root;
    }
    static int height(Node root){ return root == null ? 0 : root.height; }
    static Node rightRotate(Node curr){
        Node fresh_root = curr.left;
        curr.left = fresh_root.right;
        fresh_root.right = curr;
        // update heights
        curr.height = 1 + Math.max(height(curr.left),
                height(curr.right));
        fresh_root.height = 1 + Math.max(height(fresh_root.left),
                height(fresh_root.right));
        return fresh_root;
    }
    static Node leftRotate(Node curr){
        Node fresh_root = curr.right;
        curr.right = fresh_root.left;
        fresh_root.left = curr;
        // update heights
        curr.height = 1 + Math.max(height(curr.left),
                                    height(curr.right));
        fresh_root.height = 1 + Math.max(height(fresh_root.left),
                                        height(fresh_root.right));
        return fresh_root;
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
        insertToAVL(root,100);
    }
}
