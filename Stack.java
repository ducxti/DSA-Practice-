public class Stack {
    private int[] storage;
    private int top;
    private final int capacity;

    // Конструктор
    public Stack(int size) {
        storage = new int[size];
        capacity = size;
        top = -1;
    }

    // Додати елемент у стек
    public boolean push(int data) {
        if (isFull()) {
            return false;
        }
        storage[++top] = data;
        return true;
    }

    // Видалити та повернути верхній елемент
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пустий");
        }
        return storage[top--];
    }

    // Подивитись верхній елемент без видалення
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пустий");
        }
        return storage[top];
    }

    // Отримати розмір стеку
    public int size() {
        return top + 1;
    }

    // Перевірити чи стек повний
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Перевірити чи стек пустий
    public boolean isEmpty() {
        return top == -1;
    }
    
} 