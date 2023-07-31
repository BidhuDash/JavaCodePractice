package BasicJava.BasicJava;

/* This is an example of interface how do interface works.
    Interfaces are just like contracts they have to be implemented anyhow to avoid compile time error */

/* Interface: An interface in Java is a reference type that defines a contract or a set of abstract methods
that a class must implement. It only contains method signatures (without implementations), static final constants,
and default methods (methods with implementations starting from Java 8).*/

public class Pract44_Interface {
    public static void main(String[] args) {

        Animal animal = new Cat();
        Animal animal1 = new Dog();
        Animal an = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("this is called by the calling class makesound");
            }

            @Override
            public void move() {
                System.out.println("this is called by the calling class move method");
            }
        };

        animal.makeSound();
        animal.move();
        animal.display();  // display method overridden from the interface and called the Cat class

        animal1.makeSound();
        animal1.move();
        animal1.display();  // default method called displays the message in Animal interface

        System.out.println("-------------");
        an.makeSound();
        an.display();
        an.move();
        Animal.show();

        Animal.Lion lion = new Cat();  // here we have to create an object reference of the nested interface that
        // will hold the object of the implemented class.
        lion.lionName();

    }
}

interface Animal{

    void makeSound();
    void move();

    default void display(){
        System.out.println("this is default method declared in the interface ");
    }

    static void show(){
        System.out.println("this is a static method call ");
    }

    interface Lion{
        void lionName();
    }
}

class Cat implements Animal, Animal.Lion {
    @Override
    public void makeSound() {
        System.out.println("Meow..Meow..");
    }

    @Override
    public void move() {
        System.out.println("Moves likes a cat");
    }

    @Override
    public void display() {
        System.out.println("This is the display method called by cat class");;
    }

    @Override
    public void lionName() {
        System.out.println("this is an nested interface declared inside an interface");
    }
}

class Dog implements Animal{
    @Override
    public void move() {
        System.out.println("Moves Like a Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Bhoww..Bhoww..");
    }
}
