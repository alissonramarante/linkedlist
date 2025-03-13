package linkedlist;

public interface LinkedList <T>{

    public boolean isEmpty();
    public int size();
    public T search(T element);
    public void insert(T element);
    public void remove(T element);
    public T[] toArray();
    public void insertAtStart(int data);
    public void insertAtEnd(int data);
    public void insertAtPosition(int position, int data);
    public void removeByValue(int data);
    public boolean contains(int data);
    public void reverse();
    public void removeDuplicates();
}
