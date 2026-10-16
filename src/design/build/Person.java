package design.build;

// build 패턴을 적용한 Person 클래스를 설계해 보자
public class Person {

    private String name;
    private String gender;
    private int age;
    private String nationality;

    public Person(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
        this.nationality = builder.nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private String gender;
        private int age;
        private String nationality;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder nationality(String nationality){
            this.nationality = nationality;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
