package linkedlist;

public interface DoubleLinkedList<T> extends LinkedList<T> {

    public void insert(T element);
    public void insertFirst(T element);
    public void removeFirst();
    public void removeLast();
    public int findMax(); // Maior elemento
    public int findMin(); // Menor Elemento
    public void insertAtPosition(int position, int data);
    public void removeAtPosition(int position);

    // 3: k-ésimo menor elemento
    public int kthSmallest(int k);

    // 4: Média dos elementos
    public double calculateAverage();

    // 5: Mediana da lista
    public double findMedian();

    // 6: Verificar se a lista é palíndromo
    public boolean isPalindrome();

    // 7: Rotacionar a lista
    public void rotate(int k);

    // 10: Enésimo nó a partir do fim
    public int nthFromEnd(int n);

}

/*
 * 01 - Maior Elemento da LinkedList
 * Implemente um método findMax na classe DoublyLinkedList 
 * que retorna o maior elemento presente na lista. Se a lista estiver 
 * vazia, lance uma exceção ou retorne um valor específico.
 */

/*
 * 02 - Inserir e Remover em Posição Específica
 * Crie dois métodos na classe DoublyLinkedList:
 * insertAtPosition(int position, int value): Insere um valor em uma posição específica da lista.
 * removeAtPosition(int position): Remove o elemento em uma posição específica da lista.
 * Se a posição for inválida (menor que 0 ou maior que o tamanho da lista), lance uma exceção ou trate o erro de forma adequada.
 */

/*
 * 03 - Estatística de Ordem (k-ésimo Menor Elemento)
 * Implemente um método kthSmallest(int k) na classe DoublyLinkedList que retorna o k-ésimo menor 
 * elemento da lista. Se k for maior que o tamanho da lista, lance uma exceção ou retorne um valor específico.
 */

/*
 * 04 - Média dos Elementos
 * Escreva um método calculateAverage na classe DoublyLinkedList que calcula e retorna a média 
 * dos valores dos elementos da lista. Se a lista estiver vazia, retorne 0 ou lance uma exceção.
*/

/*
 * 05 - Mediana da LinkedList
 * Implemente um método findMedian na classe DoublyLinkedList que retorna a mediana dos valores 
 * da lista. Se a lista tiver um número par de elementos, retorne a média dos dois valores centrais.
 */

/*
 * 06 - Verificar se a LinkedList é Palíndromo
 * Escreva um método isPalindrome na classe DoublyLinkedList que verifica se a lista é um palíndromo, ou seja, 
 * se a sequência de elementos é a mesma quando lida da esquerda para a direita e vice-versa. 
 * Retorne true se for um palíndromo e false caso contrário.
*/

/*
 * 07 - Rotacionar a LinkedList
 * Implemente um método rotate(int k) na classe DoublyLinkedList que rotaciona a lista em k posições para a 
 * direita. Por exemplo, se a lista for [1, 2, 3, 4, 5] e k = 2, a lista resultante deve ser [4, 5, 1, 2, 3].
 */

/*
 * 08 - Dividir a LinkedList em Duas
 * Crie um método splitList(int position) na classe DoublyLinkedList que divide a lista em duas a partir de uma posição específica. 
 * O método deve retornar um array de duas listas: a primeira contendo os elementos até a posição position, 
 * e a segunda contendo os elementos restantes.
 */

/*
 * 09 - Concatenar Duas LinkedLists
 * Implemente um método concatenate(DoublyLinkedList list) na classe DoublyLinkedList que concatena a 
 * lista atual com outra lista passada como parâmetro. A lista atual deve ser modificada para conter todos os elementos das duas listas.
 */

/*
 * Enésimo Nó a Partir do Fim
 * Escreva um método nthFromEnd(int n) na classe DoublyLinkedList que retorna o valor do n-ésimo nó a partir do final da lista. 
 * Se n for maior que o tamanho da lista, lance uma exceção ou retorne um valor específico.
 */