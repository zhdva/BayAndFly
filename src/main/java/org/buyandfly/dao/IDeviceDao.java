package org.buyandfly.dao;

import org.buyandfly.model.Device;

import java.util.List;

public interface IDeviceDao {
    Device getById(final long id);
    List<Device> getAll();
    void add(final Device t);
    void edit(final Device t);
    void delete(final Device t);
}