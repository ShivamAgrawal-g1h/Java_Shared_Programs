package DSA_basics.LinkedList.XORLL;
import java.util.HashMap;

class Node {
    int data;
    int npx; // Store as int, not Node

    Node(int d) {
        data = d;
        npx = 0;
    }
}

class ImplementationAndTraversal {
    // This is our "Memory Address Space"
    static HashMap<Integer, Node> memory = new HashMap<>();

    static int getAddress(Node n) {
        if (n == null) return 0;
        int addr = System.identityHashCode(n);
        memory.put(addr, n); // Keep reference alive so GC doesn't kill it
        return addr;
    }

    static Node dereference(int addr) {
        return memory.get(addr); // Convert the XOR result back to an Object
    }

    static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        // npx = addr(prev) ^ addr(next)
        n1.npx = getAddress(null) ^ getAddress(n2);
        n2.npx = getAddress(n1)   ^ getAddress(n3);
        n3.npx = getAddress(n2)   ^ getAddress(null);

        printLL(n1);
    }

    static void printLL(Node head) {
        int prev = 0;
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");

            int next = prev ^ curr.npx;

            prev = getAddress(curr);
            curr = dereference(next);
        }
    }
}