import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Node{
 int data,height;
 Node left,right;
 Node(int data)
 {
  this.data=data;
  height=1;
 }
}

class AVL_tree{
    Node root;
    int height(Node node)
    {
     if(node==null)
      return 0;
     return node.height;
    }

    int max(int a,int b)
    {
     return (a>b)?a:b;
    }

    Node rotate_right(Node node)
    {
     Node x=node.left;
     Node temp=x.right;
     x.right=node;
     node.left=temp;
     node.height=max(node.left,node.right)+1;
     x.height=max(x.left,x.right)+1;
     return x;
    }

    Node rotate_left(Node node)
    {
     Node x=node.right;
     Node temp=x.left;
     x.left=node;
     node.right=temp;
     node.height=max(node.left,node.right)+1;
     x.height=max(x.left,x.right)+1;
     return x;
    }

    int getBalanceFactor(Node node) {
    if (node==null)
      return 0;
    return height(node.left)-height(node.right);
   }

   void preOrder(Node node) {
    if (node != null) {
      System.out.print(node.data + " ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }
}

class Main
{
    public static void main(String[] args)
    {
     
    }
}
