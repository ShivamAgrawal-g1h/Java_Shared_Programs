package DSA_basics.BST.RedBlack;
// This is JUnit file to test the Insertion method of RB Tree
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class RedBlackTree_Insertion_Test {

    @Test
    void testMassiveFuzzingStressTest() {
        Node root = null;
        Random rand = new Random(42); // Fixed seed for reproducible test runs

        System.out.println("Starting 10,000 random insertions stress test...");

        for (int i = 0; i < 10000; i++) {
            int randomValue = rand.nextInt(100000);
            root = Insertion.insertionRB(root, randomValue);

            // Validate the structural invariants after every single insertion
            assertTrue(isValidRedBlackTree(root), "Tree properties broken at insertion counter: " + i);
        }

        // Final structural checks
        assertNotNull(root);
        assertEquals('B', root.color, "Root node must always be BLACK!");
        System.out.println("Success! Passed 10,000 insertions without violating Red-Black invariants.");
    }

    @Test
    void testConsecutiveSortedInsertions() {
        Node root = null;

        // Forces continuous left/right rotations and deep color recoloring shifts
        for (int i = 1; i <= 500; i++) {
            root = Insertion.insertionRB(root, i);
            assertTrue(isValidRedBlackTree(root), "Broken during consecutive sorted insertion of value: " + i);
        }
        assertEquals('B', root.color);
    }

    // Comprehensive automated property validator (The Local Online Judge)
    private boolean isValidRedBlackTree(Node node) {
        if (node == null) return true;

        // Rule 1: No consecutive Red nodes allowed
        if (node.color == 'R') {
            if ((node.left != null && node.left.color == 'R') ||
                    (node.right != null && node.right.color == 'R')) {
                System.out.println("Invariant Violation: Consecutive RED nodes found near key: " + node.key);
                return false;
            }
        }

        // Rule 2: Binary Search Tree ordering validation
        if (node.left != null && node.left.key >= node.key) {
            System.out.println("BST Violation: Left child " + node.left.key + " is >= parent " + node.key);
            return false;
        }
        if (node.right != null && node.right.key <= node.key) {
            System.out.println("BST Violation: Right child " + node.right.key + " is <= parent " + node.key);
            return false;
        }

        // Rule 3: Balance check (Black heights must perfectly match down all paths)
        return checkBlackHeight(node) != -1;
    }

    private int checkBlackHeight(Node node) {
        if (node == null) return 1; // Leaf nodes (null pointers) count as BLACK

        int leftHeight = checkBlackHeight(node.left);
        int rightHeight = checkBlackHeight(node.right);

        // If an underlying subtree failed or height mismatches exist, bubble up the error code
        if (leftHeight == -1 || rightHeight == -1 || leftHeight != rightHeight) {
            return -1;
        }

        // Increment count only if this current node is Black
        return leftHeight + (node.color == 'B' ? 1 : 0);
    }
}
