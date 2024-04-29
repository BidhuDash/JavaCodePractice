package BasicJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
        emplist.add(new Employee(1L, "Bidhu", "Dash", 44));
        emplist.add(new Employee(4L, "Fenniz", "Matt", 13));
        emplist.add(new Employee(7L, "Jester", "Dominic", 23));
        emplist.add(new Employee(11L, "Lizo", "Puretto", 29));
        emplist.add(new Employee(50L, "Bosco", "Locosta", 48));
        emplist.add(new Employee(22L, "Zebra", "Herb", 11));

        // sorting technique3 using list.sort(Comparator.comparing())
        emplist.sort(Comparator.comparing(Employee::getAge));
        emplist.forEach(System.out::println);

       //    emplist.sort(Comparator.comparing());

    }
}


class Employee {
    private Long EmpId;
    private String Fname;
    private String Lname;
    private int age;

    Employee(Long EmpId, String Fname, String Lname, int age) {
        super();
        this.EmpId = EmpId;
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
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

    @Override
    public String toString() {
        return "Employee{" + "EmpId=" + EmpId + ", Fname='" + Fname + '\'' + ", Lname='" + Lname + '\'' + ", age=" + age + '}';
    }
}
