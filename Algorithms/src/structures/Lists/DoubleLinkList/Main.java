package Lists.DoubleLinkList;


/* Doubly Linklist is good if you have:


   Linklist not good for:


 */
public class Main {


    public static void main(String[] args) {

        EmployeeDoublyLinkList employeeList = new EmployeeDoublyLinkList();
        employeeList.addToFront(new Employee("Jane", "Jones", 123));
        employeeList.addToFront(new Employee("John", "Doe", 4567));
        employeeList.addToFront(new Employee("Mary", "Smith", 22));
        employeeList.addToFront(new Employee("Mike", "Wilson", 3245));

        employeeList.printList();
        System.out.println(employeeList.getSize());

        employeeList.addToEnd(new Employee("Bill", "End", 777));
        employeeList.printList();
        System.out.println(employeeList.getSize());

        employeeList.removeRemoveFromFront();
        employeeList.printList();
        System.out.println(employeeList.getSize());
        employeeList.removeRemoveFromEnd();
        employeeList.printList();
        System.out.println(employeeList.getSize());

    }
}
