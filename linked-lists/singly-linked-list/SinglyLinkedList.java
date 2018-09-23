/**
 * Singly-Linked List
 * Circular linked list is a linked list where all nodes 
 * are connected to form a circle. So, the last node
 * points to the first.
 * 
 * A circular linked list can be a singly circular linked list 
 * or doubly circular linked list.
 */

public class SinglyLinkedList {
  private Node first; // required in a Linked List.
  private Node last;

  public SinglyLinkedList() {

  }

  public boolean isEmpty() {
    return (first == null);
  }

  // Inserts at the beginning of the list.
  public void insertFirst(int data) {
    Node newNode = new Node(data); // 1. Create a new node to insert.
    newNode.next = first;          // 2. Assign its "next" field to the current first node.
    first = newNode;               // 3. Assign the "first" node in the list to this new node.
  }

  /**
    * insertLast(int data)
    * We'll continue to loop until current.next isn't null.
    * When the looop finally ends, we know that "current" is the last node, which
    * means that at this point, we can create a new node and point current.next 
    * (which is the last node) to the newly created node.
    * 
    * Not very efficient algorithm since we have to traverse the entire list until we get to the end!
    */
  public void insertLast(int data) {
    Node current = first;
    while (current.next != null) {
      current = current.next;
    }

    Node newNode = new Node(data);
    current.next = newNode;
    
    // Update "last" reference.
    last = newNode;
  }

  public void insertLastEfficient(int data) {
    Node newNode = new Node(data); // Create new Node.
    Node current = last;           // Assign current node to "last" reference.
    current.next = newNode;        // Set the current/last's next to the newly created Node.
    last = newNode;                // Reassign the "last" reference to the new Node.
  }

  public Node deleteFirst() {
    Node temp = first;    // So that we can return it afterwards, assing node to a temp variable.
    first = first.next;   // Reassign "first" to first.next, which is the node after the one we are deleting.
    return temp;          // Return the "deleted" node. (Really, we are just no longer referencing it.)
  }

  public void displayList() {
    System.out.println("List (First -> Last) ");

    Node current = first;
    while (current != null) {
      current.displayNode();  // Display current node.
      current = current.next; // Change which node is current.
    }

    System.out.println();
  }
}