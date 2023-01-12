package S7_AbstractClass_And_Interface.AnimalAndEdible;

public class Chiken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "chip chip";
    }

    @Override
    public String howToEat() {
        return "chiên";
    }
}
