package builderDesignBuilder.newExample;

import java.util.List;

public class Human {

    // Mandatory params
    private String name;
    private Integer age;
    private Gender gender;

    // Optional params
    private Caste caste;
    private String nickName;
    private List<String> hobbies;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", caste=" + caste +
                ", nickName='" + nickName + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    public Human(HumanBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.caste = builder.caste;
        this.nickName = builder.nickName;
        this.hobbies = builder.hobbies;
    }

    public static class HumanBuilder {
        private String name;
        private Integer age;
        private Gender gender;
        private Caste caste;
        private String nickName;
        private List<String> hobbies;

        public HumanBuilder(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public HumanBuilder withCaste(Caste caste) {
            this.caste = caste;
            return this;
        }

        public HumanBuilder withNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public HumanBuilder withHobbies(List<String> hobbiesList) {
            this.hobbies = hobbiesList;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }
}
