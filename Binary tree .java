import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class bst
{
    Node root;
    
    public void addChild(int data)
    {
        root  = addChildRec(root,data);
    }
    public Node addChildRec(Node curr , int data)
    {
        if(curr == null)
        {
            return new Node(data);
        }
        
        if(data <curr.data)
        {
            curr.left = addChildRec(curr.left, data);
        }
        else if(data > curr.data)
        {
            curr.right = addChildRec(curr.right , data);
        }
    return curr;
    }
    
}

public class BinaryTree
{
    public static void  main(String args[])
    {
        bst bt = new bst();
        Scanner obj = new Scanner(System.in);
        while(true)
        {
            int n = obj.nextInt();
            if(n==-1) break;
            bt.addChild(n);
        }
        System.out.println(bt.root.data);
        System.out.println(bt.root.left.data);
    }
}
