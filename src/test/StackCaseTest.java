package test;

import static org.junit.Assert.*;


import org.junit.Test;
import model.Stack;

public class StackCaseTest {
    @Test
    public void testPush() {
        //Arrange
        Stack<String> stack = new Stack<>();
        //Act
        stack.push("uno");
        stack.push("dos");
        stack.push("tres");
        //Assert and Act
        assertEquals(3, stack.size());
        assertEquals("tres", stack.peek());
    }
    @Test
    public void testEmptyStackPush() {
        //Arrange
        Stack<String> stack = new Stack<>();
        //Act
        stack.push("uno");
        //Assert and act
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());
        assertEquals("uno", stack.peek());
    }
    @Test
    public void testStackWithElementPush(){
        //Arrange
        Stack<Integer> stack = new Stack<>();
        //Act
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //Assert and Act
        assertFalse(stack.isEmpty());
        assertEquals(3, stack.size());
        assertEquals(3, (int) stack.pop());
    }

    @Test
    public void testPop() {
        //Arrange
        Stack<String> stack = new Stack<>();
        //Act
        stack.push("uno");
        stack.push("dos");
        stack.push("tres");
        //Assert and Act
        assertEquals("tres", stack.pop());
        assertEquals("dos", stack.pop());
        assertEquals("uno", stack.pop());
        assertNull(stack.pop());
    }

    @Test
    public void testIsEmptyPop(){
        //Arrange
        Stack<String> stack = new Stack<>();
        //Assert and Act
        assertNull(stack.pop());
        assertTrue(stack.isEmpty());
    }
    @Test
    public void testWithDeletedElementsPop(){
        //Arrange
        Stack<Character> stack = new Stack<>();
        //Act
        stack.push('a');
        stack.push('b');
        stack.pop();
        //Assert and act
        assertEquals('a', (char) stack.pop());
        assertTrue(stack.isEmpty());
    }
    @Test
    public void testPeekReturnsCorrectElement() {
        //Arrange
        Stack<Integer> stack = new Stack<>();
        //Act
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //Assert and Act
        assertEquals(Integer.valueOf(3), stack.peek());
    }
    @Test
    public void testPeekDoesNotModifyStack() {
        //Arrange
        Stack<String> stack = new Stack<>();
        //Act
        stack.push("one");
        stack.push("two");
        stack.push("three");
        //Assert and act
        String top = stack.peek();
        assertEquals("three", top);
        assertEquals(3, stack.size());

        top = stack.peek();
        assertEquals("three", top);
        assertEquals(3, stack.size());
    }

    @Test
    public void testPeekReturnsNullOnEmptyStack() {
        //Arrange
        Stack<Integer> stack = new Stack<>();
        //Assert and Act
        assertNull(stack.peek());
    }
}











