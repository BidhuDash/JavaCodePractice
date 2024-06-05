package BasicJava;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Pract58_sorting {

    //basic sorting technique using 3rd variable
    public static void sortingTechnique1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp = 0;
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");
        }
    }

    public static List<String> sortingTechnique2(String[] array) {
        List<String> list = new java.util.ArrayList<>(List.of(array));
        // sorting technique2 using list.sort(Comparator.naturalorder())
        list.sort(Comparator.naturalOrder());
        return list;
    }

    public static void sortingTechnique4(){

    }

    public static void main(String[] args) {

        int[] a = {1, 2, 5, 4, 7, 4, 8, 9, 10};
        sortingTechnique1(a); //basic sorting

        String[] ab = {"Bidhu", "Bhusan", "Dash"};
        System.out.println(sortingTechnique2(ab));

        List<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee(1L, "Bidhu", "Dash", 44,"Mech"));
        emplist.add(new Employee(4L, "Fenniz", "Matt", 13,"Elec"));
        emplist.add(new Employee(7L, "Jester", "Dominic", 23,"Elec"));
        emplist.add(new Employee(11L, "Lizo", "Puretto", 29,"Mech"));
        emplist.add(new Employee(50L, "Bosco", "Locosta", 48,"Mech"));
        emplist.add(new Employee(22L, "Zebra", "Herb", 11,"Socio"));

        // sorting technique3 using list.sort(Comparator.comparing()) step wise comparator
        emplist.sort(Comparator.comparing(Employee::getFname).thenComparing(Employee::getLname).thenComparing(Employee::getAge).thenComparing(Employee::getEmpId));
        emplist.forEach(System.out::println);
        System.out.println("--------------");


        //map Department as key with list of Employees as value  using dept sorting
        Map<String, List<Employee>> mapByDept = emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        mapByDept.forEach((x,y)-> System.out.println(x+","+y));

        //list of emp, id, name ,sal. get name of first 10 employees sorted in ascending order based on salary,
        //having salary greater than 10,000/-

        List<String> emplist2 = emplist.stream().filter(e->e.getAge()>30)
                .sorted(Comparator.comparing(Employee::getAge))
                .limit(10).map(Employee::getFname)
                .toList();

        System.out.println(emplist2);
    }
}


class Employee {
    private Long EmpId;
    private String Fname;
    private String Lname;
    private int age;
    private String Department;

    Employee(Long EmpId, String Fname, String Lname, int age, String dept) {
        super();
        this.EmpId = EmpId;
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
        this.Department = dept;
    }

    public Long getEmpId() {
        return EmpId;
    }

    public void setEmpId(Long empId) {
        EmpId = empId;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", age=" + age +
                ", Department='" + Department + '\'' +
                '}';
    }
}
