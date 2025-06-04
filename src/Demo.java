import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author Bidhu Dash
 * @Date 02-06-2025
 */
public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Bidhu", 121);
        map.put("Bhusan", 755);
        map.put("Dash", 528);
        map.put("Bbd", 332);
        map.put("Papun", 198);
        map.put("Kaliya", 565);
        map.put("Bhusan", 744);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
//        list.sort((x, y) -> {
//            int sal = x.getValue().compareTo(y.getValue());
//            if (sal == 0) {
//                return x.getKey().compareTo(y.getKey());
//            }
//            return sal;
//        });

        list.sort(Map.Entry.comparingByValue((x, y) -> y - x));

        Map<String, Integer> sortedList = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> i : list) {
            sortedList.put(i.getKey(), i.getValue());
        }
        //sortedList.forEach((key, value) -> System.out.println(key + "," + value));

        List<Karyakarta> emp = new ArrayList<>();
        emp.add(new Karyakarta("Bidhu", 121.66));
        emp.add(new Karyakarta("Bhusan", 755.30));
        emp.add(new Karyakarta("Dash", 528.76));
        emp.add(new Karyakarta("Bbd", 332.33));
        emp.add(new Karyakarta("Papun", 198.65));
        emp.add(new Karyakarta("Kaliya", 565.31));
        emp.add(new Karyakarta("Bhusan", 744.23));


        Map<Double, String> empMap =
                emp.stream().filter(x-> x.getSalary() > 200).collect(Collectors.toMap(Karyakarta::getSalary, Karyakarta::getName,
                        (s1, s2) -> s2));
        List<Map.Entry<Double, String>> sortedList2 =
                empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Double::compareTo)).toList();
        sortedList2.forEach((x) -> System.out.println(x.getValue() + " , sal " + x.getKey()));

    }
}


class Karyakarta {
    private String name;
    private Double salary;

    public Karyakarta(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}