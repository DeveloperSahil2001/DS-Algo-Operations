import static java.lang.System.exit; 
class StackUsingLinkedlist { 

	private class Node { 

		int data;
		Node link;
	} 
	Node top; 
	StackUsingLinkedlist() 
	{ 
		this.top = null; 
	} 
	public void push(int x)
	{ 
		Node temp = new Node(); 
		if (temp == null) { 
			System.out.println("Stack Overflow"); 
			return; 
		}
		temp.data = x; 
		temp.link = top; 
		top = temp; 
	} 
	public boolean isEmpty() 
	{ 
		return top == null; 
	} 
	public int peek() 
	{
		if (!isEmpty()) { 
			return top.data; 
		} 
		else { 
			System.out.println("Stack is empty"); 
			return -1; 
		} 
	} 
	public void pop()
	{ 
		if (top == null) { 
			System.out.println("Stack Underflow"); 
			return; 
		} 
		top = (top).link; 
	} 

	public void display() 
	{ 
		if (top == null) { 
			System.out.println("Stack Underflow"); 
			exit(1); 
		} 
		else { 
			Node temp = top; 
			while (temp != null) { 
				System.out.print(temp.data+" "); 
				temp = temp.link; 
			} 
            System.out.println();
		} 
	} 
} 
public class Main { 
	public static void main(String[] args) 
	{ 
		StackUsingLinkedlist obj = new StackUsingLinkedlist(); 
		obj.push(11); 
		obj.push(22); 
		obj.push(33); 
		obj.push(44); 
		obj.display(); 
		System.out.println("Top element is "+ obj.peek()); 
		obj.pop(); 
		obj.pop(); 
		obj.display(); 
		System.out.println("Top element is "+ obj.peek()); 
	} 
} 
