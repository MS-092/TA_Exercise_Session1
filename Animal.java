// Abstract class representing the animal as a base
public abstract class Animal {
    private String name;
    private int age;

    // Base constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method, to be implemented by subclasses
    public abstract void makeSound();
}
