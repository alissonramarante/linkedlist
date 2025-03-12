package linkedlist;

public class DoublyLinkedListImpl implements DoublyLinkedList{

    private DoublyNode head;
    private DoublyNode tail;

    private static class DoublyNode {
        int data;
        DoublyNode next;
        DoublyNode previous;

        public DoublyNode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public DoublyLinkedListImpl() {
        this.head = null;
        this.tail = null;
    }


    @Override
    public int findMax() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findMax'");
    }

    @Override
    public void insertAtPosition(int position, int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertAtPosition'");
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
    public DoublyLinkedList[] splitList(int position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'splitList'");
    }

    @Override
    public void concatenate(DoublyLinkedList otherList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'concatenate'");
    }

    @Override
    public int nthFromEnd(int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nthFromEnd'");
    }

    @Override
    public void printList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printList'");
    }


    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
    
}
