# Projeto: Implementação de uma LinkedList em Java

Este projeto consiste na implementação de uma **LinkedList** (lista encadeada) em Java, com métodos para manipulação e operações avançadas sobre a lista. Abaixo está a documentação detalhada de cada método da classe `LinkedList`.

---

## Métodos da Classe `LinkedList`

### 1. `public boolean isEmpty()`
- **Descrição**: Verifica se a lista está vazia.
- **Retorno**: `true` se a lista estiver vazia, `false` caso contrário.

---

### 2. `public int size()`
- **Descrição**: Retorna o número de elementos na lista.
- **Retorno**: Um inteiro representando o tamanho da lista.

---

### 3. `public T search(T element)`
- **Descrição**: Busca um elemento na lista.
- **Retorno**: O elemento encontrado ou `null` se o elemento não estiver na lista.

---

### 4. `public boolean searchPosition(int position, T element)`
- **Descrição**: Verifica se um elemento está presente em uma posição específica da lista.
- **Retorno**: `true` se o elemento estiver na posição especificada, `false` caso contrário.

---

### 5. `public void insertFirst(T element)`
- **Descrição**: Insere um elemento no início da lista.

---

### 6. `public void insertLast(T element)`
- **Descrição**: Insere um elemento no final da lista.

---

### 7. `public void insertPosition(int position, T element)`
- **Descrição**: Insere um elemento em uma posição específica da lista.

---

### 8. `public void removeFirst(T element)`
- **Descrição**: Remove o primeiro elemento da lista.

---

### 9. `public void removeLast(T element)`
- **Descrição**: Remove o último elemento da lista.

---

### 10. `public void removeValue(T element)`
- **Descrição**: Remove a primeira ocorrência de um elemento na lista.

---

### 11. `public void removePosition(T element)`
- **Descrição**: Remove o elemento em uma posição específica da lista.

---

### 12. `public T[] toArray()`
- **Descrição**: Converte a lista em um array.
- **Retorno**: Um array contendo todos os elementos da lista.

---

### 13. `public void removeDuplicates()`
- **Descrição**: Remove todos os elementos duplicados da lista, mantendo apenas a primeira ocorrência de cada valor.

---

### 14. `public void unionList(LinkedList<T> l1, LinkedList<T> l2)`
- **Descrição**: Recebe duas listas encadeadas e retorna uma nova lista que seja a união das duas, sem elementos repetidos.

---

### 15. `public void mergedList(LinkedList<T> l1, LinkedList<T> l2)`
- **Descrição**: Recebe duas listas ordenadas e retorna uma nova lista que seja a mesclagem das duas, mantendo a ordem.

---

### 16. `public void sortedList(T element)`
- **Descrição**: Insere um novo elemento na lista de forma que ela permaneça ordenada em ordem crescente.

---

### 17. `public void intersectionList(LinkedList<T> l1, LinkedList<T> l2)`
- **Descrição**: Recebe duas listas encadeadas e retorna uma nova lista contendo apenas os elementos que estão presentes em ambas as listas.

---

### 18. `public void reverse()`
- **Descrição**: Inverte a ordem dos elementos da lista.

---

### 19. `public void rotateRight()`
- **Descrição**: Rotaciona a lista em `k` posições para a direita.

---

### 20. `public boolean isPalindrome()`
- **Descrição**: Verifica se a lista é um palíndromo (ou seja, se a sequência de elementos é a mesma quando lida de trás para frente).
- **Retorno**: `true` se a lista for um palíndromo, `false` caso contrário.

---

### 21. `public T findMiddle()`
- **Descrição**: Retorna o valor do nó que está no meio da lista. Se a lista tiver um número par de elementos, retorna o segundo nó do meio.
- **Retorno**: O valor do nó do meio.

---

### 22. `public boolean contains(T element)`
- **Descrição**: Verifica se a lista contém um elemento específico.
- **Retorno**: `true` se o elemento estiver na lista, `false` caso contrário.

---