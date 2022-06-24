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
    public static void createDeque(int size){
        queue = new int[sizeOfQueue = size];
        front = -1;
        rear = 0;
    }
    public static boolean isEmpty(){
        return front == -1;
    }
    public static boolean isFull() {
        return front == (rear + 1) % sizeOfQueue;
    }

    public static void enqueueFront(int toEnqueue) {
        if (!isFull()) {
            if (front < 1){
                front = sizeOfQueue - 1;
                queue[front] = toEnqueue;
            }
            else {
                front--;
                queue[front] = toEnqueue;

            }
        } else {
            System.out.println("Queue is full");
        }
    }
    public static void enqueueRear(int toEnqueue){
        if(!isFull()){
            if (rear == sizeOfQueue){
                rear = 0;
                queue[rear] = toEnqueue;
            }
            else {
                queue[rear] = toEnqueue;
                rear++;
            }
        }
        else {
            System.out.println("Queue is full");
        }
    }

    /**
     * If front and rear are the same, that means that the queue has
     * 1 item, then if we remove the last item, we set both rear and
     * front to -1, resetting the queue.
     *
     * @param toDequeue
     */
    public static void dequeueFront(int toDequeue){
        if (front == rear){
            front = rear = -1;
        }
        front = (front - 1) % sizeOfQueue;
        queue[front] = toDequeue;
    }
    public static void dequeueRear(int toDequeue){
        if (front == rear){
            front = rear = -1;
        }
        rear = (rear - 1) % sizeOfQueue;
        queue[rear] = toDequeue;
    }
    public static void printDeque(){
        for (;front < rear; front++){
            System.out.println(queue[front]);
        }
    }


}
