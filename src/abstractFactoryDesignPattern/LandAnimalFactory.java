package abstractFactoryDesignPattern;

public class LandAnimalFactory extends AnimalFactory {
    @Override
    public IAnimal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (animalType.equalsIgnoreCase("lion")) {
            return new Lion();
        } else {
            System.out.println("Land animal type not supported: " + animalType);
        }
        return null;
    }
}
