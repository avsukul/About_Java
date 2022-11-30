package Lists.LinkList;



/* Singly Linklist is good if you have:
   Deleting from front of list is done in constant time because you have reference at the head of the list.
   No shifting involved.

   Linklist not good for:
   Alot of random access. You would have to be traversing the list.

 */
public class Main {

    public static void main(String[] args) {

        EmployeeLinkedList employeeList = new EmployeeLinkedList();
        employeeList.addToFront(new Employee("Jane", "Jones", 123));
        employeeList.addToFront(new Employee("John", "Doe", 4567));
        employeeList.addToFront(new Employee("Mary", "Smith", 22));
        employeeList.addToFront(new Employee("Mike", "Wilson", 3245));

        employeeList.printList();
        System.out.println(employeeList.getSize());
        System.out.println(employeeList.isEmpty());
        employeeList.removeFromFront();
        System.out.println(employeeList.getSize());
        employeeList.printList();
    }
}
