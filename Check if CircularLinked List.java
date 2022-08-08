/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here
	Node first=head;
	Node Last=head;
	while(Last!=null && Last.next!=null){
	    
	    Last=Last.next.next;
	    if (first==Last){
	        return true;
	    }
	}
	return false;
	    
    }
}
