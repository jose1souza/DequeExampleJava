import java.util.Deque;
import java.util.LinkedList;
public class DequeExample {
public static void main(String[] args) {
// Criação de uma Deque usando LinkedList
Deque<String> deque = new LinkedList<>();
// Adicionando elementos na deque
deque.addFirst("Primeiro");
deque.addLast("Último");
// Consultando elementos
System.out.println("Primeiro elemento: " + deque.getFirst());
System.out.println("Último elemento: " + deque.getLast());
// Removendo elementos
deque.removeFirst();
deque.removeLast();
// Verificando se a deque está vazia
System.out.println("Deque está vazia? " + deque.isEmpty());
}
}
