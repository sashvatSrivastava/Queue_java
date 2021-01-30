import java.util.*;

public class Queue
{
	public static void main(String args[])
	{
		System.out.println("Size of the array?");
		Scanner inp = new Scanner(System.in);
		int x = inp.nextInt();
		
		int queue[] = new int[x]; 
		int front = -1;
		int rear = queue.length;
		int temp = 0;
		
		while(true)
		{
			System.out.println(" (1) for push \n (2) for pop \n (3) for view");
			int cases = inp.nextInt();
			
			switch(cases)
			{
			case 1:
				if(front>rear)
				{
					System.out.println("Queue has no Vacancies");
				}
				else
				{
					System.out.println("Give a value to push");
					int val = inp.nextInt();
					queue[front+1] = val;
					front++;
				}
				break;
			case 2:
				if(front==-1)
				{
					System.out.println("Found nothing to pop");
				}
				else
				{
					queue[temp] = 0;
					temp++;
				}
				break;
			case 3:
				for (int i = front; i <rear; i++)
				{
					System.out.println(queue[i]);
				}
			default:
				System.out.println("Select an Option");
			}
		}
	}
}