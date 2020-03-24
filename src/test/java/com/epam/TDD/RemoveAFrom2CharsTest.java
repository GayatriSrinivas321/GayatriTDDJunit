package com.epam.TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class RemoveAFrom2CharsTest {
 
RemoveAin1st2Chars remAin2Char;
    @BeforeEach
	void setUp() {
		remAin2Char = new RemoveAin1st2Chars();
	}

	@Test
	void testFirstChar() {
		assertEquals("BCD", remAin2Char.remove("ABCD"));
	}
	
	@Test
	void testSecondChar() {
		assertEquals("BCD", remAin2Char.remove("BACD"));
	}
	
	@Test
	void testBothChar() {
		assertEquals("BC", remAin2Char.remove("AABC"));
	}
	
	@Test
	void testNoChar() {
		assertEquals("BBAA", remAin2Char.remove("BBAA"));
	}
	
	@Test
	void testNChar() {
		assertEquals("BAA", remAin2Char.remove("AABAA"));
	}
	
	
	@Test
	void testEmpty() {
		assertEquals("", remAin2Char.remove(""));
	}
	
	@Test
	void testSingleChar() {
		assertEquals("", remAin2Char.remove("A"));
	}
	
	@Test
	void testAllChar() {
		assertEquals("AAA", remAin2Char.remove("AAAAA"));
	}
	
	@Test
	void testOneChar() {
		assertEquals("B", remAin2Char.remove("B"));
	}

}
