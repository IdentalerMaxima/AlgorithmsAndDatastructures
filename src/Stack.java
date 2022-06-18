/**
 * A stack is a linear data structure where the last input
 * is the first output. (LIFO)
 * Operations are:
 * -Pop, push, top, isEmpty, isFull, createStack.
 */

public class Stack {
    private static int array[];
    private static int stackCapacity;
    private static int topOfStack;

    /**
     * This method creates the desired stack.
     *
     * @param sizeOfStack is the size (capacity) of the created stack.
     */
    public static void createStack(int sizeOfStack) {
        array = new int[sizeOfStack];
        stackCapacity = sizeOfStack;
        topOfStack = -1;
    }

    /**
     * This method returns either true or false
     * after checking if the top of the stack is
     * equal to the default -1, which means it has no items.
     *
     * @return
     */
    public static boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method returns either true or false
     * after checking if the top of the stack is
     * equal to the capacity of the stack -1
     * meaning its full
     *
     * @return
     */
    public static boolean isFull() {
        if (topOfStack == stackCapacity - 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * If the stack is not empty the top value
     * is decremented by 1, removing the top item
     * from the stack.
     */
    public static void pop() {
        if (!isEmpty()) {
            topOfStack--;
        } else {
            System.out.println("Stack is empty");
        }
    }

    /**
     * If the stack is not full the top value
     * is incremented by 1 and a new integer is
     * added to the stack.
     *
     * @param numberPushed This is the integer added to
     *                     the stack.
     */
    public static void push(int numberPushed) {
        if (!isFull()) {
            topOfStack++;
            array[topOfStack] = numberPushed;
        } else {
            System.out.println("Stack is full!");
        }
    }

    /**
     * This method prints values from the array until
     * we reach the top. Reaching the top means
     * we have printed all elements from the stack.
     */
    public static void printStack(){
            for (int itemIndex = 0; itemIndex < topOfStack + 1; itemIndex++){
                System.out.printf(array[itemIndex] + " ");
            }
            System.out.println("");
    }

    /**
     * This method returns the top value
     * from the stack.
     * @return
     */
    public static int getTop(){
        return array[topOfStack];
    }
}
