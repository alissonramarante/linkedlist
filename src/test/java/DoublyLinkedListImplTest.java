import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import linkedlist.DoubleLinkedList;
import linkedlist.DoubleLinkedListImpl;

public class DoublyLinkedListImplTest {
    private DoubleLinkedListImpl list;

    @Before
    public void setUp() {
        list = new DoubleLinkedListImpl(); // Inicializa uma nova lista antes de cada teste
    }
    
    @Test
    public void testFindMax() {
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 30);
        list.insertAtPosition(2, 20);
        assertEquals(30, list.findMax());
    }

    @Test
    public void testInsertAtPosition() {
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(1, 15);
        assertEquals(3, list.size());
    }

    @Test
    public void testRemoveAtPosition() {
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(2, 30);
        list.removeAtPosition(1);
        assertEquals(2, list.size());
    }

    @Test
    public void testKthSmallest() {
        list.insertAtPosition(0, 30);
        list.insertAtPosition(1, 10);
        list.insertAtPosition(2, 20);
        assertEquals(20, list.kthSmallest(2));
    }

    @Test
    public void testCalculateAverage() {
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(2, 30);
        assertEquals(20.0, list.calculateAverage());
    }

    @Test
    public void testFindMedian() {
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(2, 30);
        assertEquals(20.0, list.findMedian());
    }

    @Test
    public void testIsPalindrome() {
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(2, 10);
        assertTrue(list.isPalindrome());
    }

    @Test
    public void testRotate() {
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(2, 30);
        list.rotate(1);
        assertEquals(30, list.size());
    }

    @Test
    public void testNthFromEnd() {
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(2, 30);
        assertEquals(20, list.nthFromEnd(2));
    }
}
