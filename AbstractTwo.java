package junePractice;

// Abstract class
public abstract class AbstractTwo {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping");
    }
}

// Dog class
class Dog extends AbstractTwo {
    void makeSound() {
        System.out.println("Woof");
    }
}

// Cat class
class Cat extends AbstractTwo {
    void makeSound() {
        System.out.println("Meow");
    }

// Main class
    public static void main(String[] args) {
        AbstractTwo myDog = new Dog();  // Polymorphism
        myDog.makeSound();              // Outputs "Woof"
        myDog.sleep();                  // Outputs "Sleeping"

        AbstractTwo myCat = new Cat();  // Polymorphism
        myCat.makeSound();              // Outputs "Meow"
        myCat.sleep();                  // Outputs "Sleeping"
    }
}
