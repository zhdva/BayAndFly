package org.buyandfly.service;

import org.buyandfly.model.User;

public interface IUserService extends IBaseService<User> {
    User getByLogin(final String login);
}