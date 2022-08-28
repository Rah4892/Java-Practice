package com;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsEmpDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Rahul", 1, 100000, "Airbus");
        Employee emp2 = new Employee("Gaurav", 2, 200000, "Boeing");
        Employee emp3 = new Employee("Ashish", 3, 300000,"Airbus");
        Employee emp4 = new Employee("Mahipal", 4, 400000, "Boeing");
        Employee emp5 = new Employee("Sanjay", 5, 500000, "Airbus");
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        //use streams to update the salary of employees
        list.stream().forEach(x -> x.setEmpSalary(x.getEmpSalary()+10000));
        //System.out.println(list);

        //to filter employees with salary > 300000
        List<Employee> resList =  list.stream()
                .filter(emp -> emp.getEmpSalary()>300000)
                .collect(Collectors.toList());
        //System.out.println(resList);

        //group employees by project title
        Map<String, List<Employee>> empByProject = new HashMap<>();
        empByProject = list.stream()
                .collect(Collectors.groupingBy(Employee::getProjectTitle));
        System.out.println(empByProject);

        //using streams to average salary of employees
        Double averageSalary = list.stream()
                .mapToDouble(employee -> employee.getEmpSalary())
                .average()
                .getAsDouble();
        System.out.println(averageSalary);
    }
}
