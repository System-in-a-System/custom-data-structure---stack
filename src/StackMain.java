

public class StackMain {

	public static void main(String[] args) {
		
		try {
			Stack testPile = new Stack();
			System.out.println(testPile.printStack());
		
			System.out.println(testPile.isEmpty());
			System.out.println(testPile.size());
		
			testPile.push("paper1");
			testPile.push("paper2");
			testPile.push("paper3");
		
			System.out.println(testPile.printStack());
		
			System.out.println(testPile.isEmpty());
			System.out.println(testPile.size());
		
			System.out.println(testPile.peek());
			System.out.println(testPile.pop());
		
			System.out.println(testPile.size());
		
			System.out.println(testPile.printStack());
		} 
		// Catch possible exceptions
		catch (IllegalArgumentException ex) {
			System.out.println("Something went wrong: " + ex.getMessage());
		}
		catch (IllegalStateException ex) {
			System.out.println("Something went wrong: " + ex.getMessage());
		}
		
		
		
	}

}
