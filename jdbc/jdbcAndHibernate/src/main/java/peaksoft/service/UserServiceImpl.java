package peaksoft.service;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoJdbcImpl();

    public void createUsersTable() {
        userDao.createUsersTable();
        System.out.println("Users created!");
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
        System.out.println("Users table dropped!");
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println("User - " + name + " is saved!");
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
        System.out.println("User by id = " + id + " are removed!");
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
        System.out.println("Users table cleaned!");
    }
}
