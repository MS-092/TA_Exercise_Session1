// Inheritance between Bear and Animal
public class Bear extends Animal {
    private String growlSound;

    // Constructor for the bear
    public Bear(String name, int age, String growlSound) {
        super(name, age); // Calling the superclass constructor
        this.growlSound = growlSound;
    }

    // Overriding the abstract method
    // Implementing its own technique
    @Override
    public void makeSound() {
        System.out.println("Growl: " + growlSound);
    }

    // Additional method that is not present in Animal class, but this subclasses still able to extend the
    // functionality of their own superclasses
    public void hibernate() {
        System.out.println(getName() + " is going into hibernation.");
    }

    // Getter and Setter for growlSound
    public String getGrowlSound() {
        return growlSound;
    }

    public void setGrowlSound(String growlSound) {
        this.growlSound = growlSound;
    }
}
