package linkedlist;

public class DoubleLinkedListImpl<T> extends SingleLinkedListImpl<T> implements
DoubleLinkedList<T> {

    protected DoubleLinkedListNode<T> last;

	public DoubleLinkedListImpl() {
		this.head = new DoubleLinkedListNode<T>();
		this.last = (DoubleLinkedListNode<T>) head;
	}

    @Override
    public void insertFirst(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertFirst'");
    }

    @Override
    public void removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    @Override
    public void removeLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    @Override
    public int findMax() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findMax'");
    }

    @Override
    public int findMin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findMin'");
    }

    @Override
    public void removeAtPosition(int position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAtPosition'");
    }

    @Override
    public int kthSmallest(int k) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kthSmallest'");
    }

    @Override
    public double calculateAverage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateAverage'");
    }

    @Override
    public double findMedian() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findMedian'");
    }

    @Override
    public boolean isPalindrome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPalindrome'");
    }

    @Override
    public void rotate(int k) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rotate'");
    }

    @Override
    public int nthFromEnd(int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nthFromEnd'");
    }

    public DoubleLinkedListNode<T> getLast() {
		return this.last;
	}

	public void setLast(DoubleLinkedListNode<T> last) {
		this.last = last;
	}


   
}
