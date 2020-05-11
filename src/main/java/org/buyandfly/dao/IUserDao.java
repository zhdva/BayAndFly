package org.buyandfly.dao;

import org.buyandfly.model.User;

public interface IUserDao extends IBaseDao<User> {
    User getByLogin(final String login);
}