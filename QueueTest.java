public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        System.out.println("Черга пуста? " + queue.isEmpty());  // true

        // Додаємо елементи
        System.out.println("\nДодаємо елементи:");
        System.out.println("Додано 1: " + queue.enqueue(1));
        System.out.println("Додано 2: " + queue.enqueue(2));
        System.out.println("Додано 3: " + queue.enqueue(3));
        System.out.println("Додано 4: " + queue.enqueue(4));

        System.out.println("\nРозмір черги: " + queue.size());  // 4
        System.out.println("Перший елемент: " + queue.peek());  // 1

        // Видаляємо елементи
        System.out.println("\nВидаляємо елементи:");
        System.out.println("Видалено: " + queue.dequeue());  // 1
        System.out.println("Видалено: " + queue.dequeue());  // 2

        System.out.println("\nРозмір черги після видалення: " + queue.size());  // 2
        System.out.println("Черга повна? " + queue.isFull());  // false

        // Додаємо ще елементи
        System.out.println("\nДодаємо ще елементи:");
        System.out.println("Додано 5: " + queue.enqueue(5));
        System.out.println("Додано 6: " + queue.enqueue(6));
        System.out.println("Спроба додати 7: " + queue.enqueue(7));  // false, черга повна

        System.out.println("\nФінальний розмір черги: " + queue.size());
        System.out.println("Черга повна? " + queue.isFull());
    }
} 