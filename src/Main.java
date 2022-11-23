public class Main {

    public static void main(String[] args) {
            Human maksim = new Human("Максим", 35, 2022, "Минск", "бренд-менеджер");
            Human any = new Human("Аня", 29, 2022, "Москва", "методист образовательных программ");
            Human katy = new Human("Катя", 28, 2022, "Калининград", "продакт-менеджер");
            Human artem = new Human("Артем", 27, 2022,"Москва", "директор по развитию бизнеса");
            Human vladimir = new Human("Владимир", 21, 2022, "Казань", "безработный");

            printInfo(maksim);
            printInfo(any);
            printInfo(katy);
            printInfo(artem);
            printInfo(vladimir);

        }
    private static void printInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.getName() + ". Мне " + human.getAge() + " лет. Я из города " + human.getTown() + ". Я родился в " + human.getYearOfBirth() + " году.Я работаю на должности " + human.getPost()+ ".  Будем знакомы!");
    }

    }
