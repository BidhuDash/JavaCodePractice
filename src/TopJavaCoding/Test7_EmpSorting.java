package TopJavaCoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test7_EmpSorting {

    public static void main(String[] args) {

        List<Emp> emp = new ArrayList<>();
        emp.add(new Emp("Boi", 26, 2L, 201223.44));
        emp.add(new Emp("Song", 27, 3L, 65623.00));
        emp.add(new Emp("Lister", 28, 4L, 542332.65));
        emp.add(new Emp("Dashing", 29, 5L, 23463.54));
        emp.add(new Emp("Toy", 66, 8L, 78425.58));
        emp.add(new Emp("Wolf", 45, 1L, 989226.99));
        emp.add(new Emp("Boat", 789, 6L, 771144.71));
        emp.add(new Emp("Tin", 85, 11L, 325698.98));
        emp.add(new Emp("Rubber", 76, 10L, 892463.45));
        emp.add(new Emp("Light", 999, 55L, 992343.78));


//        List<Emp> list = emp.stream().filter(x->x.getAge()>27).toList();
//        AtomicReference<String> name = new AtomicReference<>("");
//        AtomicInteger age = new AtomicInteger();
//        list.forEach((x)->{
//            if(x.getAge()==28 && x.getName() == "Dash"){
//                name.set(x.getName());
//                age.set(x.getAge());
//            }
//        });
//        System.out.println(age);

        System.out.println(emp.stream().collect(Collectors.groupingBy(Emp::getName, Collectors.counting())));

        // list to get Emp names who are having sal>40000, limit = first 3 employees,
        List<String> filter = emp.stream().filter(x -> x.getSalary() > 40000)
                .sorted(Comparator.comparingDouble(Emp::getSalary)).limit(3).map(Emp::getName).toList();

        System.out.println(filter);
    }

//    select emp.name, dept.name, emp.sal from dept Inner join on dept emp.name=dept.name;
//    
//    select name, count(statcode) from emp  group by statscode


}

class Emp {

    private String Name;
    private int age;
    private Long id;
    private Double salary;

    public Emp(String name, int age, Long id, Double salary) {
        Name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" + "Name='" + Name + '\'' + ", age=" + age + ", id=" + id + ", salary=" + salary + '}';
    }
}
