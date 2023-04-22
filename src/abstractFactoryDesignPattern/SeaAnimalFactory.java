package abstractFactoryDesignPattern;

public class SeaAnimalFactory extends AnimalFactory {
    @Override
    public IAnimal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("shark")) {
            return new Shark();
        } else if (animalType.equalsIgnoreCase("octopus")) {
            return new Octopus();
        } else {
            System.out.println("Sea animal type not supported: " + animalType);
        }
        return null;
    }
}
