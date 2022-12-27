package main.week2.structures.Lists.DoubleLinkList;

public class EmployeeNode {

    EmployeeNode next;
    EmployeeNode prev;
    Employee employee;


    public EmployeeNode getPrev() {
        return prev;
    }

    public void setPrev(EmployeeNode prev) {
        this.prev = prev;
    }

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeNode getNext() {
        return next;
    }
    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
