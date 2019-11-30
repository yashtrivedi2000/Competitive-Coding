//Addition of Node in BST and inOrder traversal in BST.
class BST
{
    Node root=null;
    void insertNode(int key)
    {
        Node newNode=new Node(key);
        if(root==null)
            root=newNode;
        else
        {
            Node focusNode=root;
            Node parent;
            while(true)
            {
                parent=focusNode;//This will help us to backtrack when focusNode would be null.
                if(key<focusNode.key)
                {
                    focusNode=focusNode.leftChild;
                    
                    if(focusNode==null)//If it doesnt have left child
                    {
                        parent.leftChild=newNode;
                        return;
                    }
                }
                else{
                    focusNode=focusNode.rightChild;
                    if(focusNode==null)//If it doesn't have right child
                    {
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }
    }
    void inOrder(Node focusNode)
    {
        if(focusNode!=null)
        {
            inOrder(focusNode.leftChild);
            System.out.print(focusNode);
            inOrder(focusNode.rightChild);
        }
    }
    public static void main(String[] args) {
        BST tree=new BST();
        tree.insertNode(10);
        tree.insertNode(9);
        tree.insertNode(11);
        tree.insertNode(12);
        tree.inOrder(tree.root);
    } 
}
class Node{
    Node leftChild;
    Node rightChild;
    int key;
    Node(int key)
    {
        leftChild=rightChild=null;
        this.key=key;
    }
    public String toString()//This will return key when we print Node
    {
        return key+" ";
    }
}