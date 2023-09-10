package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Борис");
        User user2 = new User("Антон");
        User user3 = new User("Олег");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Я устал выполнять это задание(");

        user2.sendMessage(user1, "Привет!");
        user2.sendMessage(user1, "Ну ты же хотел стать программистом.");
        user2.sendMessage(user1, "Я верю, что у тебя всё получится!");

        user3.sendMessage(user1, "Здарова!");
        user3.sendMessage(user1, "Ну что.");
        user3.sendMessage(user1, "Прочитал ту книгу, которую я тебе скидывал?");

        user1.sendMessage(user3, "Дороу!");
        user1.sendMessage(user3, "Еще читаю.");
        user1.sendMessage(user3, "Всё никак не могу уделить ей должного временни из-за программирования(");

        user3.sendMessage(user1, "Главное не забрасывай её и все будет ок)");

        MessageDatabase.showDialog(user1, user3);
    }
}
