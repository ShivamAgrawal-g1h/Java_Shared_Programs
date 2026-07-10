package DSA_basics.BST.RedBlack;

/**
 * Like Insertion, recoloring and rotations are used to maintain the Red-Black properties.
 * In the insert operation, we check the color of the uncle to decide the appropriate case.
 * In the delete operation, we check the color of the sibling to decide the appropriate case.
 *
 * The main property that violates after insertion is two consecutive reds.
 * In delete, the main violated property is, change of black height in subtrees as
 * deletion of a black node may cause reduced black height in one root to leaf path.
 *
 * Here are the steps involved in deleting a node in a red-black tree:
 * 1. If the node to be deleted has no children, simply remove it and update the parent node.
 * 2. If the node to be deleted has only one child, replace the node with its child.
 * 3. If the node to be deleted has two children, then replace the node with its in-order successor,
 *    which is the leftmost node in the right subtree. Then delete the in-order successor node as if it has at most one child.
 * 4. After the node is deleted, the red-black properties might be violated.
 *    To restore these properties, some color changes and rotations are performed on the nodes in the tree.
 *    The changes are similar to those performed during insertion, but with different conditions.
 * 5. The deletion operation in a red-black tree takes O(log n) time on average, making it a good choice for searching and deleting elements in large data sets.
 *
 *
 *  (v - parent of u)
 *  Simple Case: If either u or v is red, we mark the replaced child as black (No change in black height).
 *  Note that both u and v cannot be red as v is parent of u and two consecutive reds are not allowed in red-black tree.
 *
 *  If Both u and v are Black.
 * 3.1) Color u as double black.  Now our task reduces to convert this double black to single black.
 * Note that If v is leaf, then u is NULL and color of NULL is considered black. So the deletion of a black leaf also causes a double black.
 *
 * 3.2) Do following while the current node u is double black, and it is not the root. Let sibling of node be s.
 * ....(a): If sibling s is black and at least one of sibling's children is red, perform rotation(s). Let the red child of s be r. This case can be divided in four subcases depending upon positions of s and r.
 * ..............(i) Left Left Case (s is left child of its parent and r is left child of s or both children of s are red). This is mirror of right right case shown in below diagram.
 * ..............(ii) Left Right Case (s is left child of its parent and r is right child). This is mirror of right left case shown in below diagram.
 * ..............(iii) Right Right Case (s is right child of its parent and r is right child of s or both children of s are red)
 *
 * .....(b): If sibling is black and its both children are black, perform recoloring, and recur for the parent if parent is black.
 * In this case, if parent was red, then we didn't need to recur for parent, we can simply make it black (red + double black = single black)
 *
 * .....(c): If sibling is red, perform a rotation to move old sibling up, recolor the old sibling and parent. The new sibling is always black (See the below diagram). This mainly converts the tree to black sibling case (by rotation) and leads to case (a) or (b). This case can be divided in two subcases.
 * ..............(i) Left Case (s is left child of its parent). This is mirror of right right case shown in below diagram. We right rotate the parent p.
 * ..............(ii) Right Case (s is right child of its parent). We left rotate the parent p.
 *
 * 3.3) If u is root, make it single black and return (Black height of complete tree reduces by 1).
 *
 *
 * https://share.google/aimode/kDDh7wEOuO5QAYbcg
 */
class DeletionRB {
    static void deletionRB(Node root, int data){
    }
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
/*
🧱 Step 1: The BST Deletion FrameworkBefore fixing colors, perform a standard BST deletion. We need to track two things:u:
 The node actually unlinked/removed from the tree.x: The child that replaces u (can be null).java// Conceptual flow inside deleteNode method:
Node u = nodeToBeDeleted;
char originalColor = u.color;
Node x;

if (u.left == null) {
    x = u.right;
    rbTransplant(u, u.right);
} else if (u.right == null) {
    x = u.left;
    rbTransplant(u, u.left);
} else {
    // Two children: find successor
    Node y = getMinimum(u.right);
    originalColor = y.color;
    x = y.right; // Successor can only have a right child

    if (y.parent == u) {
        if (x != null) x.parent = y;
    } else {
        rbTransplant(y, y.right);
        y.right = u.right;
        y.right.parent = y;
    }
    rbTransplant(u, y);
    y.left = u.left;
    y.left.parent = y;
    y.color = u.color;
}

// IF THE DELETED/MOVED NODE WAS BLACK -> FIX VIOLATIONS
if (originalColor == 'B') {
    root = fixDeletionViolations(root, x, xParentBackup);
}
Use code with caution.Note:
Because x can be null, you must track its parent separately (xParentBackup) to navigate the tree during fixups.
🚦 Step 2: The 4 Deletion Fix-Up Cases (Left Side)We loop while x is not the root AND x is Black (or null).
Let s be the sibling of x.Case 1: Sibling s is RedCondition: s.color == 'R'Action:Recolor s to Black.Recolor x.parent
to Red.Left-Rotate around x.parent.Update s to be the new right child of x.parent.Goal: Pushes the Red node
out of the way to turn this into Case 2, 3, or 4.Case 2: Sibling s is Black, and
BOTH its children are BlackCondition: (s.left == null || s.left.color == 'B') && (s.right == null || s.right.color == 'B')
Action:Recolor s to Red.Move x up to its parent (x = x.parent).Goal: Pulls one layer of blackness from both paths,
transferring the double black up.Case 3: Sibling s is Black, s.right is Black, but s.left is
RedCondition: (s.right == null || s.right.color == 'B') && (s.left != null && s.left.color == 'R')
Action:Recolor s.left to Black.Recolor s to Red.Right-Rotate around s.Update s to be the new
right child of x.parent.Goal: Transforms the tree structural setup directly into
 Case 4.Case 4: Sibling s is Black, and its FAR child (s.right) is RedCondition: (s.right != null && s.right.color == 'R')
 Action:Copy x.parent.color onto s.Recolor x.parent to Black.Recolor s.right to Black.Left-Rotate around x.parent.
 Set x = root to break the loop.Goal: Completely dissolves the double black state.


 🪞 Case B: Mirror Image (Right Side)If x is the right child of its parent, reverse all operations:
 Left rotations become right rotations.s = x.parent.left.Near child is s.right, far child is s.left.
 */
