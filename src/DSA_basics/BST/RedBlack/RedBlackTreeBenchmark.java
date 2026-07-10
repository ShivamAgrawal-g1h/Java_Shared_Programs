package DSA_basics.BST.RedBlack;

import java.util.Random;
import java.util.TreeMap;

class RedBlackTreeBenchmark {
    static void main() {
        final int ELEMENTS = 1_000_000;
        int[] randomData = new int[ELEMENTS];

        Random rand = new Random(100);
        for (int i = 0; i < ELEMENTS; i++) {
            randomData[i] = rand.nextInt(10_000_000);
        }

        System.out.println("====== BENCHMARK: 1,000,000 ELEMENTS ======\n");

        // ----------------------------------------------------
        // TEST 1: RANDOM INSERTIONS
        // ----------------------------------------------------
        System.out.println("[Test 1] Running 1,000,000 Random Insertions...");

        // Java TreeMap
        long startTreeMapRandom = System.nanoTime();
        TreeMap<Integer, Integer> javaMap = new TreeMap<>();
        for (int val : randomData) {
            javaMap.put(val, val);
        }
        long endTreeMapRandom = System.nanoTime();
        double timeJavaRandom = (endTreeMapRandom - startTreeMapRandom) / 1_000_000.0;

        // Your Custom RB Tree
        long startCustomRandom = System.nanoTime();
        Node rootRandom = null;
        for (int val : randomData) {
            rootRandom = Insertion.insertionRB(rootRandom, val);
        }
        long endCustomRandom = System.nanoTime();
        double timeCustomRandom = (endCustomRandom - startCustomRandom) / 1_000_000.0;

        System.out.printf("  -> Java TreeMap:   %.2f ms\n", timeJavaRandom);
        System.out.printf("  -> Our Custom RB: %.2f ms\n\n", timeCustomRandom);

        // ----------------------------------------------------
        // TEST 2: SORTED INSERTIONS (Worst Case for Unbalanced Trees)
        // ----------------------------------------------------
        System.out.println("[Test 2] Running 100,000 Sequential (Sorted) Insertions...");
        final int SORTED_ELEMENTS = 100_000;

        // Java TreeMap
        long startTreeMapSorted = System.nanoTime();
        TreeMap<Integer, Integer> javaMapSorted = new TreeMap<>();
        for (int i = 0; i < SORTED_ELEMENTS; i++) {
            javaMapSorted.put(i, i);
        }
        long endTreeMapSorted = System.nanoTime();
        double timeJavaSorted = (endTreeMapSorted - startTreeMapSorted) / 1_000_000.0;

        // Your Custom RB Tree
        long startCustomSorted = System.nanoTime();
        Node rootSorted = null;
        for (int i = 0; i < SORTED_ELEMENTS; i++) {
            rootSorted = Insertion.insertionRB(rootSorted, i);
        }
        long endCustomSorted = System.nanoTime();
        double timeCustomSorted = (endCustomSorted - startCustomSorted) / 1_000_000.0;

        System.out.printf("  -> Java TreeMap:   %.2f ms\n", timeJavaSorted);
        System.out.printf("  -> Our Custom RB: %.2f ms\n", timeCustomSorted);
        System.out.println("\n===========================================");
    }
}
