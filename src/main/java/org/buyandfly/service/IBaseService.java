package org.buyandfly.service;

import java.util.List;

public interface IBaseService<T> {
    T getById(final long id);
    List<T> getAll();
    void add(final T t);
    void edit(final T t);
    void delete(final T t);
}