

public interface StringStack {
	
	// Current stack size
	int size(); 
	
	// True if stack is empty
	boolean isEmpty(); 	
	
	// Add element at the top of stack
	void push(String element); 	
	
	// Return and remove top element,
	// throw exception if stack is empty
	String pop(); 		
	
	// Return (without removing) top element,
	// throw exception if stack is empty
	String peek(); 		
					
	
}
