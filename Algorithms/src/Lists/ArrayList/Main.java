package Lists.ArrayList;

import java.util.ArrayList;
import java.util.List;

/* Arraylist is good if you have:
  random access if you have index
  iteration over items

  Not good for:
  inserting other than at the end
  not good delete / insertion

  It's backed by array so if you have index than operation is done in constant time.

 */
public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(employeeList.get(1));   // done in constant time because array backs an array list.
        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4568));
        employeeList.forEach(employee -> System.out.println(employee + "\n"));

        employeeList.add(3, new Employee("John", "Doe", 4567));
        employeeList.forEach(employee -> System.out.println(employee + "\n"));

        Employee[] employArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)) + "\n");

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
