import linkedlist.SimplesLinkedListImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class SinglyLinkedListTest {

    private SimplesLinkedListImpl list;

    @Before
    public void setUp() {
        list = new SimplesLinkedListImpl(); // Inicializa uma nova lista antes de cada teste
    }

    @Test
    public void testInsertAtStart() {
        list.insertAtStart(10);
        list.insertAtStart(20);
        assertEquals(20, list.size());
    }

    @Test
    public void testInsertAtEnd() {
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        assertEquals(20, list.size());
    }

    @Test
    public void testInsertAtPosition() {
        list.insertAtEnd(10);
        list.insertAtEnd(30);
        list.insertAtPosition(1, 20);
        assertEquals(3, list.size());
    }

    @Test
    public void testRemoveByValue() {
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.removeByValue(20);
        assertEquals(2, list.size());
        assertFalse(list.contains(20));
    }

    @Test
    public void testSize() {
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        assertEquals(2, list.size());
    }

    @Test
    public void testContains() {
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        assertTrue(list.contains(10));
        assertFalse(list.contains(30));
    }

    @Test
    public void testReverse() {
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.reverse();
        assertEquals(30, list.size());
    }

    @Test
    public void testUnion() {
        SimplesLinkedListImpl list1 = new SimplesLinkedListImpl();
        list1.insertAtEnd(10);
        list1.insertAtEnd(20);

        SimplesLinkedListImpl list2 = new SimplesLinkedListImpl();
        list2.insertAtEnd(20);
        list2.insertAtEnd(30);

        SimplesLinkedListImpl unionList =  (SimplesLinkedListImpl) list1.union(list2);
        assertEquals(3, unionList.size());
    }

    @Test
    public void testIntersection() {
        SimplesLinkedListImpl list1 = new SimplesLinkedListImpl();
        list1.insertAtEnd(10);
        list1.insertAtEnd(20);

        SimplesLinkedListImpl list2 = new SimplesLinkedListImpl();
        list2.insertAtEnd(20);
        list2.insertAtEnd(30);

        SimplesLinkedListImpl intersectionList = (SimplesLinkedListImpl) list1.intersection(list2);
        assertEquals(1, intersectionList.size());
    }

    @Test
    public void testSort() {
        list.insertAtEnd(30);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.sort();
        assertEquals(10, list.size());
    }

    @Test
    public void testRemoveDuplicates() {
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.removeDuplicates();
        assertEquals(3, list.size());
    }
    
}
