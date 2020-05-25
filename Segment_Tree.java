public class Segment_Tree {
        public static void main(String[] args) {
            int[] arr={1,3,2,-2,4,5};
            int[] tree=new int[arr.length*4];
            Tree.buildTree(tree,arr,1,0,5);
            for(int i=0;i<tree.length;i++){
                System.out.println(tree[i]);
            }
        }
}

class Tree{
    public static void buildTree(int[] tree,int[] arr,int index,int s,int e){
            if(s==e){
                    tree[index]=arr[s];
                    return;
            }
            if(s>e){
                return;
            }
            int mid=(s+e)/2;
            buildTree(tree,arr,2*index,s,mid);
            buildTree(tree,arr,2*index+1,mid+1,e);
            int left=tree[2*index];
            int right=tree[2*index+1];
            tree[index]=Math.min(left,right);

        }
}