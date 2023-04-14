package Task3;

class Chicken extends Animal implements Edible{

    @Override
    public String sound() {
        return "KAKAAA";
    }

    @Override
    public String howToEat() {
        return "Sandwiched";
    }
}