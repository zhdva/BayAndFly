package org.buyandfly.service;

import java.util.List;

public interface IService<T> {
    T getById(final int id);
    List<T> getAll();
    void add(final T t);
    void edit(final T t);
    void delete(final T t);
}