package abstractFactoryDesignPattern;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        AnimalFactory animalFactory = AnimalFactory.createAnimalFactory("land");
        if(Objects.nonNull(animalFactory)) {
            IAnimal animal = animalFactory.getAnimal("dog");
            if (Objects.nonNull(animal)) {
                System.out.println(animal.type());
                System.out.println(animal.speak());
            }
        }
    }
}
