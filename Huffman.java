import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;;

public class Huffman {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to compress: ");
        String str = sc.nextLine();
        sc.close();

        HashMap<Character, Integer> hm = getStringHash(str);

        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        for (char ch : hm.keySet()) {
            pq.add(new Node(null, null, hm.get(ch), ch));
        }
        System.out.println(pq);
        while (pq.size() != 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node(left, right, left.freq + right.freq, '\0');
            pq.add(parent);
            System.out.println(pq);
        }
        Huffman_Tree ht = new Huffman_Tree();
        String ans = "";
        ht.inOrder(pq.poll(), ans);
    }

    public static HashMap<Character, Integer> getStringHash(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (hm.containsKey(ch))
                hm.replace(ch, hm.get(ch) + 1);
            else
                hm.put(ch, 1);
        }
        return hm;
    }
}

class Node implements Comparable<Node> {

    @Override
    public String toString() {
        return "Node [freq=" + freq + ", ch=" + ch + "]";
    }

    Node lptr;
    Node rptr;
    int freq;
    char ch;

    Node(Node lptr, Node rptr, int freq, char ch) {
        this.freq = freq;
        this.lptr = lptr;
        this.rptr = rptr;
        this.ch = ch;
    }

    public int compareTo(Node o) {
        int comparedvalue = Integer.compare(this.freq, o.freq);
        return comparedvalue;
    }

    boolean isLeaf() {
        return this.lptr == null && this.rptr == null;
    }
}

class Huffman_Tree {
    void inOrder(Node root, String code) {
        if (!root.isLeaf()) {
            inOrder(root.lptr, code + '0');
            inOrder(root.rptr, code + '1');

        } else
            System.out.println(root.ch + " : " + code);

    }
}
