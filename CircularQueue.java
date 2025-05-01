public class CircularQueue {
    private Node front;
    private Node rear;

    public CircularQueue() {
        this.front = null;
        this.rear = null;
    }

    // Додати елемент в чергу
    public void enqueue(int data) {
        Node newNode = new Node(data);
        
        // Якщо черга пуста
        if (front == null) {
            front = newNode;
            rear = newNode;
            rear.next = front;  // Зробити чергу круговою
        } else {
            // Додати новий вузол в кінець
            rear.next = newNode;
            rear = newNode;
            // Зробити чергу круговою
            rear.next = front;
        }
    }

    // Видалити елемент з черги
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Черга пуста");
        }

        int data = front.data;

        // Якщо це останній елемент
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            rear.next = front;  // Оновити круговий зв'язок
        }

        return data;
    }

    // Перевірити чи черга пуста
    public boolean isEmpty() {
        return front == null;
    }

    // Показати перший елемент без видалення
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Черга пуста");
        }
        return front.data;
    }

    // Вивести всі елементи черги
    public void print() {
        if (isEmpty()) {
            System.out.println("Черга пуста");
            return;
        }

        Node temp = front;
        System.out.print("Елементи черги: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }
} 