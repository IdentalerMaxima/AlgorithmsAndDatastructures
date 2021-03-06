package DataStructures.Queues;


/**
 * A Deque or double ended queue is queue where both enqueue and dequeue
 * operations can be made in the rear or front of queue.
 *
 * There are two types:
 * -Input restricted queues
 * -Output restricted queues
 */
public abstract class Deque {

    public static int front, rear, sizeOfQueue;
    public static int queue[];

    /**
     * When creating a new deque we set the front and rear values
     * to -1, meaning its empty;
     *
     * @param size The size of the queue
     */
    public static void createDeque(int size) {
        queue = new int[sizeOfQueue = size];
        front = -1;
        rear = -1;
    }

    public static boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * If front is before rear by 1, it means the queue is full
     *
     * @return
     */
    public static boolean isFull() {
        return ((front == 0 && rear == sizeOfQueue - 1) || front == rear + 1);
    }

    public static void enqueueFront(int toEnqueue) {
        if (!isFull()) {
            if (front == -1) {
                front = rear = 0;
            } else if (front == 0) {
                front = sizeOfQueue - 1;
            } else {
                front--;
            }
            queue[front] = toEnqueue;
        } else {
            System.out.println("Queue is full");
        }
    }

    public static void enqueueRear(int toEnqueue) {
        if (!isFull()) {
            if (rear == -1) {
                front = rear = 0;
            } else if (rear == sizeOfQueue - 1) {
                rear = 0;
            } else {
                rear++;
            }
            queue[rear] = toEnqueue;

        } else {
            System.out.println("Queue is full");
        }
    }

    public static void dequeueFront() {
        if (!isEmpty()) {
            if (!isFull() && front == rear) {
                front = rear = -1;
            } else {
                if (front == sizeOfQueue - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        } else {
            System.out.println("Queue is empty");
        }
    }

    public static void dequeueRear() {
        if (!isEmpty()) {
            if (!isFull() && rear == front) {
                front = rear = -1;
            } else {
                if (rear == 0) {
                    rear = sizeOfQueue - 1;
                } else {
                    rear--;
                }
            }
        } else {
            System.out.println("Queue is empty");
        }
    }

    public static void printDeque() {
        if (!(isEmpty())) {
            while (front != rear) {
                if (front == sizeOfQueue - 1) {
                    System.out.println(queue[front]);
                    front = 0;
                } else {
                    System.out.println(queue[front]);
                    front++;
                }
            }
            System.out.println(queue[rear]);


        } else {
            System.out.println("Queue is empty");
        }
    }
}
