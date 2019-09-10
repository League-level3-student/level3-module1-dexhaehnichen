package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<Character> openBrackets = new Stack<Character>();
		for (int i = 0; i < b.length(); i++) {
			System.out.println(i);
			if(b.charAt(i) == '{') {
				openBrackets.add('{');
			}else if(b.charAt(i) == '}' && i > 0) {
				openBrackets.remove(openBrackets.size()-1);
			}else {
				
			}
		}
		System.out.println("--");
		if(openBrackets.isEmpty()) {
			return true; 
		}else {
		return false;
		}
	}

}