public class App {

  public static void main(String[] args) {
    SinglyLinkedList sll = new SinglyLinkedList();

    // Insert as first node.
    sll.insertFirst(100);
    sll.insertFirst(50);
    sll.insertFirst(99);
    sll.insertFirst(88);
    sll.displayList();

    // Insert as last node.
    sll.insertLast(754);
    sll.insertLast(2);
    sll.displayList();
  }
}
