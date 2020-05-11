package org.buyandfly.service;

import org.buyandfly.dao.IDeviceDao;
import org.buyandfly.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DeviceService extends BaseService<Device> implements IDeviceService {

    private IDeviceDao deviceDao;

    @Autowired
    public void setDeviceDAO(final IDeviceDao deviceDao) {
        this.deviceDao = deviceDao;
    }

}
