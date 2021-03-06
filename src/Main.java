import DataStructures.Queues.Deque;

public class Main {
    public static void main(String[] args) {
        /*
                                    STACK TESTS

        DataStructures.Stack.createStack(3);
        System.out.println("Is the stack empty?: " + DataStructures.Stack.isEmpty());
        System.out.println("Is the stack full?: " + DataStructures.Stack.isFull());

        DataStructures.Stack.push(1);
        DataStructures.Stack.push(2);
        DataStructures.Stack.push(3);
        DataStructures.Stack.printStack();

        DataStructures.Stack.pop();
        System.out.println("Is the stack empty?: " + DataStructures.Stack.isEmpty());
        System.out.println("Is the stack full?: " + DataStructures.Stack.isFull());
         */


                                    //QUEUE TESTS

                                            //Simple Queue

        /*DataStructures.Queues.SimpleQueue.createQueue(2);
        DataStructures.Queues.SimpleQueue.enqueue(1);
        DataStructures.Queues.SimpleQueue.dequeue();
        DataStructures.Queues.SimpleQueue.enqueue(11);

        DataStructures.Queues.SimpleQueue.print();*/

                                            //Circular queue

        /*DataStructures.Queues.Queue.createQueue(3);

        System.out.println("Is the queue empty?: " + DataStructures.Queues.Queue.isEmpty());
        System.out.println("Is the queue full?: " + DataStructures.Queues.Queue.isFull());

        DataStructures.Queues.Queue.enqueue(1);
        DataStructures.Queues.Queue.enqueue(2);
        DataStructures.Queues.Queue.enqueue(3);
        System.out.println("Front: " + Queue.front);
        System.out.println("Rear: " + Queue.rear);

        DataStructures.Queues.Queue.printQueue();*/

                                            //Deque
        DataStructures.Queues.Deque.createDeque(3);

        /*System.out.println( Deque.queue[0]);
        System.out.println( Deque.queue[1]);
        System.out.println( Deque.queue[2]);

        DataStructures.Queues.Deque.printDeque();*/

        /*DataStructures.Queues.Deque.enqueueRear(1);
        DataStructures.Queues.Deque.enqueueRear(2);
        DataStructures.Queues.Deque.enqueueRear(3);

        DataStructures.Queues.Deque.dequeueRear();
        DataStructures.Queues.Deque.dequeueRear();
        DataStructures.Queues.Deque.dequeueRear();


        DataStructures.Queues.Deque.printDeque();*/

        /*DataStructures.Queues.Deque.enqueueFront(1);
        DataStructures.Queues.Deque.enqueueFront(2);
        DataStructures.Queues.Deque.enqueueFront(3);

        DataStructures.Queues.Deque.dequeueFront();
        DataStructures.Queues.Deque.dequeueFront();
        DataStructures.Queues.Deque.dequeueFront();

        DataStructures.Queues.Deque.printDeque();
*/









    }
}