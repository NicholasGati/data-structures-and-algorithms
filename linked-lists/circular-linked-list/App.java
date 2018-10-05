public class App {

  public static void main(String[] args) {
    CircularLinkedList cll = new CircularLinkedList();

    // Insert as first node.
    cll.insertFirst(100);
    cll.insertFirst(50);
    cll.insertFirst(99);
    cll.insertFirst(88);
    cll.displayList();

    // Insert as last node.
    cll.insertLast(754);
    cll.insertLast(2);
    cll.displayList();
  }
}
