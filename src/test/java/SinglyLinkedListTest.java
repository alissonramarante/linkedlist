import linkedlist.LinkedList;
import linkedlist.RecursiveSingleLinkedListImpl;
import linkedlist.SingleLinkedListImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class SinglyLinkedListTest {

    protected LinkedList<Integer> lista1;
	protected LinkedList<Integer> lista2;

	@Before
	public void setUp() throws Exception {

		getImplementations();

		// Lista com 3 elementos.
		lista1.insertLast(3);
		lista1.insertLast(2);
		lista1.insertLast(1);

	}

	private void getImplementations() {
		// TODO O aluno deve ajustar aqui para instanciar sua implementação
		lista1 = new RecursiveSingleLinkedListImpl<>();
		lista2 = new RecursiveSingleLinkedListImpl<>();
	}

	@Test
	public void testIsEmpty() {
		Assert.assertFalse(lista1.isEmpty());
		Assert.assertTrue(lista2.isEmpty());
	}

	@Test
	public void testSize() {
		Assert.assertEquals(3, lista1.size());
		Assert.assertEquals(0, lista2.size());
	}

	@Test
	public void testSearch() {
		Assert.assertTrue(2 == lista1.search(2));
		Assert.assertNull(lista1.search(4));
		Assert.assertFalse(3 == lista1.search(2));
	}

	@Test
	public void testInsert() {
		Assert.assertEquals(3, lista1.size());
		lista1.insertLast(5);
		lista1.insertLast(7);
		Assert.assertEquals(5, lista1.size());

		Assert.assertEquals(0, lista2.size());
		lista2.insert(4);
		lista2.insert(7);
		Assert.assertEquals(2, lista2.size());
	}

	@Test
	public void testInserPosition() {
		lista2.insertPosition(0, 10);
		assertArrayEquals(new Integer[] { 10 }, lista2.toArray());
		lista2.insertPosition(1, 20);
		assertArrayEquals(new Integer[] { 10, 20 }, lista2.toArray());
		lista2.insertPosition(1, 15);
		assertArrayEquals(new Integer[] { 10, 15, 20 }, lista2.toArray());
		lista2.insertPosition(0, 5);
		assertArrayEquals(new Integer[] { 5, 10, 15, 20 }, lista2.toArray());
		lista2.insertPosition(10, 25);
		assertArrayEquals(new Integer[] { 5, 10, 15, 20, 25 }, lista2.toArray());
		lista1.insertPosition(0, 1);
		assertArrayEquals(new Integer[] { 1, 3, 2, 1 }, lista1.toArray());
	}

	@Test
	public void testInsertFirst() {
		lista1.insertFirst(1);
		assertArrayEquals(new Integer[] { 1, 3, 2, 1 }, lista1.toArray());
		lista2.insertFirst(10);
		assertArrayEquals(new Integer[] { 10 }, lista2.toArray());
		lista2.insertFirst(9);
		assertArrayEquals(new Integer[] { 9, 10 }, lista2.toArray());
		lista2.insertFirst(0);
		assertArrayEquals(new Integer[] { 0, 9, 10 }, lista2.toArray());

	}

	@Test
	public void testSearchPosition() {
		assertEquals(Integer.valueOf(3), lista1.searchPosition(0));
		assertEquals(Integer.valueOf(2), lista1.searchPosition(1));
		assertEquals(Integer.valueOf(1), lista1.searchPosition(2));
		lista1.insertFirst(1);
		assertEquals(Integer.valueOf(1), lista1.searchPosition(0));

	}

	@Test
	public void testRemoveLast() {
		assertArrayEquals(new Integer[] { 3, 2, 1 }, lista1.toArray());
		lista1.removeLast();
		assertArrayEquals(new Integer[] { 3, 2 }, lista1.toArray());
		lista1.removeLast();
		assertArrayEquals(new Integer[] { 3 }, lista1.toArray());
		lista1.removeLast();
		assertArrayEquals(new Integer[] {}, lista1.toArray());
	}

	@Test
	public void testRemovePosition() {
		assertArrayEquals(new Integer[] {3, 2, 1}, lista1.toArray());
		lista1.removePosition(0);
		assertArrayEquals(new Integer[] {2,1}, lista1.toArray());
		lista1.insertLast(7);
		lista1.insertLast(4);
		lista1.insertLast(12);
		lista1.insertLast(9);
		assertArrayEquals(new Integer[] {2,1,7,4,12,9}, lista1.toArray());
		lista1.removePosition(10);
		assertArrayEquals(new Integer[] {2,1,7,4,12}, lista1.toArray());
		lista1.removePosition(3);
		assertArrayEquals(new Integer[] {2,1,7,12}, lista1.toArray());
	}

	@Test
	public void testRemoveFirst() {
		assertArrayEquals(new Integer[] {3, 2, 1}, lista1.toArray());
		lista1.removeFirst();
		assertArrayEquals(new Integer[] {2,1}, lista1.toArray());
		lista1.removeFirst();
		assertArrayEquals(new Integer[] {1}, lista1.toArray());
		lista1.removeFirst();
		Assert.assertEquals(0, lista1.size());
	}

	@Test
	public void testRemove() {
		Assert.assertEquals(3, lista1.size());
		lista1.remove(2);
		lista1.remove(1);
		Assert.assertEquals(1, lista1.size());

	}

	@Test
	public void testToArray() {
		Assert.assertArrayEquals(new Integer[] {}, lista2.toArray());
		Assert.assertArrayEquals(new Integer[] { 3, 2, 1 }, lista1.toArray());
	}
}
