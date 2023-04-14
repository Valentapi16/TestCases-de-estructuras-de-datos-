package test;
import model.HashTable;
import org.junit.Test;
import static org.junit.Assert.*;

public class HashCaseTest {
    private HashTable<String, Integer> table;

    @Test
    public void testClear() {
        HashTable<String, Integer> table = new HashTable<>(10);
        table.put("a", 3);
        table.put("b", 6);
        table.put("c", 1);
        table.clear();
        assertEquals(0, table.size());
        assertEquals(null, table.get("a"));
        assertEquals(null, table.get("b"));
        assertEquals(null, table.get("c"));
    }

    @Test
    public void testSize() {
        HashTable<String, Integer> table = new HashTable<>(10);
        assertEquals(0, table.size());
        table.put("a", 6);
        table.put("b", 9);
        assertEquals(9, table.size());
        table.remove("a");
        assertEquals(6, table.size());
    }
    @Test
    public void testGetNonExistent() {
        HashTable<String, Integer> table = new HashTable<>(10);
        table.put("a", 1);
        assertEquals(null, table.get("b"));
    }





}


