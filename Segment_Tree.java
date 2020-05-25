public class Segment_Tree {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, -2, 4, 5 };
        int[] tree = new int[arr.length * 4];
        Tree.buildTree(tree, arr, 1, 0, 5);
        System.out.println(Tree.queryMin(tree, 1, 0, 5, 0, 1));
    }
}

class Tree {
    public static void buildTree(int[] tree, int[] arr, int index, int s, int e) {
        ///For leaf nodes
        if (s == e) {
            tree[index] = arr[s];
            return;
        }
        if (s > e) {
            return;
        }
        //For non-leaf nodes
        int mid = (s + e) / 2;
        //Traversal in tree
        buildTree(tree, arr, 2 * index, s, mid);
        buildTree(tree, arr, 2 * index + 1, mid + 1, e);
        int left = tree[2 * index];
        int right = tree[2 * index + 1];
        //Getting min among 2 of child nodes
        tree[index] = Math.min(left, right);

    }
    public static int queryMin(int[] tree,int index,int s,int e,int qs,int qe){
        ///IF NO OVERLAP
        if(qs>e || qe<s)
            return Integer.MAX_VALUE;//If no overlap return infinity
        ///IF FULL OVERLAP
        if(s>=qs && e<=qe)
            return tree[index];
        //PARTIAL OVERLAP
        int mid=(s+e)/2;
        int leftmin=queryMin(tree, 2*index, s, mid, qs, qe);
        int rmin=queryMin(tree, 2*index+1, mid+1, e, qs, qe);
        return Math.min(leftmin, rmin);
    }
}