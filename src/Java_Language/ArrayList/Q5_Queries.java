package Java_Language.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Q5_Queries {
    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        A.add(x);
    }
    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n - 1; i++) {
            int current = A.get(i);
            for (int j = i + 1; j < n; j++) {
                int ahead = A.get(j);
                if (ahead < current) {
                    A.set(j, current);
                    A.set(i, ahead);
                    current = ahead;
                }
            }
        }
    }
    public static void reverse_ArrayList(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n / 2; i++) {
            int temp = A.get(n - 1 - i);
            A.set(n - 1 - i, A.get(i));
            A.set(i, temp);
        }
    }
    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        sort_ArrayList_Asc(A);
        reverse_ArrayList(A);
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(List.of(80,70,40,50));
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter number of queries :");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            //System.out.print("\nEnter query : ");
            char query = sc.next().charAt(0);

            if (query == 'a'){
                int val = sc.nextInt();   // real integer
                add_to_ArrayList(al, val);
            }
            else if (query == 'b') sort_ArrayList_Asc(al);
            else if (query == 'c') reverse_ArrayList(al);
            else if (query == 'd') sort_ArrayList_Desc(al);
            else System.out.println("Wrong query input");
        }
        System.out.println(al);
    }
}
/**
package Java_Language.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Q5_Queries {

    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        A.add(x);
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n - 1; i++) {
            int current = A.get(i);
            for (int j = i + 1; j < n; j++) {
                int ahead = A.get(j);
                if (ahead < current) {
                    A.set(j, current);
                    A.set(i, ahead);
                    current = ahead;
                }
            }
        }
    }

    public static void reverse_ArrayList(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n / 2; i++) {
            int temp = A.get(n - 1 - i);
            A.set(n - 1 - i, A.get(i));
            A.set(i, temp);
        }
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        sort_ArrayList_Asc(A);
        reverse_ArrayList(A);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> al = new ArrayList<>(List.of(80, 70, 60, 50, 40));

        int q = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (q-- > 0) {
            char query = st.nextToken().charAt(0);

            if (query == 'a') {
                int val = Integer.parseInt(st.nextToken());
                add_to_ArrayList(al, val);
            }
            else if (query == 'b') {
                sort_ArrayList_Asc(al);
            }
            else if (query == 'c') {
                reverse_ArrayList(al);
            }
            else if (query == 'd') {
                sort_ArrayList_Desc(al);
            }
        }

        System.out.println(al);
    }
}
*/