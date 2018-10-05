/**
 * Singly-Linked List
 */

public class SinglyLinkedList {
  // required in a Linked List.
  private Node first;

  public SinglyLinkedList() {
    // constructor
  }

  public boolean isEmpty() {
    return (first == null);
  }

  // Inserts at the beginning of the list.
  public void insertFirst(int data) {
    // 1. Create a new node to insert.
    Node newNode = new Node(data);

    // 2. Assign its "next" field to the current first node.
    newNode.next = first;

    // 3. Assign the "first" node in the list to this new node.
    first = newNode;
  }

  public void insertLast(int data) {
    Node current = first;
    while (current.next != null) {
      current = current.next;
    }

    Node newNode = new Node(data);
    current.next = newNode;
  }

  public Node deleteFirst() {
    // So that we can return it afterwards, assing node to a temp variable.
    Node temp = first;

    // Reassign "first" to first.next, which is the node after the one we are deleting.
    first = first.next;

    // Return the "deleted" node. (Really, we are just no longer referencing it.)
    return temp;
  }

  public void displayList() {
    System.out.println("List (First -> Last) ");

    Node current = first;
    while (current != null) {
      // Display current node.
      current.displayNode();

      // Change which node is current.
      current = current.next;
    }

    System.out.println();
  }
}
