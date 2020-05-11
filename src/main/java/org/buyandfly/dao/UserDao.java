package org.buyandfly.dao;

import org.buyandfly.model.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User> implements IUserDao {

    UserDao() {
        super(User.class);
    }

    @Override
    public User getByLogin(final String login) {
        Session session = sessionFactory.getCurrentSession();
        String query = "FROM User u WHERE u.login='" + login + "'";
        return (User) session.createQuery(query).list().get(0);
    }

}