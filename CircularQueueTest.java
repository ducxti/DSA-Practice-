public class CircularQueueTest {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        System.out.println("Перевірка пустої черги:");
        System.out.println("Черга пуста? " + queue.isEmpty());
        queue.print();

        System.out.println("\nДодаємо елементи:");
        queue.enqueue(1);
        queue.print();
        queue.enqueue(2);
        queue.print();
        queue.enqueue(3);
        queue.print();
        queue.enqueue(4);
        queue.print();

        System.out.println("\nПеревіряємо перший елемент:");
        System.out.println("Перший елемент: " + queue.peek());

        System.out.println("\nВидаляємо елементи:");
        System.out.println("Видалено: " + queue.dequeue());
        queue.print();
        System.out.println("Видалено: " + queue.dequeue());
        queue.print();

        System.out.println("\nДодаємо нові елементи:");
        queue.enqueue(5);
        queue.print();
        queue.enqueue(6);
        queue.print();

        System.out.println("\nВидаляємо всі елементи:");
        while (!queue.isEmpty()) {
            System.out.println("Видалено: " + queue.dequeue());
            queue.print();
        }

        System.out.println("\nПеревірка пустої черги:");
        System.out.println("Черга пуста? " + queue.isEmpty());
    }
} 