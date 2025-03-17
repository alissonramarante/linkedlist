package linkedlist;

public interface LinkedList <T>{

    public boolean isEmpty();
    public int size();
    public T search(T element);
    public boolean searchPosition(int position, T element);
    public void insertFirst(T element);
    public void insertLast(T element);
    public void insertPosition(int position, T element);    
    public void removeFirst(T element);
    public void removeLast(T element);
    public void removeValue(T element);
    public void removePosition(T element);
    public T[] toArray();
    public void removeDuplicates(); //método que remova todos os elementos duplicados da lista, mantendo apenas a primeira ocorrência de cada valor.
    public void unionList(LinkedList<T> l1, LinkedList<T> l2); //método que receba duas listas encadeadas e retorne uma nova lista que seja a união das duas, sem elementos repetidos.
    public void mergedList(LinkedList<T> l1, LinkedList<T> l2); //método que receba duas listas ordenadas e retorne uma nova lista que seja a mesclagem das duas, mantendo a ordem.
    public void sortedList(T element); //método que insira um novo elemento na lista de forma que ela permaneça ordenada em ordem crescente.
    public void intersectionList(LinkedList<T> l1, LinkedList<T> l2); //método que receba duas listas encadeadas e retorne uma nova lista contendo apenas os elementos que estão presentes em ambas as listas.
    public void reverse(); //método que inverta a ordem dos elementos da lista.
    public void rotateRight(); //método que rotacione a lista em k posições para a direita.
    public boolean isPalindrome(); //método que verifique se a lista é um palíndromo (ou seja, se a sequência de elementos é a mesma quando lida de trás para frente).
    public T findMiddle(); //método que retorne o valor do nó que está no meio da lista. Se a lista tiver um número par de elementos, retorne o segundo nó do meio.
    public boolean contains(T element);
      
    
}

