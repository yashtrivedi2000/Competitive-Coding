class Node//This will generate a node for us
{
    int data;
    Node ptr;
    Node(int data)//This constructor will provide our value to data and set our pointer default by null. 
    {
        this.data=data;
        ptr=null;
    }
}
//Below class will have all the methods we need to manupilate LL
class LL 
{
    Node head=null,LastNode=null;//Last Node is an extra node that will help us to directly reach to our last node. 
    void addLast(int data)//Will add the node at last with O(n) time
    {
        Node N=new Node(data);
        if(head==null)
        {
            head=N;
            LastNode=head;
        }
        else
        {
            LastNode.ptr=N;
            LastNode=N;
        }
               
    }
    void addFirst(int data)//Will add the node at the beginnng of the LL.
    {
        Node N=new Node(data);
        if(head==null)
        {
            head=N;
            LastNode=head;
        }
        else
        {
            N.ptr=head;
            head=N;
        }
    }
    void printList()// To print entire list
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.ptr;
        }
            
    }
}
class LinkedList
{
    public static void main(String[] args) {
        LL l1=new LL();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addFirst(0);
        l1.printList();
    }
}