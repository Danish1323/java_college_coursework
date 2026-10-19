class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barks");
    }
}

class puppy extends Dog{
    void milk(){
        System.out.println("Want to drink milk");
    }
}

public class inheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}

