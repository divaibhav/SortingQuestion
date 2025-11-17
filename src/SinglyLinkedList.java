public class SinglyLinkedList {
    private Node head;

    public void insert(int data){
        Node node = new Node(data);

            node.setNext(head);
            head = node;

    }
    public void traverse(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.getData() + "-->");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    public Node getHead() {
        return head;
    }
}
