import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> project1 = Arrays.asList("Bio", "Maths");
        Employee emp1 = new Employee("Rahul", 50000, "Bangalore", project1);
        Employee emp2 = new Employee(null, 50000, "Bangalore", project1);
        Employee emp6 = new Employee(null, 15000, "Mumbai", project1);
        Employee emp3 = new Employee("Pranay", 59000, "Jaipur", project1);
        Employee emp4 = new Employee("Nitin", 25000, "Bangalore", project1);
        Employee emp5 = new Employee("Mayank", 150000, "Hyderabad", null);

        Employee emp7 = new Employee("Subhash", 55000, "Delhi", null);

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);
        System.out.println(list);
        //remove the null entries from the list using streams
        List<Employee> result1 = list.stream().filter(emp->emp.getName() != null).collect(Collectors.toList());
        System.out.println(result1);

        //remove entries with duplicate city names from the list
        Map<String, String> map = list.stream().filter(emp->emp.getName() != null).
                collect(Collectors.toMap(key->key.getName(), val->val.getLocation()));
        System.out.println(map);

        //Get highest salary from the streams
        Employee emp = list.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(emp.getName());

        //Sort the list on the basis of salary
        List<Employee> result3 = list.stream().sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(result3);

        //Get list of all the projects of all the employees
        List<List<String>> projects = list.stream().map(x->x.getProjects()).
                distinct().
                filter(x->x!=null).
                collect(Collectors.toList());
        System.out.println(projects);

    }
}
