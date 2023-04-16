package test;
import model.HashTable;
import org.junit.Test;
import static org.junit.Assert.*;

public class HashCaseTest {

    @Test
    public void testClear() {
        //Arrange
        HashTable<String, Integer> table = new HashTable<>(10);
        //Act
        table.put("a", 3);
        //Act
        table.put("b", 6);
        //Act
        table.put("c", 1);
        //Act
        table.clear();
        //Assert
        assertEquals(0, table.size());
        //Assert
        assertEquals(null, table.get("a"));
        //Assert
        assertEquals(null, table.get("b"));
        //Assert
        assertEquals(null, table.get("c"));
    }

    @Test
    public void testClearWithLetters() {
        //Arrange
        HashTable<Integer, String> table = new HashTable<>(5);
        //Act
        table.put(1, "one");
        table.put(2, "two");
        table.put(3, "three");
        table.put(4, "four");
        table.put(5, "five");
        table.clear();
        //Assert
        assertEquals(0, table.size());
        assertEquals(null, table.get(1));
        assertEquals(null, table.get(3));
        assertEquals(null, table.get(5));
    }

    @Test
    public void testClearWithDouble() {
        //Arrange
        HashTable<Character, Double> table = new HashTable<>(7);
        //Act
        table.put('a', 1.5);
        table.put('b', 2.7);
        table.put('c', 3.9);
        table.put('d', 4.2);
        table.clear();
        //Assert
        assertEquals(0, table.size());
        assertEquals(null, table.get('a'));
        assertEquals(null, table.get('c'));
        assertEquals(null, table.get('d'));
    }

    @Test
    public void testSize() {
        //Arrange
        HashTable<String, Integer> table = new HashTable<>(10);
        //Assert
        assertEquals(0, table.size());
        //Act
        table.put("a", 6);
        table.put("b", 9);
        //Assert
        assertEquals(2, table.size());
        //Act
        table.remove("a");
        //Assert
        assertEquals(1, table.size());
        //Act
        table.remove("b");
        //Assert
        assertEquals(0, table.size());
    }

    @Test
    public void testSize2() {
        //Arrange
        HashTable<Integer, String> table = new HashTable<>(5);
        //Assert
        assertEquals(0, table.size());
        //Act
        table.put(1, "one");
        table.put(2, "two");
        table.put(3, "three");
        table.put(4, "four");
        table.put(5, "five");
        //Assert
        assertEquals(5, table.size());
        //Act
        table.remove(3);
        //Assert
        assertEquals(4, table.size());
        //Act
        table.remove(1);
        table.remove(2);
        table.remove(4);
        table.remove(5);
        //Assert
        assertEquals(0, table.size());
    }

    @Test
    public void testSize3() {
        //Arrange
        HashTable<Character, Double> table = new HashTable<>(7);
        //Assert
        assertEquals(0, table.size());
        //Act
        table.put('a', 1.5);
        table.put('b', 2.7);
        //Assert
        assertEquals(2, table.size());
        //Act
        table.put('c', 3.9);
        table.put('d', 4.2);
        //Assert
        assertEquals(4, table.size());
        //Act
        table.remove('b');
        table.remove('d');
        //Assert
        assertEquals(2, table.size());
        //Act
        table.remove('a');
        table.remove('c');
        //Assert
        assertEquals(0, table.size());
    }

    @Test
    public void testGetNonExistent() {
        //Arrange
        HashTable<String, Integer> table1 = new HashTable<>(10);
        //Assert
        assertEquals(null, table1.get("a"));
    }
    @Test
    public void testGetNonExistentKeys() {
        //Arrange
        HashTable<String, Integer> table2 = new HashTable<>(10);
        //Act
        table2.put("a", 3);
        table2.put("b", 6);
        table2.put("c", 1);
        //Assert
        assertEquals(null, table2.get("d"));
    }
    @Test
    public void testTableNull(){
        // Arrange
        HashTable<String, Integer> table3 = new HashTable<>(10);
        //Act
        table3.put("a", 3);
        table3.put("b", 6);
        table3.put("c", 1);
        table3.remove("a");
        //Assert
        assertEquals(null, table3.get("a"));
    }

}
