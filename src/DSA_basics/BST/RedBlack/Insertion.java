package DSA_basics.BST.RedBlack;

import java.util.TreeMap;
import java.util.TreeSet;

/*
1. The Sentinel Pattern (Best Practice)
Most standard implementations use a Sentinel Node—a single, shared dummy object that represents all leaf (NIL) nodes.
How it works:
Instead of using Java's null, you create a special instance of your Node class called
T.nil.Attributes: This sentinel node is explicitly colored black and its left and
right children often point back to itself.
Benefit: You can treat every leaf like a real node object, allowing you to safely call
node.left.color without triggering a NullPointerException.



2. The Logic Wrapper (Simple Approach)
If you prefer using actual Java null references to save memory,
you must handle the color property through logic rather than a field value.How it works:
You write a helper method to check a node's color.
The Logic:

public boolean isBlack(Node node) {
    // If the reference is null, it's a leaf, and leaves are ALWAYS black.
    if (node == null) return true;
    return node.color == BLACK;
}

 */
class Node
{
    int key, height;
    Node left, right;
    char color;
    Node(int x)
    {
        key = x;
        height = 1;
        left = right = null;
        color = 'R';
    }
}
class Insertion {
    static Node insertionRB(Node root, int data){
        if(root == null) return new Node(data);
        else if(root.key > data)
            root.left = insertionRB(root.left,data);
        else if(root.key < data)
            root.right = insertionRB(root.right,data);
        else return root;

    }
    static void main() {
    }
}
