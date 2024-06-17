package TopJavaCoding;

import java.util.ArrayList;
import java.util.List;

public class Test14 {
    public static void main(String[] args) {
        List<P> data = new ArrayList<>();

        List<PF> pf1= new ArrayList<>();
        pf1.add(new PF("GE","0.5"));
        pf1.add(new PF("LT","0.6"));
        data.add(new P(pf1,"10"));

        List<PF> pf2= new ArrayList<>();
        pf2.add(new PF("GE","0.6"));
        pf2.add(new PF("LT","0.7"));
        data.add(new P(pf2,"20"));

        double[] input = {0.5,0.66,0.77,0.9};

        for(double i:input){
            System.out.println( i+","+ mapValues(data, i));
        }

    }

    public static String mapValues(List<P> data, double input){
        for(P p : data){
        boolean matches = true;
        for(PF pf: p.pfs){
            double pfValue = Double.parseDouble(pf.value);
            if(pf.value.equals("GE") && input < pfValue){
                matches = false;
                break;
            }
            else if(pf.value.equals("LT") && input >= pfValue) {
                matches = false;
                break;
            }
        }
        if(matches){
            return p.value;
            }
        }
        return "30";
    }
}

class P{
    List<PF> pfs;
    String value;

    P(List<PF> pfs, String value) {
        this.pfs = pfs;
        this.value = value;
    }
}

class PF{
    String criteria;
    String value;

    PF(String criteria, String value) {
        this.criteria = criteria;
        this.value = value;
    }
}