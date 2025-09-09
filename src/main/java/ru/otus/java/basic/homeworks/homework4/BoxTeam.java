package ru.otus.java.basic.homeworks.homework4;

public class BoxTeam {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("Ivanov", "Ivan", "Ivanovich", 1990, "abc@mail.ru");
        users[1] = new User("Smirnova", "Dasha", "Aleksandrovna", 1960, "ifg@mail.ru");
        users[2] = new User("Petrov", "Valeriy", "Pavlovich", 1978, "hjk@mail.ru");
        users[3] = new User("Tihonov", "Vadim", "Ivanovich", 1965, "123@mail.ru");
        users[4] = new User("Dmitriev", "Marat", "Alekseevich", 1961, "456@mail.ru");
        users[5] = new User("Sinicina", "Mariya", "Ruslanovna", 1999, "789@mail.ru");
        users[6] = new User("Ivanova", "Valerya", "Aleksandrovna", 2000, "100@mail.ru");
        users[7] = new User("Kashapov", "Maksim", "Borisovich", 2001, "987@mail.ru");
        users[8] = new User("Baranova", "Anna", "Aleksandrovna", 2003, "852@mail.ru");
        users[9] = new User("Vasilev", "Evgeniy", "Petovich", 1998, "555@mail.ru");
        for (int i = 0; i < users.length; i++) {
            if (users[i].getYear() < (2025 - 40)) {
                System.out.println(users[i].toString());
            }
        }

        Box box = new Box(5, 7, 15, "green", true);
        System.out.println(box.toString());
        box.setColor("red");
        System.out.println(box.takeItem());
        System.out.println(box.putItem("CAT"));
        System.out.println(box.putItem("DOG"));
        System.out.println(box.takeItem());
        box.close();
        System.out.println(box.putItem("DOG"));
        box.open();
        System.out.println(box.putItem("DOG"));
        System.out.println(box.toString());
    }
}
