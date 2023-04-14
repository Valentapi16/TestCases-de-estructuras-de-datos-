package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Queue;

public class QueueCaseTest {

    private Queue<Integer> queue;

    @Before
    public void setUp() {
        queue = new Queue<Integer>();
    }

    @Test
    public void testEnqueueAndSize() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(3, queue.size());
    }
    @Test
    public void testPeekWithMultipleEnqueueAndDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.enqueue(3);
        assertEquals(2, (int)queue.peek());
    }

    @Test
    public void testPeekWithEmptyQueue() {
        assertNull(queue.peek());
        queue.enqueue(1);
        queue.dequeue();
        assertNull(queue.peek());
    }


}

