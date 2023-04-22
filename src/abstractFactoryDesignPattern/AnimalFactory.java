package abstractFactoryDesignPattern;

public abstract class AnimalFactory {
    public abstract IAnimal getAnimal(String animalType);

    public static AnimalFactory createAnimalFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("sea")){
            return new SeaAnimalFactory();
        }else if(factoryType.equalsIgnoreCase("land")){
            return new LandAnimalFactory();
        }else{
            System.out.println("Invalid factoryType: "+factoryType);
            return null;
        }
    }
}
