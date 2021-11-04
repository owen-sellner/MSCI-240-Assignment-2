import java.io.PrintStream;
import java.util.List;

public class DodgeballManager {
    DodgeballNode throwerFirstNode = null;
    DodgeballNode dodgerFirstNode = null;
        
    // Creates a new DodgeballManager
    public DodgeballManager(List<String> initialThrowers, List<String> initialDodgers) {
    	// Checks if an exception is needed
    	if (initialThrowers == null || initialThrowers.size() == 0 || initialDodgers == null || initialDodgers.size() == 0) {
    		throw new IllegalArgumentException();
    	}
    	// Connects the throwers to their node
    	throwerFirstNode = new DodgeballNode(initialThrowers.get(0));
    	// Loops through each index of initialThrowers
    	for (int i = 1; i < initialThrowers.size(); i++) {
    		// Creates a node to traverse the list
            DodgeballNode current = throwerFirstNode;
            // Loops through each element in the list
            while (current.next != null) {
                // Moves to the next element
            	current = current.next;
            }
            // Creates and adds a new DodgeballNode with the initialThrowers value at index i
            current.next = new DodgeballNode(initialThrowers.get(i));
    	}
    	// Connects the dodgers to their node
    	dodgerFirstNode = new DodgeballNode(initialDodgers.get(0));
    	// Loops through each index of dodgers
    	for (int i = 1; i < initialDodgers.size(); i++) {
    		// Creates a node to traverse the list
            DodgeballNode current = dodgerFirstNode;
            // Loops through each element in the list
            while (current.next != null) {
                // Moves to the next element
            	current = current.next;
            }
            // Creates and adds a new DodgeballNode with the initialDodgers value at index i
            current.next = new DodgeballNode(initialDodgers.get(i));
    	}
    }
    
    // Prints the throwers to the PrintStream
	public void printThrowers(PrintStream stream) {
		// Creates a node to traverse the list
        DodgeballNode current = throwerFirstNode;
        // Loops through each element in the list
        while (current.next != null) {
        	// Prints the person's name and score to the PrintStream with a comma
            stream.print(current.name + " " + current.score + ", ");
        	// Moves to the next element
        	current = current.next;
        }
        // Prints the last person's name and score to the PrintStream without a comma
        stream.print(current.name + " " + current.score);
    }
	
	// Prints the dodgers to the PrintStream
    public void printDodgers(PrintStream stream) {
    	// Creates a node to traverse the list
        DodgeballNode current = dodgerFirstNode;
        // Loops through each element in the list
        while (current.next != null) {
        	// Prints the person's name and score to the PrintStream with a comma
        	stream.print(current.name + " " + current.score + ", ");
        	// Moves to the next element
        	current = current.next;
        }
        // Prints the last person's name and score to the PrintStream without a comma
        stream.print(current.name + " " + current.score);
    }
    
    public void printWinner(PrintStream stream) {
		// TODO method stub
    }

    public boolean throwersContains(String name) {
		// TODO method stub
    	return false;
    }
    
    public boolean dodgersContains(String name) {
		// TODO method stub
    	return false;
    }

    public void hit(String throwerName, String dodgerName) {
		// TODO method stub
    }
    
    public void dodge(String throwerName, String dodgerName) {
		// TODO method stub
    }
    
    public int getMaximumScore() {
		// TODO method stub
    	return -1;
    }
    
    
    public void printSortedScores(PrintStream stream)
    {
		// TODO method stub
    }
}
