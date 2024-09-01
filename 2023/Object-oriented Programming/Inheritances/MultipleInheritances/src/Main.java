public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.travel();

        AnimalEat animalEat = new AnimalEat();
        animalEat.eat();

        AnimalTravel animalTravel = new AnimalTravel();
        animalTravel.travel();

    }
}