import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import linkedlist.DoublyLinkedList;
import linkedlist.DoublyLinkedListImpl;

public class DoublyLinkedListImplTest {
    private DoublyLinkedListImpl list;

    @Before
    public void setUp() {
        list = new DoublyLinkedListImpl(); // Inicializa uma nova lista antes de cada teste
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
    public void testSplitList() {
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(2, 30);
        DoublyLinkedList[] splitLists = list.splitList(1);
        assertEquals(2, splitLists[0].size());
        assertEquals(1, splitLists[1].size());
    }

    @Test
    public void testConcatenate() {
        DoublyLinkedList list1 = new DoublyLinkedListImpl();
        list1.insertAtPosition(0, 10);
        list1.insertAtPosition(1, 20);

        DoublyLinkedList list2 = new DoublyLinkedListImpl();
        list2.insertAtPosition(0, 30);
        list2.insertAtPosition(1, 40);

        list1.concatenate(list2);
        assertEquals(4, list1.size());
    }

    @Test
    public void testNthFromEnd() {
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(2, 30);
        assertEquals(20, list.nthFromEnd(2));
    }
}
