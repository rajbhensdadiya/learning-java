public class Main {
    public static void main(String[] args) {
        LinkedList list;
        list = new LinkedList();

        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.showLinkedList();
        list.insertAtHead(3);
        list.showLinkedList();
        list.insertAtIndex(2,55);
        list.showLinkedList();
        list.deleteAtIndex(2);
        list.showLinkedList();
    }
}

