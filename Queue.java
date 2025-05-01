public class Queue {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    // Конструктор
    public Queue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Додати елемент в кінець черги
    public boolean enqueue(int element) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        array[rear] = element;
        size++;
        return true;
    }

    // Видалити та повернути елемент з початку черги
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Черга пуста");
        }
        int element = array[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    // Подивитись перший елемент без видалення
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Черга пуста");
        }
        return array[front];
    }

    // Перевірити чи черга пуста
    public boolean isEmpty() {
        return size == 0;
    }

    // Перевірити чи черга повна
    public boolean isFull() {
        return size == capacity;
    }

    // Отримати поточний розмір черги
    public int size() {
        return size;
    }
} 