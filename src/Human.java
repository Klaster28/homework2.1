public class Human {
    String name;

    int yearOfBirth;

    int age;

    String post;

    String town;

    Human(String name, int age, int yearOfBirth, String town, String post) {
        this.name = name;
        this.age = age;
        this.yearOfBirth = 2022 - age;
        this.post = post;
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

    public String getPost() {
        return post;
    }
}
