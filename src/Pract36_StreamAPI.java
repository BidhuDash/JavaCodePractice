import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Pract36_StreamAPI {
    public static void main(String[] args) {

        List<String> ls = Arrays.asList("This","is","a","game");

        Stream<String> strm = Stream.empty();
        Stream<String> strm1 = ls.stream();
        //System.out.println(strm1.toList());

    }

    public static Stream<String> streamOf(List<String> list){
        return list == null || list.isEmpty() ? Stream.empty() : (Stream<String>) list.stream();
    }
}
