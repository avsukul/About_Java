package main.week2.structures.Lists.LinkList;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;


    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee); // new node
        node.setNext(head); // new node to point to next node head(prev. node)
        head = node;    // new node is now head node
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
