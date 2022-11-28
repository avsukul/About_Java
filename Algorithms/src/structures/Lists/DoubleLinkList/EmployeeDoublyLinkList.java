package Lists.DoubleLinkList;

public class EmployeeDoublyLinkList {

    EmployeeNode head;
    EmployeeNode tail;
    int size;


    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if(isEmpty()) { // is list empty
            tail = node;  // adding to empy list so set tail to head
        } else {
            head.setPrev(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if(isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeRemoveFromFront() {
        if(isEmpty()) {
            return null;
        }
        EmployeeNode removeNode = head;

        if(head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrev(null);
        }
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;

    }

    public EmployeeNode removeRemoveFromEnd() {
        if(isEmpty()) {
            return null;
        }
        EmployeeNode removeNode = tail;

        if(tail.getPrev() == null) {
            head = null;
        } else {
            tail.getPrev().setNext(null);
        }
        tail = tail.getPrev();
        size--;
        removeNode.setPrev(null);
        return removeNode;

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode getTail() {
        return tail;
    }

    public void setTail(EmployeeNode tail) {
        this.tail = tail;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
