package TopJavaCoding;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;


class Emp {

    private String Name;
    private int age;
    private Long id;

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Emp(String name, int age, Long id) {
        Name = name;
        this.age = age;
        this.id = id;
    }


}
public class Test7 {
    public static void main(String[] args) {

        List<Emp> emp = new ArrayList<>();
        emp.add(new Emp("Bidhu",26,2L));
        emp.add(new Emp("Dash",27,3L));
        emp.add(new Emp("Dash",28,4L));
        emp.add(new Emp("Dash",29,5L));


//        List<Emp> list = emp.stream().filter(x->x.getAge()>27).toList();
//        AtomicReference<String> name = new AtomicReference<>("");
//        AtomicInteger age = new AtomicInteger();
//        list.forEach((x)->{
//            if(x.getAge()==28 && x.getName() == "Dash"){
//                name.set(x.getName());
//                age.set(x.getAge());
//            }
//        });

        System.out.println(emp.stream().collect(Collectors.groupingBy(Emp::getName,Collectors.counting())));

//        System.out.println(name);
//        System.out.println(age);
    }

//    select emp.name, dept.name, emp.sal from dept Inner join on dept  emp.name=dept.name;
//
//    select name, count(statcode) from emp  group by statscode


}
