public class Lion extends Animal {
    private String roarSound;

    public Lion(String name, int age, String roarSound) {
        super(name, age);
        this.roarSound = roarSound;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar: " + roarSound);
    }

    public String getRoarSound() {
        return roarSound;
    }

    public void setRoarSound(String roarSound) {
        this.roarSound = roarSound;
    }
}
