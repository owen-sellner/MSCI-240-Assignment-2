import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class DodgeballManagerTest {
	
	/**
	 *  Constructor
	 */
		// Description: two lists of equal lengths
		@Test
		public void testConstructorNormal() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Prints throwers to the PrintStream
			manager.printThrowers(stream);
			// Prints a new line to separate the throwers and dodgers 
			stream.println();
			// Prints dodgers to the PrintStream
			manager.printDodgers(stream);
			
			// Checks the results
			assertEquals(os.toString(), "John 0, Sally 0, Fred 0\r\nAbby 0, Ben 0, Clark 0");
		}
		// Description: two lists of unequal lengths (throwers > dodgers)
		@Test
		public void testConstructorNormal2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Prints throwers to the PrintStream
			manager.printThrowers(stream);
			// Prints a new line to separate the throwers and dodgers 
			stream.println();
			// Prints dodgers to the PrintStream
			manager.printDodgers(stream);
			
			// Checks the results
			assertEquals(os.toString(), "John 0, Sally 0, Fred 0\r\nAbby 0, Ben 0");
		}
		// Description: two lists of equal lengths
		@Test
		public void testConstructorNormal3() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Prints throwers to the PrintStream
			manager.printThrowers(stream);
			// Prints a new line to separate the throwers and dodgers 
			stream.println();
			// Prints dodgers to the PrintStream
			manager.printDodgers(stream);
			
			// Checks the results
			assertEquals(os.toString(), "John 0, Sally 0\r\nAbby 0, Ben 0, Clark 0");
		}
		// Description: throwers list is null
		@Test (expected = IllegalArgumentException.class)
		public void testConstructorError() {
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates a new DodgebalManager object
			new DodgeballManager(null, initialDodgers);
		}
		// Description: dodgers list is null
		@Test (expected = IllegalArgumentException.class)
		public void testConstructorError2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates a new DodgebalManager object
			new DodgeballManager(initialThrowers, null);
		}
		// Description: dodgers list is null
		@Test (expected = IllegalArgumentException.class)
		public void testConstructorError3() {
			// Creates a new DodgebalManager object
			new DodgeballManager(null, null);
		}
		// Description: throwers list is size zero
		@Test (expected = IllegalArgumentException.class)
		public void testConstructorError4() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates a new DodgebalManager object
			new DodgeballManager(initialThrowers, initialDodgers);
		}
		// Description: dodgers list is size zero
		@Test (expected = IllegalArgumentException.class)
		public void testConstructorError5() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			
			// Creates a new DodgebalManager object
			new DodgeballManager(initialThrowers, initialDodgers);
		}
		// Description: both lists are size zero
		@Test (expected = IllegalArgumentException.class)
		public void testConstructorError6() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			
			// Creates a new DodgebalManager object
			new DodgeballManager(initialThrowers, initialDodgers);
		}
	/**
	 * printThrowers
	 */
		// Description: different scores
		@Test
		public void testPrintThrowersNormal() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 2 points
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 1 point
			manager.hit("Fred", "Clark");
			manager.hit("Clark", "Fred");
			
			// Prints throwers to the PrintStream
			manager.printThrowers(stream);
			
			// Checks the results
			assertEquals(os.toString(), "John 0, Sally 2, Fred 1");
		}
		// Description: same scores
		@Test
		public void testPrintThrowersNormal2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Prints throwers to the PrintStream
			manager.printThrowers(stream);
			
			// Checks the results
			assertEquals(os.toString(), "John 0, Sally 0, Fred 0");
		}
	/**
	 * printDodgers
	 */
		// Description: different scores
		@Test
		public void testPrintDodgersNormal() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Ben has 2 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			
			// Game is played till Clark has 1 point
			manager.dodge("Fred", "Clark");
			
			// Prints throwers to the PrintStream
			manager.printDodgers(stream);
			
			// Checks the results
			assertEquals(os.toString(), "Abby 0, Ben 2, Clark 1");
		}
		// Description: same scores
		@Test
		public void testPrintDodgersNormal2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Prints throwers to the PrintStream
			manager.printDodgers(stream);
			
			// Checks the results
			assertEquals(os.toString(), "Abby 0, Ben 0, Clark 0");
		}
	/**
	 * getMaximumScore
	 */
		// Description: throwers have the max score
		@Test
		public void testGetMaximumScoreNormal() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 2 points
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Checks the results
			assertEquals(3, manager.getMaximumScore());
		}
		// Description: dodgers have the max score
		@Test
		public void testGetMaximumScoreNormal2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Checks the results
			assertEquals(4, manager.getMaximumScore());
		}
		// Description: all have the same score 
		@Test
		public void testGetMaximumScoreNormal3() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Checks the results
			assertEquals(0, manager.getMaximumScore());
		}
	/**
	 * printWinner
	 */
		// Description: throwers have the max score 
		@Test
		public void testPrintWinnerNormal() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 2 points
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Prints the sentence declaring the winner to the PrintStream
			manager.printWinner(stream);
			
			// Checks the results
			assertEquals(os.toString(), "The winner is Sally with 3 points");
		}
		// Description: dodgers have the max score 
		@Test
		public void testPrintWinnerNormal2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Prints the sentence declaring the winner to the PrintStream
			manager.printWinner(stream);
			
			// Checks the results
			assertEquals(os.toString(), "The winner is Ben with 4 points");
		}
		// Description: two people with the max score 
		@Test (expected = IllegalArgumentException.class)
		public void testPrintWinnerError() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 4 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Prints the sentence declaring the winner to the PrintStream
			manager.printWinner(stream);
		}
	/**
	 * throwersContains
	 */
		// Description: a name that is in the throwers list
		@Test
		public void testThrowersContainsNormal() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Checks the results
			assertTrue(manager.throwersContains("John"));
		}
		// Description: a name that is not in either list
		@Test
		public void testThrowersContainsNormal2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Checks the results
			assertFalse(manager.throwersContains("Thomas"));
		}
		// Description: a name that is capitalized oddly and is in the throwers list
		@Test
		public void testThrowersContainsEdge() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Checks the results
			assertTrue(manager.throwersContains("fReD"));
		}
		// Description: a name that is in the dodgers list not the throwers list
		@Test
		public void testThrowersContainsEdge2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Checks the results
			assertFalse(manager.throwersContains("Ben"));
		}
	/**
	 * dodgersContains
	 */
		// Description: a name that is in the dodgers list
		@Test
		public void testDodgersContainsNormal() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Checks the results
			assertTrue(manager.dodgersContains("Abby"));
		}
		// Description: a name that is not in either list
		@Test
		public void testDodgersContainsNormal2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Checks the results
			assertFalse(manager.dodgersContains("Bill"));
		}
		// Description: a name that is capitalized oddly and is in the dodgers list
		@Test
		public void testDodgersContainsEdge() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Checks the results
			assertTrue(manager.dodgersContains("cLaRk"));
		}
		// Description: a name that is in the throwers list not the dodgers list
		@Test
		public void testDodgersContainsEdge2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Checks the results
			assertFalse(manager.dodgersContains("Sally"));
		}
	/**
	 * dodge
	 */
		// Description: both names are valid 
		@Test
		public void testDodgeNormal() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Dodge method is used
			manager.dodge("John", "Abby");
			
			// Prints throwers to the PrintStream
			manager.printThrowers(stream);
			// Prints a new line to separate the throwers and dodgers 
			stream.println();
			// Prints dodgers to the PrintStream
			manager.printDodgers(stream);
			
			// Checks the results
			assertEquals(os.toString(), "John 0, Sally 0, Fred 0\r\nAbby 1, Ben 0, Clark 0");
		}
		// Description: both names are valid and the dodger's initial score is not zero
		@Test
		public void testDodgeNormal2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 1 point and Ben has 1 point
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Dodge method is used
			manager.dodge("Sally", "Ben");
			
			// Prints throwers to the PrintStream
			manager.printThrowers(stream);
			// Prints a new line to separate the throwers and dodgers 
			stream.println();
			// Prints dodgers to the PrintStream
			manager.printDodgers(stream);
			
			// Checks the results
			assertEquals(os.toString(), "John 0, Sally 1, Fred 0\r\nAbby 0, Ben 2, Clark 0");
		}
		// Description: the thrower's name is not in the throwers list
		@Test (expected = IllegalArgumentException.class)
		public void testDodgeError() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Dodge method is used
			manager.dodge("Tim", "Clark");
		}
		// Description: the dodger's name is not in the dodgers list
		@Test (expected = IllegalArgumentException.class)
		public void testDodgeError2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Dodge method is used
			manager.dodge("John", "Bill");
		}
		// Description: both names are not in either list
		@Test (expected = IllegalArgumentException.class)
		public void testDodgeError3() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Dodge method is used
			manager.dodge("Tim", "Bill");
		}
		// Description: the thrower name is empty
		@Test (expected = IllegalArgumentException.class)
		public void testDodgeError4() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Dodge method is used
			manager.dodge("", "Clark");
		}
		// Description: the dodger name is empty
		@Test (expected = IllegalArgumentException.class)
		public void testDodgeError5() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Dodge method is used
			manager.dodge("John", "");
		}
		// Description: both names are empty
		@Test (expected = IllegalArgumentException.class)
		public void testDodgeError6() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Dodge method is used
			manager.dodge("", "");
		}
		// Description: the thrower name is null
		@Test (expected = IllegalArgumentException.class)
		public void testDodgeError7() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Dodge method is used
			manager.dodge(null, "Clark");
		}
		// Description: the dodger name is null
		@Test (expected = IllegalArgumentException.class)
		public void testDodgeError8() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Dodge method is used
			manager.dodge("John", null);
		}
		// Description: both names are null
		@Test (expected = IllegalArgumentException.class)
		public void testDodgeError9() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Dodge method is used
			manager.dodge(null, null);
		}
	/**
	 * hit
	 */
		// Description: both names are valid 
		@Test
		public void testHitNormal() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Hit method is used
			manager.hit("John", "Abby");
			
			// Prints throwers to the PrintStream
			manager.printThrowers(stream);
			// Prints a new line to separate the throwers and dodgers 
			stream.println();
			// Prints dodgers to the PrintStream
			manager.printDodgers(stream);
			
			// Checks the results
			assertEquals(os.toString(), "Abby 0, Sally 0, Fred 0\r\nJohn 1, Ben 0, Clark 0");
		}
		// Description: both names are valid 
		@Test
		public void testHitNormal2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Fred has 1 point and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.hit("Clark", "Fred");
			
			// Hit method is used
			manager.hit("Fred", "Ben");
			
			// Prints throwers to the PrintStream
			manager.printThrowers(stream);
			// Prints a new line to separate the throwers and dodgers 
			stream.println();
			// Prints dodgers to the PrintStream
			manager.printDodgers(stream);
			
			// Checks the results
			assertEquals(os.toString(), "John 0, Sally 0, Ben 0\r\nAbby 0, Fred 2, Clark 1");
		}
		// Description: the thrower's name is not in the throwers list
		@Test (expected = IllegalArgumentException.class)
		public void testHitError() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Hit method is used
			manager.hit("Tim", "Clark");
		}
		// Description: the dodger's name is not in the dodgers list
		@Test (expected = IllegalArgumentException.class)
		public void testHitError2() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Hit method is used
			manager.hit("John", "Bill");
		}
		// Description: both names are not in either list
		@Test (expected = IllegalArgumentException.class)
		public void testHitError3() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Hit method is used
			manager.hit("Tim", "Bill");
		}
		// Description: the thrower name is empty
		@Test (expected = IllegalArgumentException.class)
		public void testHitError4() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Hit method is used
			manager.hit("", "Clark");
		}
		// Description: the dodger name is empty
		@Test (expected = IllegalArgumentException.class)
		public void testHitError5() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Hit method is used
			manager.hit("John", "");
		}
		// Description: both names are empty
		@Test (expected = IllegalArgumentException.class)
		public void testHitError6() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Hit method is used
			manager.hit("", "");
		}
		// Description: the thrower name is null
		@Test (expected = IllegalArgumentException.class)
		public void testHitError7() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Hit method is used
			manager.hit(null, "Clark");
		}
		// Description: the dodger name is null
		@Test (expected = IllegalArgumentException.class)
		public void testHitError8() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Hit method is used
			manager.hit("John", null);
		}
		// Description: both names are null
		@Test (expected = IllegalArgumentException.class)
		public void testHitError9() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");

			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Hit method is used
			manager.hit(null, null);
		}
	/**
	 * printSortedScores
	 */
		// Description: only two people with the same score
		@Test
		public void testPrintSortedScoresNormal() {
			// Creates the list for the first parameter
			List<String> initialThrowers = new LinkedList<String>();
			initialThrowers.add("John");
			initialThrowers.add("Sally");
			initialThrowers.add("Fred");
			
			// Creates the list for the second parameter
			List<String> initialDodgers = new LinkedList<String>();
			initialDodgers.add("Abby");
			initialDodgers.add("Ben");
			initialDodgers.add("Clark");
			
			// Creates an OutputStream for the PrintStream to use
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			PrintStream stream = new PrintStream(os);
			
			// Creates a new DodgebalManager object
			DodgeballManager manager = new DodgeballManager(initialThrowers, initialDodgers);
			
			// Game is played till Sally has 3 points and Ben has 4 points
			manager.dodge("Sally", "Ben");
			manager.dodge("Sally", "Ben");
			manager.hit("Sally", "Ben");
			manager.dodge("Ben", "Sally");
			manager.hit("Ben", "Sally");
			manager.hit("Sally", "Ben");
			manager.hit("Ben", "Sally");
			
			// Game is played till Fred has 2 points and Clark has 1 point
			manager.hit("Fred", "Clark");
			manager.dodge("Clark", "Fred");
			manager.hit("Clark", "Fred");
			
			// Prints the sorted scores to the PrintStream
			manager.printSortedScores(stream);
			
			// Checks the results
			assertTrue(os.toString().equalsIgnoreCase("Ben 4\r\nSally 3\r\nFred 2\r\nClark 1\r\nAbby 0\r\nJohn 0\r\n") || 
					os.toString().equalsIgnoreCase("Ben 4\r\nSally 3\r\nFred 2\r\nClark 1\r\nJohn 0\r\nAbby 0\r\n"));
		}
}
