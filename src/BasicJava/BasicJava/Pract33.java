package BasicJava.BasicJava;// design a class which can get the area of a rectangle.1

public class Pract33 {
    public int l;
    public int b;

    public int getArea() {
        return this.l * this.b;
    }
}

class test {
    public static void main(String[] args) {
        Pract33 tst = new Pract33();
        tst.l = 10;
        tst.b = 20;
        System.out.println(tst.getArea());
    }
}
