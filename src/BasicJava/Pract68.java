package BasicJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Bidhu Dash
 * @Date 23-07-2024
 */
public class Pract68 {

    public static void main(String[] args) {

    String a = "01011";
    String[] aa = a.trim().split("");
    StringBuilder str = new StringBuilder();
    //StringBuffer str2 = new StringBuffer();
    int i=0;
    for (int j =i+1;j<aa.length;j++){
        if(aa[i].equals(aa[j])){
            if(aa[i].equals("0")) str.append("1");
            if(aa[i].equals("1")) str.append("0");
        }else str.append(aa[i]);
        i++;
    }
        System.out.println(str);

    }
}
