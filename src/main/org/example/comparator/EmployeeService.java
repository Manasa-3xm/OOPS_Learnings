package org.example.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeService implements Comparator<Employee> {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(44, "maha");
        Employee employee = new Employee(1, "manu");
        Employee employee2 = new Employee(34, "veer");
        employees.add(employee1);
        employees.add(employee);
        employees.add(employee2);
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("Employees sorted by name:");
        employees.forEach(System.out::println);
        employees.sort(Comparator.comparingInt(Employee::getAge));

        System.out.println("Employees sorted by age:");
        employees.forEach(System.out::println);
        System.out.println();

//sequential
        employees.stream().filter(e -> e.getAge() > 40).forEach(System.out::println);
//parallel
        employees.parallelStream().filter(e -> e.getAge() > 40).forEach(System.out::println);
    }

    @Override
    public int compare(Employee o, Employee t1) {
        return Integer.compare(o.getAge(), t1.getAge());
    }


}
