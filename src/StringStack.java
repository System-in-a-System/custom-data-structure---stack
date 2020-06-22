

public interface StringStack {
	
	// Current stack size
	int size(); 
	
	// true if stack is empty
	boolean isEmpty(); 	
	
	// Add element at top of stack
	void push(String element); 	
	
	// Return and remove top element,
	// exception if stack is empty
	String pop(); 		
	
	// Return (without removing) top element,
	// exception if stack is empty
	String peek(); 		
					
	
}
