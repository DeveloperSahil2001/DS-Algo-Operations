import java.util.Scanner;
import java.util.*;
class Node{
 int data;
 Node right,left;
 Node(int data)
 {
  this.data=data;
  left=right=null;
 }
}
class BinarySearchTree
{
 Node root;
 BinarySearchTree()
 {
  root=null;
 }

 void insert(int data) { 
    root = insertRec(root, data); 
 } 

 Node insertRec(Node root,int data)
 {
  if(root==null)
   return new Node(data);
  if(root.data>data)
  {
   root.left=insertRec(root.left,data);
  }
  else if(root.data<data)
  {
    root.right=insertRec(root.right,data);
  }
  return root;
 }
 void InOrder()
 {
  InOrderRec(root);
 }
 void InOrderRec(Node root)
 {
  if(root==null)
   return;
  InOrderRec(root.left);
  System.out.print(root.data+" ");
  InOrderRec(root.right);
 }

 void LevelOrder()
 {
  LevelOrderRec(root);
 }

 void LevelOrderRec(Node root)
 {
  if(root==null)
   return;
  Queue<Node> q=new LinkedList<>();
  q.add(root);
  q.add(null);
  while(q.size()!=0)
  {
   Node curr=q.poll();
   if(curr==null)
   {
    if(q.size()!=0)
     q.add(null);
   }
   else
   {
    if(curr.left!=null)
     q.add(curr.left);
    if(curr.right!=null)
     q.add(curr.right);
    System.out.print(curr.data+" ");
   }
  }
  System.out.println();
 }
}

class Main
{
    public static void main(String[] args)
    {
     BinarySearchTree tree=new BinarySearchTree();
          tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        tree.LevelOrder();
        tree.InOrder(); 
    }
    }
