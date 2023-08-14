package builderDesignBuilder.newExample;

public class Main {
    public static void main(String[] args) {
        Human shubham = new Human.HumanBuilder("Shubham", 24, Gender.MALE)
                .build();

        System.out.println(shubham);
    }
}
