package linkedlist;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

    protected SingleLinkedListNode<T> head;

	public SingleLinkedListImpl() {
		this.head = new SingleLinkedListNode<T>();
	}

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public T search(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public boolean searchPosition(int position, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchPosition'");
    }

    @Override
    public void insertFirst(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertFirst'");
    }

    @Override
    public void insertLast(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertLast'");
    }

    @Override
    public void insertPosition(int position, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertPosition'");
    }

    @Override
    public void removeFirst(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    @Override
    public void removeLast(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    @Override
    public void removeValue(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeValue'");
    }

    @Override
    public void removePosition(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePosition'");
    }

    @Override
    public T[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public void removeDuplicates() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeDuplicates'");
    }

    @Override
    public void unionList(LinkedList<T> l1, LinkedList<T> l2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unionList'");
    }

    @Override
    public void mergedList(LinkedList<T> l1, LinkedList<T> l2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mergedList'");
    }

    @Override
    public void sortedList(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortedList'");
    }

    @Override
    public void intersectionList(LinkedList<T> l1, LinkedList<T> l2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intersectionList'");
    }

    @Override
    public void reverse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }

    @Override
    public void rotateRight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rotateRight'");
    }

    @Override
    public boolean isPalindrome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPalindrome'");
    }

    @Override
    public T findMiddle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findMiddle'");
    }

    @Override
    public boolean contains(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    public SingleLinkedListNode<T> getHead() {
		return this.head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}      
}