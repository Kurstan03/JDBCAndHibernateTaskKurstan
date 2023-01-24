package peaksoft;

import peaksoft.service.UserService;
import peaksoft.service.UserServiceHibernateImpl;
import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceHibernateImpl();
//        System.out.println(Util.getSession());
                               //save
//        userService.saveUser("Kurstan", "Erkinbaev", (byte) 19);
//        userService.saveUser("Iskhak", "Abduhamitov", (byte) 20);
//        userService.saveUser("Nuradil", "Joldoshov", (byte) 18);
//        userService.saveUser("Altynbek", "Shakirov", (byte) 16);

                                //remove by id
//        userService.removeUserById(1L);

                                 //get all users
//        userService.getAllUsers().forEach(System.out::println);

                                  //clean table
//        userService.cleanUsersTable();

                                  //drop table
//        userService.dropUsersTable();

    }
}
