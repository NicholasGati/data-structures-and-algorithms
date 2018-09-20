/**
 * Queue
 * FIFO - First In First Out.
 * A queue is like standing in a line. If you're the first one on the line, you go first. Then the next.
 */

  public class Queue {
    private int maxSize; // initializes the set number of slots
    private long[] queueArray; // slots to contain the data
    private int front; // index position for the element in the front
    private int rear; // index position for the element in the backprivate 
    private int nItems; // counter to maintain the number of items in the queue

    public Queue(int size) {
      this.maxSize = size;
      this.queueArray = new long [maxSize];
      this.front = 0;
      this.rear = -1; // there is no item in the array yet to be considered as the last item
      this.nItems = 0; // no elements in the array yet
    }

    public boolean isEmpty() {
      return nItems == 0;
    }

    public boolean isFull() {
      return nItems == maxSize;
    }

    // puts elements at the end of the queue
    public void insert(long j) {
      if (!isFull()) {
        rear++;
        queueArray[rear] = j;
        nItems++;
      }
    }

    /**
     * This is an insert function for a Circular Queue.
     * Circular Queues overwrite the elements when you try to put in too many.
     * So, it doesn't stop at the max size, it goes back to the front of the queue
     * and overwrites them with the new data. 
     */
    public void insert2(long j) { 
      if (rear == maxSize -1) {
        rear = -1;
      }

      rear++;
      queueArray[rear] = j;
      nItems++;
    }

    // remove from the front of the queue.
    public long remove() { 
      if (!isEmpty()) {
        long temp = queueArray[front];
        front++; // point to the next "front" of the line since we "remove" the previous one.

        if (front == maxSize) {
          front = 0; // set front back to 0th index so that we can utilize the entire array again.
        }
        nItems--;

        return temp;
      }

      return -1;
    }

    public long peakFront() {
      return queueArray[front]; 
    }

    public void view() {
      System.out.print("[ ");
      for (int i = 0; i < queueArray.length; i++) {
        System.out.print(queueArray[i] + " ");
      }
      System.out.println(" ]");
    } 
  }
