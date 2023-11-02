package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;


import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        UserDao userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();

        userDaoHibernate.saveUser("q1", "q2", (byte) 1);
        userDaoHibernate.saveUser("w1", "w2", (byte) 2);
        userDaoHibernate.saveUser("e1", "e2", (byte) 3);
        userDaoHibernate.saveUser("r1", "r2", (byte) 4);
        userDaoHibernate.saveUser("t1", "t2", (byte) 5);

        userDaoHibernate.removeUserById(2);

        userDaoHibernate.getAllUsers();

        userDaoHibernate.cleanUsersTable();

        userDaoHibernate.dropUsersTable();
    }

}