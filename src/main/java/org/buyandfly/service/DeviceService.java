package org.buyandfly.service;

import org.buyandfly.dao.IDao;
import org.buyandfly.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DeviceService implements IService<Device> {

    private IDao<Device> deviceDao;

    @Autowired
    public void setDeviceDAO(final IDao<Device> deviceDao) {
        this.deviceDao = deviceDao;
    }

    @Override
    @Transactional
    public Device getById(final long id) {
        return deviceDao.getById(id);
    }

    @Override
    @Transactional
    public List<Device> getAll() {
        return deviceDao.getAll();
    }

    @Override
    @Transactional
    public void add(final Device device) {
        deviceDao.add(device);
    }

    @Override
    @Transactional
    public void edit(final Device device) {
        deviceDao.edit(device);
    }

    @Override
    @Transactional
    public void delete(final Device device) {
        deviceDao.delete(device);
    }

}
