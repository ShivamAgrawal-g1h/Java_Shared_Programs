package DSA_basics.BST;

class LeastCommonAncestor {
    public Node lowestCommonAncestor(Node root, Node p, Node q) { // O(h) time and aux space both
        if(root.key == p.key || root.key == q.key){
            return root;
        }
        // if((p.val < root.val && q.val > root.val) ||
        //    (p.val > root.val && q.val < root.val) ) return root;
        else if(p.key < root.key && q.key < root.key)
            return lowestCommonAncestor(root.left,p,q);
        else if(p.key > root.key && q.key > root.key)
            return lowestCommonAncestor(root.right,p,q);
        return root;
    }

    public static Node lca(Node root, int n1, int n2) { // O(h) time and O(1) A.S.
        while (root != null) {
            // If both n1 and n2 are smaller than root,
            // then LCA lies in left subtree
            if (root.key > n1 && root.key > n2)
                root = root.left;

                // If both n1 and n2 are greater than root,
                // then LCA lies in the right subtree
            else if (root.key < n1 && root.key < n2)
                root = root.right;

            else break;
        }

        return root;
    }
}
