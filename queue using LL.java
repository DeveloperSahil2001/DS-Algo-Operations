import java.util.Scanner;
class Node { 
    int data; 
    Node next; 
    public Node(int data) 
    { 
        this.data = data; 
        this.next = null; 
    } 
} 
class queueUsingLinkedList
{
 Node start;
 Node end;
 queueUsingLinkedList()
 {
  start=null;
  end=null;
 }
 boolean isEmpty()
 {
  if(start==null)
  return true;
  else
  return false;
 }
 void enqueue(int data)
 {
  Node node=new Node(data);
  if(isEmpty())
  {
    start=end=node;
    return;
  }
  end.next=node;
  end=node;
 }
 
 int dequeue()
 {
  if(isEmpty())
   return -1;
  Node temp=start;
  start=start.next;
  return temp.data;
 }
 int peek()
 {
  if(!isEmpty())
   return start.data;
  else
   return -1;
 }
 void display()
 {
  Node temp=start;
  if(start==null)
  {
   System.out.println("Queue is Empty");
   return;
  }
  while(temp!=null)
  {
    System.out.print(temp.data+" ");
    temp=temp.next;
  }
  System.out.println();
 }
}
class Main
{
    public static void main(String[] args)
    {
     queueUsingLinkedList q=new queueUsingLinkedList();//creating queue
     q.enqueue(1);
     q.enqueue(2);
     q.enqueue(3);
     q.enqueue(4);
     q.display();//disply elements
     System.out.println(q.peek());// return peak value
     System.out.println(q.dequeue());
     System.out.println(q.dequeue());
     System.out.println(q.dequeue());
     System.out.println(q.dequeue());
     System.out.println(q.dequeue());//return -1 as queue is now empty
    }
    }
