package TopJavaCoding;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author Bidhu Dash
 * @Date 10-07-2024
 */
public class Test20 {

    public static void main(String[] args) {

        String name = "Bidhu";
        String nama = "Bidhu";
        String name1 = new String("Bidhu");
        System.out.println(name == nama);
        System.out.println(name.equals(nama));
        System.out.println(name.equals(name1));
        System.out.println(name==name1);
    }
}
