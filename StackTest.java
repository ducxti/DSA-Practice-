public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        System.out.println("Стек пустий? " + stack.isEmpty());  // true

        // Додаємо елементи
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Розмір стеку: " + stack.size());  // 3
        System.out.println("Верхній елемент: " + stack.peek());  // 3

        // Видаляємо елементи
        System.out.println("Видалений елемент: " + stack.pop());  // 3
        System.out.println("Видалений елемент: " + stack.pop());  // 2

        System.out.println("Розмір стеку після видалення: " + stack.size());  // 1
        System.out.println("Стек повний? " + stack.isFull());  // false
    }
} 