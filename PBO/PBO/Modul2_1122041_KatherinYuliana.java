package PBO;

interface Living {
    int DEAD = 0;
    int ALIVE = 1;
    boolean isAlive();
}

abstract class Hewan implements Living {
    String name;
    int age;
    String food;
    String gender;
    boolean alive;

    public Hewan(String name, int age, String food, String gender) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = true;
    }

    // untuk mencetak suara hewan
    abstract String printSound();

    // untuk menampilkan seluruh atribut hewan
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nFood: " + food + "\nGender: " + gender + "\nAlive: " + alive;
    }

    // untuk menampilkan seluruh data
    abstract String printData();
}

class Cat extends Hewan {
    public Cat(String name, int age, String food, String gender) {
        super(name, age, food, gender);
    }

    // untuk mencetak suara kucing
    @Override
    String printSound() {
        return "Meow";
    }

    // untuk menampilkan seluruh data
    @Override
    String printData() {
        return "Cat\n" + this.toString();
    }

    @Override
    public boolean isAlive() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAlive'");
    }
}

class Dog extends Hewan {
    public Dog(String name, int age, String food, String gender) {
        super(name, age, food, gender);
    }

    // untuk mencetak suara anjing
    @Override
    String printSound() {
        return "Bark";
    }

    // untuk menampilkan seluruh data
    @Override
    String printData() {
        return "Dog\n" + this.toString();
    }

    @Override
    public boolean isAlive() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAlive'");
    }
}

class Duck extends Hewan {
    public Duck(String name, int age, String food, String gender) {
        super(name, age, food, gender);
    }

    // untuk mencetak suara bebek
    @Override
    String printSound() {
        return "Quack";
    }

    // untuk menampilkan seluruh data
    @Override
    String printData() {
        return "Duck\n" + this.toString();
    }

    @Override
    public boolean isAlive() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAlive'");
    }
}

class Horse extends Hewan {
    public Horse(String name, int age, String food, String gender) {
        super(name, age, food, gender);
    }

    // untuk mencetak suara kuda
    @Override
    String printSound() {
        return "Neigh";
    }

    // untuk menampilkan seluruh data
    @Override
    String printData() {
        return "Horse\n" + this.toString();
    }

    @Override
    public boolean isAlive() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAlive'");
    }
}

public class Modul2_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Hewan cat = new Cat("Kitty", 2, "Fish", "Female");
        Hewan dog = new Dog("Buddy", 3, "Meat", "Male");
        Hewan duck = new Duck("Donald", 1, "Bread", "Male");
        Hewan horse = new Horse("Black Beauty", 5, "Hay", "Female");

        System.out.println(cat.printSound());
        System.out.println(cat.printData());
        System.out.println("---------------");
        System.out.println(dog.printSound());
        System.out.println(dog.printData());
        System.out.println("---------------");
        System.out.println(duck.printSound());
        System.out.println(duck.printData());
        System.out.println("---------------");
        System.out.println(horse.printSound());
        System.out.println(horse.printData());
    }
}
