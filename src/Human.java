public class Human {
    String name;

    int yearOfBirth;

    int age;

    String town;

    Human(String name, int age, int yearOfBirth, String town) {
        this.name = name;
        this.age = age;
        this.yearOfBirth = 2022 - age;
        this.town = town;

    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAge() {
        return age;
    }
}
