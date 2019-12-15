import java.util.Stack;
public class QueueUsingTwoStacks
{
	private Stack<Integer> stack1 = new Stack<>();     
	private Stack<Integer> stack2 = new Stack<>();
	
	public void enqueue(int value)      //queue FIFO inserting elements in to queue 
	{
		stack1.push(value);           // pushing the queue elements in to stack1 LIFO
	}
	public void dequeue()            // dequeuing the elements
	{
		if(stack2.isEmpty())        // condition checking if stack2 is empty
			if(stack1.isEmpty())    // condition checking if stack1 is empty
				System.out.println("dequeing is not possible, coz queue is empty");
			else
			{
				while(!stack1.isEmpty())   // checking condition if stack1 is not empty 
					stack2.push(stack1.pop()); //then pop(delete) the elements from stack1(LIFO) & push the same elements to stack
			}                                  // so that the elements will insert in reverse order 
		System.out.println(stack2.pop());	// then pop(delete) the elements from stack2, so it will make like a queue
	}
	public static void main(String[] args) 
	{
		QueueUsingTwoStacks q= new QueueUsingTwoStacks();
		q.enqueue(4);    // inserting elements in to queue
		q.enqueue(5);
		q.enqueue(6);
		
		q.dequeue();    // dequeuing the elements from queue
		q.enqueue(8);   // if we insert element in intervene then we have to dequeue, so it will push the element in to stack according to logic.
		q.dequeue();
		q.enqueue(10);
		q.dequeue();
		q.dequeue();
		q.dequeue();    // output will be same as the insertion of the elements.
    }
}
