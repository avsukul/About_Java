package main.week2.structures.Lists.Vector;

import main.week2.structures.Lists.ArrayList.Employee;

import java.util.List;
import java.util.Vector;

/* Vector is good if you:
    want synchronization for thread safety

  Not good for:
    Don't want synchronization for thread safety

 */
public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

     }
}
