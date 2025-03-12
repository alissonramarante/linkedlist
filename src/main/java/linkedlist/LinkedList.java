package linkedlist;

public interface LinkedList {
    // Questão 1: Inserção no início e no final
    void insertAtStart(int data);
    void insertAtEnd(int data);

    // Questão 2: Inserção em posição específica
    void insertAtPosition(int position, int data);

    // Questão 3: Remoção por valor
    void removeByValue(int data);

    // Questão 4: Tamanho da lista
    int size();

    // Questão 5: Verificação de existência de um elemento
    boolean contains(int data);

    // Questão 6: Inversão da lista
    void reverse();

    // Questão 7: União de duas listas
    LinkedList union(LinkedList otherList);

    // Questão 8: Interseção de duas listas
    LinkedList intersection(LinkedList otherList);

    // Questão 9: Ordenação da lista
    void sort();

    // Questão 10: Remoção de duplicatas
    void removeDuplicates();

    // Método auxiliar para impressão da lista
    void printList();
}
