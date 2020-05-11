package org.buyandfly.service;

import org.buyandfly.dao.IBaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class BaseService<T> implements IBaseService<T> {

    private IBaseDao<T> baseDao;

    @Autowired
    public void setBaseDao(final IBaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    @Transactional
    public T getById(final long id) {
        return baseDao.getById(id);
    }

    @Override
    @Transactional
    public List<T> getAll() {
        return baseDao.getAll();
    }

    @Override
    @Transactional
    public void add(final T t) {
        baseDao.add(t);
    }

    @Override
    @Transactional
    public void edit(final T t) {
        baseDao.edit(t);
    }

    @Override
    @Transactional
    public void delete(final T t) {
        baseDao.delete(t);
    }

}
