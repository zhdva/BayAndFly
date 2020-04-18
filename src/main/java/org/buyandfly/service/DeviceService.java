package org.buyandfly.service;

import org.buyandfly.dao.DeviceDao;
import org.buyandfly.model.Device;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class DeviceService implements IService<Device> {

    private DeviceDao deviceDao;

    @Autowired
    public void setDeviceDAO(final DeviceDao deviceDao) {
        this.deviceDao = deviceDao;
    }

    @Override
    @Transactional
    public Device getById(int id) {
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
