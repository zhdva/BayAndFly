package org.buyandfly.dao;

import java.util.List;

public interface IDao<T> {
    T getById(final long id);
    List<T> getAll();
    void add(final T t);
    void edit(final T t);
    void delete(final T t);
}