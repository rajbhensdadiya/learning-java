public class LinkedList {
    Node head;

    public void insertAtEnd(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtHead(int data) {
        Node node;
        node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAtIndex(int index, int data) {
        Node node;
        node = new Node();
        node.data = data;

        if (index < 0) {
            System.out.println("Invalid index");
        }

       else if (index == 0) {
            insertAtHead(data);
        }
       else {
           Node n = head;
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAtIndex(int index) {

        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node prev = null;
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            prev = n.next;
            n.next = prev.next;
            System.out.println("Deleted " + prev.data);
        }
    }

    public void showLinkedList() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("X");
        }
    }
}
