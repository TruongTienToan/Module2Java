package S7_AbstractClass_And_Interface.AnimalAndEdible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Ò ó o";
    }

    @Override
    public String howToEat() {
        return "Có thể chiên hoặc luộc";
    }
}
