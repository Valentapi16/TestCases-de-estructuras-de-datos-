package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Queue;

public class QueueCaseTest {

    private Queue<Integer> queue;

    @Before
    public void setUp() {
        //Arrange
        queue = new Queue<Integer>();
    }

    // Enqueue tests
    @Test
    public void testEnqueueIncreasesSize() {
        //Assert and Act
        queue.enqueue(1);
        assertEquals(1, queue.size());
        queue.enqueue(2);
        assertEquals(2, queue.size());
        queue.enqueue(3);
        assertEquals(3, queue.size());
    }

    @Test
    public void testEnqueueAddsToRear() {
        //Assert and Act
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, (int) queue.peek());
        assertEquals(1, (int) queue.dequeue());
        assertEquals(2, (int) queue.peek());
        assertEquals(2, (int) queue.dequeue());
        assertEquals(3, (int) queue.peek());
        assertEquals(1, queue.size());
    }

    @Test
    public void testEnqueueNull() {
        queue.enqueue(null);
        assertEquals(1, queue.size());
        assertNull(queue.peek());
    }

    // Peek tests
    @Test
    public void testPeek() {
        queue.enqueue(1);
        assertEquals(1, (int)queue.peek());
        assertEquals(1, queue.size());
    }


    @Test
    public void testPeekOnEmptyQueueReturnsNull() {
        //Act and Assert
        assertNull(queue.peek());
        queue.enqueue(1);
        queue.dequeue();
        assertNull(queue.peek());
    }

    @Test
    public void testPeekEmpty() {
        assertNull(queue.peek());
        assertEquals(0, queue.size());
    }

    // Dequeue tests
    @Test
    public void testDequeueRemovesFrontElement() {
        //Act and Assert
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, (int) queue.dequeue());
        assertEquals(2, (int) queue.dequeue());
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testDequeueOnEmptyQueueReturnsNull() {
        //Act and Assert
        assertNull(queue.dequeue());
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testDequeueDecreasesSize() {
        //Act and Assert
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        assertEquals(2, queue.size());
        queue.dequeue();
        assertEquals(1, queue.size());
    }
}


