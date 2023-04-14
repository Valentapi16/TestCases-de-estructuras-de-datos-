package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Stack;

public class StackCaseTest {
    @Test
    public void testPush() {
        Stack<String> stack = new Stack<>();
        stack.push("uno");
        stack.push("dos");
        stack.push("tres");

        assertEquals(3, stack.size());
        assertEquals("tres", stack.peek());
    }

    @Test
    public void testPop() {
        Stack<String> stack = new Stack<>();
        stack.push("uno");
        stack.push("dos");
        stack.push("tres");

        assertEquals("tres", stack.pop());
        assertEquals("dos", stack.pop());
        assertEquals("uno", stack.pop());
        assertNull(stack.pop());
    }

    @Test
    public void testPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("uno");
        stack.push("dos");
        stack.push("tres");

        assertEquals("tres", stack.peek());
        assertEquals("tres", stack.peek());
    }


}

