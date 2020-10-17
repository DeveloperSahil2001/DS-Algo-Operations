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

  Node insertNode(Node node, int item) {
    if (node == null)
      return (new Node(item));
    if (item < node.item)
      node.left = insertNode(node.left, item);
    else if (item > node.item)
      node.right = insertNode(node.right, item);
    else
      return node;

    node.height = 1 + max(height(node.left), height(node.right));
    int balanceFactor = getBalanceFactor(node);
    if (balanceFactor > 1) {
      if (item < node.left.item) {
        return rightRotate(node);
      } else if (item > node.left.item) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
      }
    }
    if (balanceFactor < -1) {
      if (item > node.right.item) {
        return leftRotate(node);
      } else if (item < node.right.item) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }
    }
    return node;
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
