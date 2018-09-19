public class CharStack {
  private int maxSize;
  private char[] stackArray;
  private int top; // represent index of the last item that was placed on the top of the stack.

  public CharStack(int size) {
    this.maxSize = size;
    this.stackArray = new char[maxSize];
    this.top = -1; // initialize at -1 since there's nothing in the stack yet!
  }

  public void push(char j) {
    if (isFull()) {
      System.out.println("The stack is already full.");
    } else {
      top++;
      stackArray[top] = j;
    }
  }

  public char pop() {
    if (isEmpty()) {
      System.out.println("The stack is already empty.");
      return '0';
    } else {
      int oldTop = top;
      top--; 
      return stackArray[oldTop];
    }
  }

  public char peak() {
    return stackArray[top];
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top == maxSize -1);
  }
}