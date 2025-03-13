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
    public void insert(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void remove(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public T[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public void insertAtStart(int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertAtStart'");
    }

    @Override
    public void insertAtEnd(int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertAtEnd'");
    }

    @Override
    public void insertAtPosition(int position, int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertAtPosition'");
    }

    @Override
    public void removeByValue(int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeByValue'");
    }

    @Override
    public boolean contains(int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public void reverse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }

    @Override
    public void removeDuplicates() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeDuplicates'");
    }

    public SingleLinkedListNode<T> getHead() {
		return this.head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}
}
/* 
 * 01 - Implementação Básica de LinkedList
 * Crie uma classe LinkedList em Java que 
 * permita a inserção e remoção de elementos no 
 * início e no final da lista. Implemente também 
 * um método recursivo para imprimir todos os elementos da lista.
 */

/*
 * 02 - Inserção em Posição Específica
 *  Escreva um método recursivo insertAtPosition na classe LinkedList 
 * que insere um elemento em uma posição específica da lista. 
 * Se a posição for maior que o tamanho da lista, o elemento deve ser inserido no final.
*/

/*
 * 03 - Remoção de um Elemento por Valor
 * Implemente um método recursivo removeByValue na classe LinkedList 
 * que remove a primeira ocorrência de um valor específico na lista. 
 * Se o valor não for encontrado, a lista deve permanecer inalterada.
 */

/*
 * 04 - Tamanho da LinkedList
 * Crie um método recursivo size na classe LinkedList que retorna o número de 
 * elementos presentes na lista. Não use atributos adicionais para armazenar o 
 * tamanho; percorra a lista recursivamente para contar os elementos.
 */

/*
 * 05 - Verificação de Existência de um Elemento
 * Implemente um método recursivo contains na classe LinkedList que retorna 
 * true se um valor específico estiver presente na lista e false caso contrário.
 */

/*
 * 06 - Inversão da LinkedList
 * Escreva um método recursivo reverse na classe LinkedList que inverte a ordem 
 * dos elementos da lista. A inversão deve ser feita sem criar uma nova lista, 
 * apenas manipulando os nós existentes.
 */

/*
 * 07 - União de Duas LinkedLists
 * Crie um método recursivo union na classe LinkedList que recebe outra LinkedList 
 * como parâmetro e retorna uma nova lista contendo a união dos elementos das duas 
 * listas, sem duplicatas.
 */

/*
 * 08 - Interseção de Duas LinkedLists
 * Implemente um método recursivo intersection na classe LinkedList que recebe outra 
 * LinkedList como parâmetro e retorna uma nova lista contendo apenas os elementos comuns às duas listas.
 */

/*
 * 09 - Ordenação de uma LinkedList
 * Escreva um método recursivo sort na classe LinkedList que ordena os elementos da lista em 
 * ordem crescente. Use o algoritmo de ordenação de sua preferência (ex: Merge Sort).
 */

/*
 * 10 - Remoção de Duplicatas
 * Implemente um método recursivo removeDuplicates na classe LinkedList que remove todas as 
 * ocorrências duplicadas de elementos na lista, mantendo apenas a primeira ocorrência de cada valor.
 */