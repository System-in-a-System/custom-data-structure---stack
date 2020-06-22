

public class Stack implements StringStack {

	// Declare private data fields
	private String[] stackPile;

	
	// Declare a constructor
	public Stack() {
		stackPile = new String[0];
	}
	
	
	
	// Implement methods from StringStack interface:
	
	// Returns current stack size
	@Override
	public int size() {
		return stackPile.length;
	}

	// Returns true if the stack is empty
	@Override
	public boolean isEmpty() {
		return stackPile.length == 0;
	}

	// Adds element at the top of the stack
	@Override
	public void push(String element) {		
		
		// Check if the String argument is legal
		if (element != "") {
			
			// Declare a new array of an incremented size
			String[] stackPileUpdated = new String[size() + 1];
		
			// Populate the new array with the content of stackPile
			for (int i = 0; i < stackPile.length; i++) 		
				stackPileUpdated[i] = stackPile[i];			
			
			// Assign the specified element at the end of the array (= at the "top" of the stack)
			stackPileUpdated[stackPileUpdated.length-1] = element;
		
			// Reassign the stackPile
			stackPile = stackPileUpdated;
			
		} else {
			throw new IllegalArgumentException("You cannot add an empty string");
		}
					
	}

	// Returns and removes the top element of the stack
	@Override
	public String pop() throws IllegalStateException {
		
		// Check is the stack is not empty
		if (!isEmpty()) {
			
			// Retrieve the top element from the stack 
			String topElement = stackPile[stackPile.length - 1];
			
			// Declare a new array of a decremented size
			String[] stackPileUpdated = new String[size() - 1];
		
			// Populate the new array with the content of decremented StackPile
			for (int i = 0; i < stackPileUpdated.length; i++) 		
				stackPileUpdated[i] = stackPile[i];			
					
			// Reassign the stackPile
			stackPile = stackPileUpdated;
			
			return topElement;
			
		} else {
			throw new IllegalStateException("The stack is empty");
		}
	}

	// Returns (without removing) the top element of the stack
	@Override
	public String peek() {
		
		if (!isEmpty()) {
			String topElement = stackPile[stackPile.length - 1];
			return topElement;
			
		} else {
			throw new IllegalStateException("The stack is empty");
		}
	}
	
	
	// Method to output the stack to the console 
	public String printStack() {
		
	 	if (!isEmpty()) {
	 		String stackLine = "";
	 		
	 		for (String el :stackPile) 
	 			stackLine += el + " || ";
		
	 		return stackLine;
	 		
	 	} else {
	 		return "The stack is empty";
	 	}
	}

}
