package DataStructures;
/**
 * A queue is a FIFO linear data structure just
 * like in real life. First in is first out.
 *
 * Operations:
 * -Create queue, isEmpty, isFull, peek, enqueue, dequeue, print queue.
 */
public abstract class Queue {
    public static int array[];
    public static int front, rear;
    public static int sizeOfQueue, itemsInQueue;

    /**
     * This method creates a queue of given size.
     * Front, rear and itemsInQueue variables are set to 0.
     * Front is the first element of the queue, rear is the last if they are the same
     * that means that either the queue is full or empty.
     *
     * @param sizeGiven This parameter represents the size of the queue.
     *
     */
    public static void createQueue(int sizeGiven){
        array = new int[sizeGiven];
        front = 0;
        rear = 0;
        sizeOfQueue = sizeGiven;
        itemsInQueue = 0;
    }

    /**
     * This method returns true if the number of items in the queue is
     * 0, otherwise returns false.
     * @return
     */
    public static boolean isEmpty(){
        return itemsInQueue == 0;
    }

    /**
     * This method returns true if the number of items in the queue
     * equals the size of the queue meaning is full.
     * Otherwise returns false.
     * @return
     */
    public static boolean isFull(){
        return itemsInQueue == sizeOfQueue;
    }

    /**
     * This method returns the value of the
     * item in the front of the queue.
     * @return
     */
    public static int peek(){
        return array[front];
    }

    /**
     * This method checks first if the queue is full, if not
     * adds the enqueued number to the rear of the queue and moves the rear by one.
     * If the rear were to reach the end of the queue its moved to the first place.
     * The number of items in the queue is incremented by one.
     *
     * @param enqueuedNumber This is the value added to the queue.
     */
    public static void enqueue(int enqueuedNumber){
        if (!isFull()){

            array[rear] = enqueuedNumber;
            rear = (rear + 1) % sizeOfQueue;
            itemsInQueue++;
        }
        else {
            System.out.println("Queue full!");
        }
    }

    /**
     * This method checks if the queue is empty, if not it proceeds to
     * increment the value of the rear by 1, if it were to reach
     * the end of the queue it will be set to 0.
     * After that, the number of items in queue is decremented.
     */
    public static void dequeue(){
        if(!isEmpty()){
            front = (front + 1) % sizeOfQueue;
            itemsInQueue--;
        }
        else {
            System.out.println("Queue is empty");
        }
    }

    /**
     * This method prints the queue.
     * If the method is full it prints all elements, otherwise it
     * prints elements from front to rear.
     */
    public static void printQueue(){
        if(isFull()){
            for (int i : array)  {
                System.out.println(i);
            }
        }
        else if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else if (!(front == rear)){
            while(front != rear){
                System.out.println(array[front]);
                front = (front + 1) % sizeOfQueue;
            }
        }
    }
}