/**
Owen Sellner
20915011
Assignment 2
October 3, 2021
This program has the methods needed to play a game of "Circle Dodgeball" using the rules described in the assignment instructions.
 */

import java.io.PrintStream;
import java.util.List;

public class DodgeballManager {
	DodgeballNode throwerFirstNode = null;
	DodgeballNode dodgerFirstNode = null;

	// Creates a new DodgeballManager
	public DodgeballManager(List<String> initialThrowers, List<String> initialDodgers) {
		// Checks if an exception is needed
		if (initialThrowers == null || initialThrowers.size() == 0 || initialDodgers == null
				|| initialDodgers.size() == 0) {
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
			// Creates and adds a new DodgeballNode with the initialThrowers value at index
			// i
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
		// Initializes an Integer for the max score
		int maxScore = this.getMaximumScore();
		// Initializes an Integer for the number of people with a score equal to the
		// maxScore
		int winNum = 0;
		// Initializes a String for the name of the winner
		String winName = "";

		// Searches the throwers
		// Creates a node to traverse the list
		DodgeballNode current1 = throwerFirstNode;
		// Loops through each element in the list
		while (current1.next != null) {
			if (current1.score == maxScore) {
				winNum += 1;
				winName = current1.name;
			}
			// Moves to the next element
			current1 = current1.next;
		}

		// Searches the dodgers
		// Creates a node to traverse the list
		DodgeballNode current2 = dodgerFirstNode;
		// Loops through each element in the list
		while (current2.next != null) {
			if (current2.score == maxScore) {
				winNum += 1;
				winName = current1.name;
			}
			// Moves to the next element
			current2 = current2.next;
		}

		// Checks if an exception is needed
		if (winNum > 1) {
			throw new IllegalArgumentException();
		} else {
			stream.print("The winner is " + winName + " with " + maxScore + " points");
		}
	}

	// Checks if a given string matches any thrower's name
	public boolean throwersContains(String name) {
		boolean result = false;

		// Creates a node to traverse the list
		DodgeballNode current = throwerFirstNode;
		// Loops through each element in the list
		while (current != null) {
			if (current.name.equalsIgnoreCase(name)) {
				result = true;
			}
			// Moves to the next element
			current = current.next;
		}
		return result;
	}

	// Checks if a given string matches any dodger's name
	public boolean dodgersContains(String name) {
		boolean result = false;

		// Creates a node to traverse the list
		DodgeballNode current = dodgerFirstNode;
		// Loops through each element in the list
		while (current != null) {
			if (current.name.equalsIgnoreCase(name)) {
				result = true;
			}
			// Moves to the next element
			current = current.next;
		}
		return result;
	}

	public void hit(String throwerName, String dodgerName) {
		// Checks if an exception is needed
		if (throwerName == null || throwerName.equals("") || !throwersContains(throwerName) || dodgerName == null
				|| dodgerName.equals("") || !dodgersContains(dodgerName)) {
			throw new IllegalArgumentException();
		}

		// Finds the node for throwerName
		// Creates a node to traverse the list
		DodgeballNode current1 = throwerFirstNode;
		// Loops through each element in the list
		while (!current1.name.equals(throwerName)) {
			// Moves to the next element
			current1 = current1.next;
		}
		// Increases the thrower's score by one
		current1.score += 1;
		
		// Creates a temporary DodgeballNode for the thrower's name and score
		DodgeballNode temp = new DodgeballNode("");
		temp.score = current1.score;
		temp.name = current1.name;

		// Finds the node for dodgerName
		// Creates a node to traverse the list
		DodgeballNode current2 = dodgerFirstNode;
		// Loops through each element in the list
		while (!current2.name.equals(dodgerName)) {
			// Moves to the next element
			current2 = current2.next;
		}
		
		// Swap the names and scores of the thrower and dodger using the temporary DodgeballNode
		current1.score = current2.score;
		current1.name = current2.name;
				
		current2.score = temp.score;
		current2.name = temp.name;

		

//        // a - b - c
//        // d - e - f
//        current2.next.next = current1.next.next;
//        System.out.println("+++" + current2.next.next.name);
////        current1.next.next = temp.next;
//        temporary();
//     	// a - b - f
//        // d - e - c
//        current2 = current1.next;
////        current1 = temp;
//        temporary();
//        // d - b - f
//        // a - e - c

	}

	public void dodge(String throwerName, String dodgerName) {
		// Checks if an exception is needed
		if (throwerName == null || throwerName.equals("") || !throwersContains(throwerName) || dodgerName == null
				|| dodgerName.equals("") || !dodgersContains(dodgerName)) {
			throw new IllegalArgumentException();
		}

		// Adding the point
		// Creates a node to traverse the list
		DodgeballNode current = dodgerFirstNode;
		// Loops through each element in the list
		while (current.next != null) {
			if (current.name.equalsIgnoreCase(dodgerName)) {
				// Increases the dodger's score by one
				current.score += 1;
			}
			// Moves to the next element
			current = current.next;
		}

	}

	public int getMaximumScore() {
		int maxScore = 0;

		// Searches the throwers
		// Creates a node to traverse the list
		DodgeballNode current1 = throwerFirstNode;
		// Loops through each element in the list
		while (current1.next != null) {
			if (current1.score > maxScore) {
				maxScore = current1.score;
			}
			// Moves to the next element
			current1 = current1.next;
		}

		// Searches the dodgers
		// Creates a node to traverse the list
		DodgeballNode current2 = dodgerFirstNode;
		// Loops through each element in the list
		while (current2.next != null) {
			if (current2.score > maxScore) {
				maxScore = current2.score;
			}
			// Moves to the next element
			current2 = current2.next;
		}

		return maxScore;
	}

	public void printSortedScores(PrintStream stream) {
		// TODO method stub
	}
}
