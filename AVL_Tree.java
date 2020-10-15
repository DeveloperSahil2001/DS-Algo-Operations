import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Node{
 int data;
 Node left,right;
 Node(int data)
 {
  this.data=data;
  right=left=null;
 }
}
class BalancedTree{
 Node root;
 BalancedTree{
    this.root=null;
 }
 Node BinarySearch(Node root,int data)
 {
  if(root==null)
   return null;
  else if(root.data==data)
   return root;
  else if(root.data<data)
  {
   BinarySearch(root.right,data);
  }
  else
  {
   BinarySearch(root.left,data);
  }
 }
}
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
    }
    }
