import java.time.LocalDate;
import java.util.Objects;

public class Human {
    private String name;

    private int yearOfBirth;

    private int age;

    private String post;

    private String town;

    Human(String name, int age, int yearOfBirth, String town,String post){
        if (name == null || town.isEmpty() || town.isBlank()) {
            this.name = " Информация не указана";
        }else {
            this.name = name;
        }

        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }

        this.yearOfBirth = 2022 - age;
        if (post == null || town.isEmpty() || town.isBlank()) {
            this.post = " Информация не указана";
        }else {
            this.post = post;
        }

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

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = " Информация не указана";
        }else {
            this.town = town;
        }

    }


    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

    }

    public String getPost() {
        return post;

    }

}


