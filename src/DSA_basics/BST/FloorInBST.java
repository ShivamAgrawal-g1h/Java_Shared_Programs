package DSA_basics.BST;
class FloorInBST {
    int findFloor(Node root, int k) { // T.C. = O(h) , A.S. = O(h)
        if(root == null) return -1;
        if(root.key == k) return root.key;
        else if(root.key > k) return findFloor(root.left,k);
        else{ // root.data < k
            if(root.right == null) return root.key;
            else if(root.right.key > k){ // right child too large
                // right child > k
                // BUT
                // right child's LEFT subtree may still contain valid floors
                int left = findFloor(root.right.left,k);
                return  left == -1 ? root.key : left;
            }
            return findFloor(root.right,k);
        }
    }
    int findFloor__(Node root, int k) { // T.C. = O(h) , A.S. = O(h)
        if(root == null) return -1;
        else if(root.key == k) return root.key;
        else if(root.key > k) return findFloor__(root.left,k);
        else{
            if(root.right == null) return root.key;
                // else right child is present
            else{
                int right = findFloor__(root.right,k);
                return right == -1 ? root.key : right;
            }
        }
    }
    int findFloor_itr(Node root, int k) { // T.C. = O(h) going across the height, A.S. = O(1)
        int floor = -1;
        Node curr = root;
        while(curr != null){
            if(curr.key == k){
                floor = k;
                break;
            }
            else if(curr.key > k){
                curr = curr.left;
            }
            else { // curr.data < k
                floor = curr.key; // mark potential floor
                curr = curr.right;
            }
        }
        return floor;
    }
}
