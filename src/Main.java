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

        //System.out.println("Is the queue empty?: " + DataStructures.Queues.Deque.isEmpty());
        //System.out.println("Is the queue full?: " + DataStructures.Queues.Deque.isFull());

        /*DataStructures.Queues.Deque.enqueueFront(1);
        System.out.println(DataStructures.Queues.Deque.queue[0]);
        System.out.println(DataStructures.Queues.Deque.queue[1]);
        System.out.println(DataStructures.Queues.Deque.queue[2]);
        System.out.println("-------------------------------------");

        DataStructures.Queues.Deque.enqueueFront(2);
        System.out.println(DataStructures.Queues.Deque.queue[0]);
        System.out.println(DataStructures.Queues.Deque.queue[1]);
        System.out.println(DataStructures.Queues.Deque.queue[2]);
        System.out.println("-------------------------------------");

        DataStructures.Queues.Deque.enqueueFront(3);
        System.out.println(DataStructures.Queues.Deque.queue[0]);
        System.out.println(DataStructures.Queues.Deque.queue[1]);
        System.out.println(DataStructures.Queues.Deque.queue[2]);
        System.out.println("-------------------------------------");*/

        /*DataStructures.Queues.Deque.enqueueRear(1);
        System.out.println(DataStructures.Queues.Deque.queue[0]);
        System.out.println(DataStructures.Queues.Deque.queue[1]);
        System.out.println(DataStructures.Queues.Deque.queue[2]);
        System.out.println("-------------------------------------");

        DataStructures.Queues.Deque.enqueueRear(2);
        System.out.println(DataStructures.Queues.Deque.queue[0]);
        System.out.println(DataStructures.Queues.Deque.queue[1]);
        System.out.println(DataStructures.Queues.Deque.queue[2]);
        System.out.println("-------------------------------------");

        DataStructures.Queues.Deque.enqueueRear(3);
        System.out.println(DataStructures.Queues.Deque.queue[0]);
        System.out.println(DataStructures.Queues.Deque.queue[1]);
        System.out.println(DataStructures.Queues.Deque.queue[2]);
        System.out.println("-------------------------------------");

        System.out.println(DataStructures.Queues.Deque.isEmpty());
        System.out.println(DataStructures.Queues.Deque.isFull());

        System.out.println(Deque.front);
        System.out.println(Deque.rear);
        System.out.println("-------------------------------------");*/


        /*System.out.println("Front  = " + Deque.front);
        System.out.println("Rear  = " + Deque.rear);
        DataStructures.Queues.Deque.enqueueFront(1);
        System.out.println("Front  = " + Deque.front);
        System.out.println("Rear  = " + Deque.rear);
        System.out.println(DataStructures.Queues.Deque.queue[0]);
        System.out.println(DataStructures.Queues.Deque.queue[1]);
        System.out.println(DataStructures.Queues.Deque.queue[2]);
        System.out.println("-------------------------------------");

        DataStructures.Queues.Deque.enqueueFront(2);
        System.out.println("Front  = " + Deque.front);
        System.out.println("Rear  = " + Deque.rear);
        System.out.println(DataStructures.Queues.Deque.queue[0]);
        System.out.println(DataStructures.Queues.Deque.queue[1]);
        System.out.println(DataStructures.Queues.Deque.queue[2]);
        System.out.println("-------------------------------------");

        DataStructures.Queues.Deque.enqueueFront(3);
        System.out.println("Front  = " + Deque.front);
        System.out.println("Rear  = " + Deque.rear);
        System.out.println(DataStructures.Queues.Deque.queue[0]);
        System.out.println(DataStructures.Queues.Deque.queue[1]);
        System.out.println(DataStructures.Queues.Deque.queue[2]);
        System.out.println("-------------------------------------");

        System.out.println(DataStructures.Queues.Deque.isEmpty());
        System.out.println(DataStructures.Queues.Deque.isFull());
        System.out.println("-------------------------------------");*/

        System.out.println("Front  = " + Deque.front);
        System.out.println("Rear  = " + Deque.rear);

        DataStructures.Queues.Deque.enqueueFront(1);
        System.out.println("added 1");
        System.out.println("Front  = " + Deque.front);
        System.out.println("Rear  = " + Deque.rear);
        DataStructures.Queues.Deque.enqueueFront(2);
        System.out.println("added 2");
        System.out.println("Front  = " + Deque.front);
        System.out.println("Rear  = " + Deque.rear);
        DataStructures.Queues.Deque.enqueueFront(3);
        System.out.println("added 3");
        System.out.println("Front  = " + Deque.front);
        System.out.println("Rear  = " + Deque.rear);

        DataStructures.Queues.Deque.printDeque();

        /*System.out.println("Front  = " + Deque.front);
        System.out.println("Rear  = " + Deque.rear);
        DataStructures.Queues.Deque.dequeueFront();
        DataStructures.Queues.Deque.dequeueFront();
        System.out.println("--------------------------");
        System.out.println(DataStructures.Queues.Deque.queue[0]);
        System.out.println(DataStructures.Queues.Deque.queue[1]);
        System.out.println(DataStructures.Queues.Deque.queue[2]);
        System.out.println("Front  = " + Deque.front);
        System.out.println("Rear  = " + Deque.rear);*/



    }
}