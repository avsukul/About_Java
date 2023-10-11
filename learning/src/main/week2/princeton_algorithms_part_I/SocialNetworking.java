package main.week2.princeton_algorithms_part_I;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class SocialNetworking {

    private int[] parent;
    private int[] size;
    private int count;

    SocialNetworking(int n) {
        count = n;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;

        // make smaller tree point to larger tree
        if (size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        count--;
    }

    public int find(int p) {
        validate(p);
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    private void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }

    public int count() {
        return count;
    }

    public static void main(String[] args) {
        // Read from standard input.
        if (!StdIn.isEmpty()) {
            // Read number of elements.
            int n = StdIn.readInt();
            // Initialize an empty union.
            SocialNetworking sn = new SocialNetworking(n);
            String date, time;
            while (!StdIn.isEmpty()) {
                int p = StdIn.readInt();
                int q = StdIn.readInt();
                date = StdIn.readString();
                time = StdIn.readString();
                // Merges the set containing elements p with q.
                sn.union(p, q);
                // printer to standard output.
                StdOut.println("["+p+","+q+"]");
                // If number of sets equal 1 then all members are connected.
                if(sn.count() == 1){
                    StdOut.println("All members were connected at: " + date + time);
                    break;
                }
            }
        }
    }
}

class UnionFindWLargest {

    private int[] parent;
    private int[] size;
    private int[] big;

    UnionFindWLargest(int n) {
        this.parent = new int[n];
        this.size = new int[n];
        this.big = new int[n];
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
            size[i] = 1;
            big[i] = i;
        }
    }
    int find(int p) {
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return big[p];
    }

    boolean connected(int p, int q) {
        // Returns true if the two elements are in the same set.
        return (find(p) == find(q));
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);

        if (rootP == rootQ) return;

        int bigP = big[rootP];
        int bigQ = big[rootQ];

        // make smaller root point to larger one
        if (size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
            if(bigP > bigQ) {
                big[rootQ] = bigP;
            }
        }
        else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
            if(bigQ > bigP) {
                big[rootP] = bigQ;
            }
        }
    }
}



class SuccessorWDelete {

    private int[] parent;
    private int count;

    public SuccessorWDelete(int n) {
        this.count = n;
        this.parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void removeUnion(int x) {
        union(x, x+1);
    }

    public void union(int p, int q) {
        int pID = parent[p];
        int qID = parent[q];

        // p and q are already in the same component
        if (pID == qID) return;

        for (int i = 0; i < parent.length; i++)
            if (parent[i] == pID) parent[i] = qID;
        count--;
    }
    public int successor(int x) {
        return find(x);
    }

    public int find(int p) {
        return parent[p];
    }
    public static void main(String[] args) {
        SuccessorWDelete swd = new SuccessorWDelete(50);
        System.out.println(swd.successor(10));
        swd.removeUnion(11);
        swd.removeUnion(13);
        swd.removeUnion(12);
        swd.removeUnion(10);
        swd.removeUnion(9);
        swd.removeUnion(15);
        System.out.println(swd.successor(8));
        System.out.println(swd.successor(9));
        System.out.println(swd.successor(10));
    }
}