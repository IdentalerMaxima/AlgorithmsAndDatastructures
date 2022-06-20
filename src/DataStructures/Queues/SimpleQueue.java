package DataStructures.Queues;
/**
 * A queue is a FIFO linear data structure just
 * like in real life. First in is first out.
 *
 * Operations:
 * -Create queue, isEmpty, isFull, peek, enqueue, dequeue, print queue.
 *
 * Time complexity for operations is O(1), pr O(n) depending.
 *
 * Applications can be:
 * -CPU task
 * -IO operations
 * -Call centers
 */

public abstract class SimpleQueue {
    public static int queue[];
    public static int front, rear, sizeOfQueue;

    /**
     * Front and rear are set to -1!
     * @param size
     */
    public static void createQueue(int size){
        queue = new int[size];
        front = rear = -1;
        sizeOfQueue = size;
    }

    public static void enqueue(int numberToEnqueue){
        if (!isFull()){
            rear++;
            queue[rear] = numberToEnqueue;
        }
        else {
            System.out.println("Queue is full");
        }
    }

    /**
     * When the last item is dequeued both front and rear are set to
     * -1 meaning the queue is empty and reset.
     */
    public static void dequeue(){
        if (!isEmpty()){
            if (front == sizeOfQueue){
                front = rear = -1;
            }
            else{
                front++;
            }
        }
        else {
            System.out.println("Queue is empty");
        }
    }
    public static boolean isEmpty(){
        return (front == -1 && rear == -1);
    }
    public static boolean isFull(){
        return (rear == sizeOfQueue - 1);
    }
    public static void print(){
        if(!(isEmpty())){
            while (front < rear){
                System.out.println(queue[front + 1]);
                front++;
            }
        }
        else {
            System.out.println("Queue is empty!");
        }
    }




}
