    package TopJavaCoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class T12_Employee {
    public static void main(String[] args) {

        List<Employee> emplst = new ArrayList<>();
        emplst.add(new Employee("Bidhu", 2800.50 ));
        emplst.add(new Employee("Bosko",5489.20));
        emplst.add(new Employee("Don",4320.65));

        emplst.sort(Comparator.comparing(Employee::getSalary));
        emplst.forEach(System.out::println);
    }
}

class Employee{
    private final String name;
    private final double salary;

    public Employee(String name, Double salary){
        this.name= name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public Double getSalary(){
        return salary;
    }
    @Override
    public String toString() {
        return "Name:-"+ name+",Salary:-$"+salary;
    }
}

