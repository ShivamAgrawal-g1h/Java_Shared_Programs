package DSA_basics.BST;

class CeilInBST {
    int findCeil(Node root, int x) {
        if(root == null) return -1;
        else if(root.key == x) return x;
        else if(root.key < x) return findCeil(root.right,x);
        else{ // root.data > x
            if(root.left == null) return root.key;
                // else left child is there
            else{
                int left = findCeil(root.left,x);
                return left == -1 ? root.key : left;
            }
        }
    }
    int findCeil__(Node root, int x) {
        if(root == null) return -1;
        else if(root.key == x) return x;
        else if(root.key < x) return findCeil__(root.right,x);
        else{ // root.data > x
            if(root.left == null) return root.key;
            else if(root.left.key < x){ // left child too small
                int right = findCeil__(root.left.right,x);
                return right == -1 ? root.key : right;
            }
            return findCeil__(root.left,x);
        }
    }
    int findCeil_(Node root, int x) { // O(h) time and O(1) A.S.
        int ceil = -1;
        while(root != null){
            if(root.key == x){
                ceil = root.key;
                break;
            }
            else if(root.key < x)
                root = root.right;
            else{
                ceil = root.key;
                root = root.left;
            }
        }
        return ceil;
    }
}
