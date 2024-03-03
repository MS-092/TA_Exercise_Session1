public class Main {
    public static void main(String[] args) {

        // Lion implementation
        Lion lion = new Lion("Simba", 5, "Roar!");
        System.out.println("Lion Name: " + lion.getName());
        System.out.println("Lion Age: " + lion.getAge());
        lion.makeSound();

        // Bear implementation
        Bear bear = new Bear("Bruce", 10, "Growl!");
        System.out.println("Bear Name: " + bear.getName());
        System.out.println("Bear Age: " + bear.getAge());
        bear.makeSound();
        bear.hibernate();
    }
}
