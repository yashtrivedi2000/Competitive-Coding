import java.util.Scanner;

//Addition of Node in BST and inOrder traversal in BST.
class BST {
    Node root = null;

    void insertNode(int key) {
        Node newNode = new Node(key);
        if (root == null)
            root = newNode;
        else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;// This will help us to backtrack when focusNode would be null.
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;

                    if (focusNode == null)// If it doesnt have left child
                    {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null)// If it doesn't have right child
                    {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    void inOrder(Node focusNode) {
        if (focusNode != null) {
            inOrder(focusNode.leftChild);
            System.out.print(focusNode);
            inOrder(focusNode.rightChild);
        }
    }

    Node LCA(Node root, int n1, int n2) {
        if (root == null)
            return null;
        if ((n1 < root.key && n2 > root.key) || (n1 > root.key && n2 < root.key)) {
            return root;
        }
        if (root.key == n1 || root.key == n2)
            return root;
        if (n1 > root.key && n2 > root.key) {
            if (root.rightChild != null)
                return LCA(root.rightChild, n1, n2);
            else
                return root;
        } else {
            if (root.leftChild != null)
                return LCA(root.leftChild, n1, n2);
            else
                return root;
        }

    }

    public static void main(String[] args) {
        BST tree = new BST();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of nodes: ");
        int num=sc.nextInt();
        for (int i = 0; i < num; i++) {
            tree.insertNode(sc.nextInt());
        }
        tree.inOrder(tree.root);
        System.out.println("\n"+"Enter 2 nodes to find LCA: ");
        int n1=sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("\n"+"LCA is: "+tree.LCA(tree.root, n1, n2));
        sc.close();
    }
}

class Node {
    Node leftChild;
    Node rightChild;
    int key;

    Node(int key) {
        leftChild = rightChild = null;
        this.key = key;
    }

    public String toString()// This will return key when we print Node
    {
        return key + " ";
    }
}