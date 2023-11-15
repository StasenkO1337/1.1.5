package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;


public class Main {

    public static void main(String[] args){
        UserDao userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();

        userDaoHibernate.saveUser("a1", "b1", (byte) 1);
        userDaoHibernate.saveUser("a2", "b2", (byte) 2);
        userDaoHibernate.saveUser("a3", "b3", (byte) 3);
        userDaoHibernate.saveUser("a4", "b4", (byte) 4);
        userDaoHibernate.saveUser("a5", "b5", (byte) 5);

        userDaoHibernate.removeUserById(2);

        userDaoHibernate.getAllUsers().forEach(System.out::println);

        userDaoHibernate.cleanUsersTable();

        userDaoHibernate.dropUsersTable();
    }

}