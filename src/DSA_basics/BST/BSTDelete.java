package DSA_basics.BST;

class BSTDelete {
    Node delNode(Node root, int x) { // T.C. = O(h) & A.S. = O(h)
        if(root == null) return null;

        else if(root.key == x){
            if(root.left == null && root.right == null)
                return null;
            else if(root.left == null || root.right == null)
                return root.left == null ? root.right : root.left;
            Node curr = root.right;
            while(curr.left != null) curr = curr.left;
            root.key = curr.key;
            root.right = delNode(root.right,root.key);
        }

        else if(root.key > x) root.left = delNode(root.left,x);

        else root.right = delNode(root.right,x);
        return root;
    }

    Node delNode_itr(Node root, int x) {
        if(root == null) return null;
        if(root.left == null && root.right == null && root.key == x) return null;

        Node curr = root;
        while(curr != null && curr.key != x){
            /// if(curr.data == x) break; Not needed as while loop condition already checks for it
            if(curr.key > x) curr = curr.left;
            else curr = curr.right;
        }
        // curr is null or curr.key is x;
        if(curr == null) return root;

        else{  // (curr.key == x)
            if(curr.left == null && curr.right == null){ // curr is leaf
                Node parent = root;
                while(parent.left != curr && parent.right != curr){
                    if(parent.key > x) parent = parent.left;
                    else parent = parent.right;
                }
                if(parent.left == curr) parent.left = null;
                else parent.right = null;
            }

            else if(curr.left == null){         // 1
                curr.key = curr.right.key;      // 2
                Node singleChild = curr.right;  // 3
                curr.left = singleChild.left;   // 4
                curr.right = singleChild.right; // 5
            }                                   // 6
            else if(curr.right == null){        // 7
                curr.key = curr.left.key;       // 8
                Node singleChild = curr.left;   // 9
                curr.right = singleChild.right; // 10
                curr.left = singleChild.left;   // 11
            }                                   // 12

            // above 12 line can be replaced by :
//            else if(curr.left == null || curr.right == null){
//                Node singleChild = curr.right == null ? curr.left : curr.right;
//                curr.key = singleChild.key;
//                curr.left = singleChild.left;
//                curr.right = singleChild.right;
//            }

            else{
                Node succ = curr.right;
                while(succ.left != null) succ = succ.left;
                curr.key = succ.key;
                // delete succ
                if(succ == curr.right){
                    curr.right = succ.right;
                }
                else {
                    succ = curr.right;
                    while(succ.left.key != curr.key) succ = succ.left;
                    succ.left = succ.left.right;
                }
            }

        }
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
    }
}
