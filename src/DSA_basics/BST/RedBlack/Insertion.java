package DSA_basics.BST.RedBlack;

class Node
{
    int key, height;
    Node left, right;
    char color;
    Node parent;
    Node(int x)
    {
        key = x;
        height = 1;
        left = right = null;
        color = 'R'; // Rule : all new nodes are red
        this.parent = null; // required at time of rechecking.
    }
}
class Insertion {
    static Node newlyInsertedNode;
    static Node insertionRB(Node root, int data) {
        newlyInsertedNode = null;
        if (root == null) {
            Node temp = new Node(data);
            temp.color = 'B'; // colour of root is always black
            return temp;
        }
        root = bstInsert(root, data, null);

        if (newlyInsertedNode != null) {
            root = fixViolations(root, newlyInsertedNode);
        }

        if (root != null) {
            root.color = 'B'; // Defensive guard rule
        }
        return root;
    }
    static Node bstInsert(Node root, int data,Node parent){
        if(root == null){
            newlyInsertedNode = new Node(data);
            newlyInsertedNode.parent = parent;
            return newlyInsertedNode;
        }
        if(root.key > data){
            root.left = bstInsert(root.left, data, root);
        }
        else if(root.key < data){
            root.right = bstInsert(root.right, data, root);
        }
        return root;
    }
    static Node fixViolations(Node root, Node z){
        while(z != null && z.parent != null && z.parent.color == 'R'){
            Node grandParent = z.parent.parent;
            if(grandParent == null) break;

            Node uncle;
            // ====================================================
            // CASE A: PARENT IS LEFT CHILD OF GRANDPARENT
            // ====================================================
            if(grandParent.left == z.parent){
                uncle = grandParent.right;

                // Case 2.1: Uncle is Red -> Recolor only
                if(uncle != null && uncle.color == 'R'){
                    uncle.color = 'B';
                    z.parent.color = 'B';
                    grandParent.color = 'R';
                    z = grandParent;
                }
                // Case 2.2: Uncle is Black or Null -> Rotations required
                else {
                    if(z == z.parent.right){
                        // LR case
                        z = z.parent;
                        leftRotate(z); // Changes tree structure to an LL case
                    }

                    // LL case --> Recolor and Right Rotate Grandparent
                    z.parent.color = 'B';
                    grandParent.color = 'R';
                    Node newSubRoot = rightRotate(grandParent);

                    if(grandParent == root){
                        root = newSubRoot;
                    }
                }

            }
            // ====================================================
            // CASE B: PARENT IS RIGHT CHILD OF GRANDPARENT (Mirror Image)
            // ====================================================
            else{
                uncle = grandParent.left;

                // Case 2.1: Uncle is Red -> Recolor only
                if(uncle != null && uncle.color == 'R'){
                    uncle.color = 'B';
                    z.parent.color = 'B';
                    grandParent.color = 'R';
                    z = grandParent;
                }
                // Case 2.2: Uncle is Black or Null -> Rotations required
                else {
                    if(z == z.parent.left){
                        // RL case
                        z = z.parent;
                        rightRotate(z);
                    }

                    // RR case --> Recolor and Left Rotate Grandparent
                    z.parent.color = 'B';
                    grandParent.color = 'R';
                    Node newSubRoot = leftRotate(grandParent);

                    if(root == grandParent){
                        root = newSubRoot;
                    }
                }

            }

        }
        return root;
    }
    // tools
    static Node leftRotate(Node y){
        Node x = y.right;

        if(y.parent != null){
            if(y == y.parent.left) y.parent.left = x;
            else y.parent.right = x;
        }
        x.parent = y.parent;
        y.parent = x;
        if(x.left != null){
            x.left.parent = y;
        }

        y.right = x.left;
        x.left = y;
        return x;
    }
    static Node rightRotate(Node x){
        Node y = x.left;

        if(x.parent != null){
            if(x == x.parent.left) x.parent.left = y;
            else x.parent.right = y;
        }
        y.parent = x.parent;
        x.parent = y;
        if(y.right != null){
            y.right.parent = x;
        }


        x.left = y.right;
        y.right = x;

        return y;
    }
    static void main() {
    }
}
