package peaksoft;

import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

//        User-лерге таблица тузуу
          userService.createUsersTable();

//        4 user-ди базага кошуу. Ар бир user базага кошулгандан кийинанын аты -
//        базага кошулду деп консольго чыгуусу керек
        userService.saveUser("Kurstan", "Erkinbaev", (byte) 19);
        userService.saveUser("Iskhak", "Abduhamitov", (byte) 20);
        userService.saveUser("Nuradil", "Joldoshov", (byte) 18);
        userService.saveUser("Altynbek", "Shakirov", (byte) 16);

//        Бардык user-лерди алуу жана консольго чыгаруу, toStringметодун override кылышыныз керек
//        userService.getAllUsers().forEach(System.out::println);

//        Таблицанын маалыматтарын очуруу
//        userService.cleanUsersTable();
//        userService.getAllUsers().forEach(System.out::println);
//        Таблицаны очуруу
//        userService.dropUsersTable();
//        userService.dropUsersTable();
    }
}
