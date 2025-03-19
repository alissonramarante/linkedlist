package linkedlist;

import java.util.ArrayList;
import java.util.List;

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
        T search = null;
		if (!this.isEmpty() && element != null) {
			if (this.getData().equals(element)) {
				search = this.getData();
			} else {
				search = this.getNext().search(element);
			}
		}
		return search;
	}

    @Override
    public T searchPosition(int position) {
		T result = null;

		if (!this.isEmpty() && position >= 0) {
			if (position == 0) {
				result = this.getData();
			} else {
				result = this.getNext().searchPosition(position - 1);
			}

		}

		return result;
	}

    @Override
    public void insertFirst(T element) {
		if (element != null) {
			if (this.isEmpty()) {
				this.setData(element);
				this.setNext(new RecursiveSingleLinkedListImpl<T>());
			} else {
				RecursiveSingleLinkedListImpl<T> newNode = new RecursiveSingleLinkedListImpl<>();
				newNode.setData(this.getData());
				newNode.setNext(this.getNext());

				this.setData(element);
				this.setNext(newNode);
			}
		}

	}

    @Override
    public void insertLast(T element) { 
        if (element != null) {
			if (this.isEmpty()) {
				this.setData(element);
				this.setNext(new RecursiveSingleLinkedListImpl<T>());
			} else {
				this.next.insertLast(element);
			}
		}
	}

    @Override
    public void insertPosition(int position, T element) {
        if (element != null) {
			if (position < 0) {
				throw new IndexOutOfBoundsException("Position cannot be negative");
			}
			if (position == 0) {
				RecursiveSingleLinkedListImpl<T> newNode = new RecursiveSingleLinkedListImpl<T>();
				newNode.setData(this.getData());
				newNode.setNext(this.getNext());
				this.setData(element);
				this.setNext(newNode);
			} else if (position < this.size()) {
				this.getNext().insertPosition(position - 1, element);
			} else {
				this.insertLast(element);
			}
		}

	}

    @Override
    public void removeFirst() {
		if (!this.isEmpty()) {
			if (this.getNext() != null) {
				this.setData(this.getNext().getData());
				this.setNext(this.getNext().getNext());
			} else{
				this.setData(null);
				this.setNext(null);
			}
		} else{
			this.getNext().removeFirst();
		}
	}

    @Override
	public void removeLast() {
		if (!this.isEmpty()) {
			if (this.getNext().getNext() == null) {
				this.setData(this.getNext().getData());	
				this.setNext(this.getNext().getNext());		
			} else{
				this.getNext().removeLast();
			}
		}
	}

    @Override
    public void removeValue(T element) {
        if (!this.isEmpty() && element != null) {
			if (this.getData().equals(element)) {
				this.setData(this.next.getData());
				this.setNext((this.next.getNext()));
			} else {
				this.getNext().removeValue(element);
			}
		}
    }

    @Override
    public void removePosition(int position) {
		if(!this.isEmpty()){
			if(position == 0){
					this.setData(this.getNext().getData());
					this.setNext(this.getNext().getNext());	
			} else if( position < this.size()){
				this.getNext().removePosition( position - 1);
			} else{
				this.removeLast();				
			}	
		}
	}

    @Override
    public T[] toArray() {
		List<T> list = new ArrayList<T>();
		toArray(list);
		return (T[]) list.toArray();
	}
	private void toArray(List<T> array){
		if(!this.isEmpty()){
			array.add(this.getData());
			if(this.getNext() != null){
				this.getNext().toArray(array);
			}
		}
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