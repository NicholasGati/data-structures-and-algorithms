public class App {
  public static void main(String[] args) {
    /**
     * Initialize a Stack.
     */
    Stack theStack = new Stack(3);
    theStack.push(20);
    theStack.push(40);
    theStack.push(60);
    theStack.push(80);

    // Print out contents of stack.
    System.out.print("[ ");
    while (!theStack.isEmpty()) {  
      long value = theStack.pop();
      System.out.print(value + " ");
    }
    System.out.println(" ]");

    /**
     * Using a character stack.
     */
    System.out.println(reverse("nicholas"));
    System.out.println(reverse("hello"));
    System.out.println(reverse("data structures and algorithms"));

    /**
     * Initialize a Queue.
     */
    Queue theQueue = new Queue(5);
    theQueue.insert(40);
    theQueue.insert(10);
    theQueue.insert(3);
    theQueue.insert(19);
    theQueue.insert(76);
    theQueue.view();

    System.out.println(theQueue.remove());
    System.out.println(theQueue.remove());
  }

  public static String reverse(String word) {
    int wordLength = word.length(); // get the stack's max size
    CharStack wordStack = new CharStack(wordLength); // we make the stack

    for (int i = 0; i < wordLength; i++) {
      char letter = word.charAt(i); // get the character at position i
      wordStack.push(letter); // push the character into the stack
    }

    String reverseWord = "";
    while (!wordStack.isEmpty()) {
      reverseWord += Character.toString(wordStack.pop()); // append to the output
    }

    return reverseWord;
  }
}