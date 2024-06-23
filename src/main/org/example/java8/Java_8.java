package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java_8 {
    //stream api,functional interface, lambda expression and string joiner
    //try with recources time and date enhanchments ,Optional
    //predicate and request - filter ,map,filter
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, 5555));
        employeeList.add(new Employee(2, 5555));
        employeeList.add(new Employee(3, 555));
        employeeList.add(new Employee(4, 55550));
        employeeList.add(new Employee(5, 67555));
        employeeList.add(new Employee(6, 8755));
        List<Employee> list = employeeList.stream().sorted((o1, o2) -> Math.toIntExact(o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
        List<Employee> first3 = employeeList.stream().sorted((o1, o2) -> Math.toIntExact(o2.getSalary() - o1.getSalary())).limit(3).collect(Collectors.toList());
        List<Employee> skip3 = employeeList.stream().sorted((o1, o2) -> Math.toIntExact(o2.getSalary() - o1.getSalary())).skip(3).collect(Collectors.toList());
        List<Employee> sum = employeeList.stream().sorted((o1, o2) -> Math.toIntExact(o2.getSalary() - o1.getSalary())).distinct().collect(Collectors.toList());

        System.out.println("employee list for salary in desc order" + list);
        System.out.println("employee list for salary in desc order first3" + first3);
        System.out.println("employee list for salary in desc order skip3" + skip3);
        System.out.println("employee list for salary in desc order sum" + sum);

    }


}
