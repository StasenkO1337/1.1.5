package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;


import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        UserDao userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();

        userDaoHibernate.saveUser("Ivan", "Ivanov", (byte) 25);
        userDaoHibernate.saveUser("Petr", "Petrov", (byte) 30);
        userDaoHibernate.saveUser("Sidor", "Sidorov", (byte) 35);
        userDaoHibernate.saveUser("Vasilii", "Fet", (byte) 74);

        userDaoHibernate.removeUserById(2);

        userDaoHibernate.getAllUsers();

        userDaoHibernate.cleanUsersTable();

        userDaoHibernate.dropUsersTable();
    }

}