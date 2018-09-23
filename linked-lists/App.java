public class App {
  public static void main(String[] args) {
    Node nodeA = new Node(4);
    Node nodeB = new Node(3);
    Node nodeC = new Node(7);
    Node nodeD = new Node(8);
   
    /**
     * This is the point where the data structure, Node, becomes a Linked List.
     * They have to be "linked" in order for it to be a linked list.
     * The Node by itself is not a linked list. It's just a construct.
     * However, an abstract data type that we'll call LinkedList is necessary to
     * provide utility methods used to manage a linked list.
     */
    nodeA.next = nodeB;
    nodeB.next = nodeC;
    nodeC.next = nodeD;

    System.out.println(listLength(nodeA)); // 4
    System.out.println(listLength(nodeB)); // 3
  }

  public static int listLength(Node node) {
    int length = 0;
    Node current = node;

    while (current != null) {
      length++;
      current = current.next;
    }

    return length;
  }
}