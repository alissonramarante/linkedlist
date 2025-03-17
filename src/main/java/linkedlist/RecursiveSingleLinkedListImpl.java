package linkedlist;

public class RecursiveSingleLinkedListImpl<T> implements LinkedList<T> {

    protected T data;
    protected RecursiveSingleLinkedListImpl<T> next;

    public RecursiveSingleLinkedListImpl() {

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public RecursiveSingleLinkedListImpl<T> getNext() {
        return next;
    }

    public void setNext(RecursiveSingleLinkedListImpl<T> next) {
        this.next = next;
    }

    @Override
    public boolean isEmpty() {
        return this.getData() == null;
    }

    @Override
    public int size() {
        int cont = 0;
        if (!this.isEmpty()) {
            cont = 1 + this.getNext().size();
        }
        return cont;
    }

    @Override
    public T search(T element) {
        T result = null;
        if (element != null && !this.isEmpty()) {
            if (this.getData().equals(element)) {
                result = this.getData();
            } else {
                result = this.getNext().search(element);
            }

        }
        return result;
    }

    @Override
    public T searchPosition(int position) {
        T result = null;
        if (position == 0 && position <= this.size()) {
            result = this.getData();
        } else {
            result = this.getNext().searchPosition(position - 1);
        }
        return result;
    }

    @Override
    public void insertFirst(T element) {
        if(element != null && !this.isEmpty()){
            this.setData(element);
            this.setNext(new RecursiveSingleLinkedListImpl<>());
        } else{
            RecursiveSingleLinkedListImpl<T> newNode = new RecursiveSingleLinkedListImpl<>();
            newNode.setData(element);
            newNode.setNext(this);
            this.setData(newNode.getData());
            this.setNext(newNode.getNext());
        }
    }

    @Override
    public void insertLast(T element) {
        if(element != null && this.isEmpty()){
            this.setData(element);
            this.setNext(new RecursiveSingleLinkedListImpl<>());
        } else{
            this.getNext().insertLast(element);
        }
    }

    @Override
    public void insertPosition(int position, T element) {
        if(element != null && position == 0){
            T newNode = this.getData();
        } else{
            this.getNext().insertPosition(position - 1, element);
        }
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

}
