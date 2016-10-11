import java.util.NoSuchElementException;

/**
 * Class that creates a LinkedList with a reverse method
 * @author softskeleton
 *
 */
public class ReverseList {
	private Node first;

	   public ReverseList() { first = null; }

	   public Object getFirst()
	   {
	      if (first == null) { throw new NoSuchElementException(); }   
	      return first.data;
	   }

	   public void addFirst(Object element)
	   {
	       Node aNode = new Node();
	       aNode.data = element;
	       aNode.next = first;
	       first = aNode;
	       
	   }

	   public Object removeFirst()
	   {
		    if (first == null) { throw new NoSuchElementException(); }
		    Object obj = first.data;
		    first = first.next;
		    return obj;
		   
	   }

	   public String toString()
	   {
	      String temp = "";
	      Node current = first;
	      while (current != null)
	      {
	         temp = temp + current.data.toString() + '\n';
	         current = current.next;
	      }
	      return temp;
	   }

	   class Node
	   {
	      public Object data;
	      public Node next;
	   }
	   
	   /**
	    * Method that reverses order of a LinkedList
	    */
	   public void reverse() {

		    Node previous = first;
		    Node currentLink = first.next;
		    first.next = null;

		    	while(currentLink != null) {        

		    		Node realNextLink = currentLink.next;
		    		currentLink.next = previous;                        
		    		previous = currentLink; 
		    		first = currentLink;    
		    		currentLink = realNextLink;
		    	}
	   }

}
