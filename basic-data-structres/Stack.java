/**
 * Stack
 * FILO/LIFO
 * FILO = First In Last Out.
 * LIFO = Last In First Out.
 * 
 * Push onto top of stack.    Pop off of top of stack. 
 *          |                           ^
 *          |                           |
 *          V                           |
*          ____                        ____
*          |  |                        |  |
*          ____                        ____
*          |  |                        |  |
*          ____                        ____
*          |  |                        |  |
*          ____                        ____
*
*/

/**
 * When we pop(), we aren't actually removing anything. We are changing the index of "top" which is a pointer to the place where the stack begins.
 * The cells in the array are being overwritten with new data and when we use pop, the pointer is reduced by 1.
 * 
 * Since this is LIFO, this is one of the ways Math or code is parsed. It parses the parenthesis where the last opening parenthesis shoud be the first one to close. I used this in a CodeSignal challenge and it worked great! 
 */

public class Stack {
  private int maxSize;
  private long[] stackArray;
  private int top; // represent index of the last item that was placed on the top of the stack.

  public Stack(int size) {
    this.maxSize = size;
    this.stackArray = new long[maxSize];
    this.top = -1; // initialize at -1 since there's nothing in the stack yet!
  }

  public void push(long j) {
    if (isFull()) {
      System.out.println("The stack is already full.");
    } else {
      top++;
      stackArray[top] = j;
    }
  }

  public long pop() {
    if (isEmpty()) {
      System.out.println("The stack is already empty.");
      return -1;
    } else {
      int oldTop = top;
      top--; 
      return stackArray[oldTop];
    }
  }

  public long peak() {
    return stackArray[top];
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top == maxSize -1);
  }
}