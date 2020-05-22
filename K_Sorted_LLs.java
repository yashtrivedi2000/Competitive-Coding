/**
 * K_Sorted_LLs
 */
public class K_Sorted_LLs {

    public static void main(String[] args) {
        Node2 M=new Node2(1,new Node2(4,new Node2(6)));
        Node2 N=new Node2(2,new Node2(3,new Node2(5)));
        Node2 arr[]=new Node2[2];
        arr[0]=M;
        arr[1]=N;
        Node2 ans=LinkedList1.mainMerge(arr, arr.length-1);
        LinkedList1.Print(ans);
    }
}

class LinkedList1 {
    static Node2 mainMerge(Node2 nodes[], int limit) {
        while (limit != 0) {
            int i = 0;
            int j = limit;
            while (i < j) {
                nodes[i] = merge(nodes[i++], nodes[j--]);
                if (i >= j)
                    limit = j;
            }
        }

        return nodes[0];
    }

    static Node2 merge(Node2 n1, Node2 n2) {
        Node2 head = null;
        if (n1 == null)
            return n2;
        else if (n2 == null)
            return n1;
        if (n1.val < n2.val) {
            head = n1;
            head.next = merge(n1.next, n2);
        } else {
            head = n2;
            head.next = merge(n1, n2.next);
        }
        return head;
    }

    static void Print(Node2 head){
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
}

class Node2 {
    int val;
    Node2 next;

    Node2(int val) {
        this.val = val;
    }

    Node2(int val, Node2 next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return val + "";
    }
}