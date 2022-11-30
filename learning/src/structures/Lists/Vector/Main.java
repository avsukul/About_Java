package Lists.Vector;

import Lists.ArrayList.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/* Vector is good if you:
    want synchronization for thread safety

  Not good for:
    Don't want synchronization for thread safety

 */
public class Main {

    public static void main(String[] args) {

        List<Lists.ArrayList.Employee> employeeList = new Vector<>();
        employeeList.add(new Lists.ArrayList.Employee("Jane", "Jones", 123));
        employeeList.add(new Lists.ArrayList.Employee("John", "Doe", 4567));
        employeeList.add(new Lists.ArrayList.Employee("Mary", "Smith", 22));
        employeeList.add(new Lists.ArrayList.Employee("Mike", "Wilson", 3245));

     }
}
