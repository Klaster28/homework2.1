public class Main {

    public static void main(String[] args) {
            Human maksim = new Human("Максим", 35, 2022, "Минск", "бренд-менеджер");
            System.out.println("Привет! Меня зовут " + maksim.getName() + ". Мне " + maksim.getAge() + " лет. Я из города " + maksim.getTown() + ". Я родился в " + maksim.yearOfBirth + " году. Я работаю на должности " + maksim.getPost()+ ".  Будем знакомы!");
            Human any = new Human("Аня", 29, 2022, "Москва", "методист образовательных программ");
            System.out.println("Привет! Меня зовут " + any.getName() + ". Мне " + any.getAge() + " лет. Я из города " + any.getTown() + ". Я родилась в " + any.yearOfBirth + " году. Я работаю на должности " + any.getPost()+ ". Будем знакомы!");
            Human katy = new Human("Катя", 28, 2022, "Калининград", "продакт-менеджер");
            System.out.println("Привет! Меня зовут " + katy.getName() + ". Мне " + katy.getAge() + " лет. Я из города " + katy.getTown() + ". Я родилась в " + katy.yearOfBirth + " году. Я работаю на должности " + katy.getPost()+ ". Будем знакомы!");
            Human artem = new Human("Артем", 27, 2022, "Москва", "директор по развитию бизнеса");
            System.out.println("Привет! Меня зовут " + artem.getName() + ". Мне " + artem.getAge() + " лет. Я из города " + artem.getTown() + ". Я родился в " + artem.yearOfBirth + " году.Я работаю на должности " + artem.getPost()+ ".  Будем знакомы!");
        }
    }
