package TopJavaCoding;

public class T13_EmployeeComparison implements Comparable<T13_EmployeeComparison> {

    private String firstname;
    private String lastname;
    private int age;
    private double salary;

    public T13_EmployeeComparison(String firstname, String lastname, int age, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "T13_EmployeeComparison{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


    // comparison according to salary
//    @Override
//    public int compareTo(T13_EmployeeComparison o) {
//        return Double.compare(this.getSalary(),o.getSalary());
//    }


    @Override
    public int compareTo(T13_EmployeeComparison o) {
        return this.getFirstname().compareTo(o.getFirstname());
    }
}
